package com.course.springIntro.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.course.springIntro.Business.ICityService;
import com.course.springIntro.Entities.City;

@RestController
@RequestMapping("/api/cities")
public class CityController {
	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/list")
	public List<City> getAll() {
		return cityService.getAll();
	}
	
	@GetMapping("/view/{id}")
	public City getAll(@PathVariable int id) {
		return cityService.getByID(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody City city)
	{
		cityService.add(city);
	}

	
	@PostMapping("/update")
	public void update(@RequestBody City city)
	{
		cityService.update(city);
	}

	
	@PostMapping("/delete")
	public void delete(@RequestBody City city)
	{
		cityService.delete(city);
	}
	
	
	
}
