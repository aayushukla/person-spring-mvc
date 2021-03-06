package com.capgemini.spring.mvc.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.mvc.model.entity.Person;

@Repository
public class PersonDaoImpl implements PersonDAO {

	@Autowired
	public JdbcTemplate template;
	
	@Override
	public void addNew(Person person) {
		template.update("INSERT INTO persons VALUES(?,?)",
				new Object[] {person.getPersonId(),person.getPersonName()});

	}

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int personId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person getPerson(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

}
