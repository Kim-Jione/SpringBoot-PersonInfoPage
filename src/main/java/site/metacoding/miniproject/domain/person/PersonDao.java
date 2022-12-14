package site.metacoding.miniproject.domain.person;

import java.util.List;

import site.metacoding.miniproject.web.dto.response.PersonInfoDto;


public interface PersonDao {
	public void insert(Person person);
	public List<PersonInfoDto> findById(Integer personId);
	public List<Person> findAll();
	public void update(Person person); //dto생각
	public void deleteById(Integer personId);
}