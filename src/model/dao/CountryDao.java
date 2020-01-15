package model.dao;

import java.util.List;

import model.entities.Country;

public interface CountryDao {

	void insert(Country obj);

	void update(Country obj);

	void deleteById(Integer id);

	Country findByName(String name);
	
	Country findById(Integer id);

	List<Country> findAll();

}
