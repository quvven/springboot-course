package com.course.springIntro.Business;

import java.util.List;

import com.course.springIntro.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getByID(int id);
}
