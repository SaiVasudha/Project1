package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.StudentDto;

public class StudentDao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

//method for insertion....
public String insertion(StudentDto s)
{
	et.begin();
	em.persist(s);
	et.commit();
	
	return "the values has inserted successfully....";
}

//method for remove...
public String remove(int sid)
{ 
	StudentDto s=em.find(StudentDto.class,sid);
	et.begin();
	em.remove(s);
	et.commit();
	
	return "<h1>the data has deleted successfully..<h1>";
}

//method for fetch based on id...
public StudentDto fetchById(int sid)
{
	StudentDto s=em.find(StudentDto.class,sid);
	return s;
}

//method for fetchall...
public List<StudentDto> fetchAll()
{
	Query q1=em.createQuery("select data from StudentDto data");
	List<StudentDto> list=q1.getResultList();
	
	return list;
}


public String update(StudentDto s)
{ 
	et.begin();
	em.merge(s);
	et.commit();
	
	return "<h1>the data has updated successfully...</h1>";
}

}


