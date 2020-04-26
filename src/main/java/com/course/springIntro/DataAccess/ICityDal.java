package com.course.springIntro.DataAccess;

import java.util.List;

import com.course.springIntro.Entities.*;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
