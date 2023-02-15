package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student;

public class Tester2 {
	
EntityManagerFactory emfEntityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager emEntityManager=emfEntityManagerFactory.createEntityManager();
EntityTransaction etEntityTransaction=emEntityManager.getTransaction();

//public void insert(Student std)
//{
//	etEntityTransaction.begin();
//	emEntityManager.persist(std);
//	etEntityTransaction.commit();
//}


public void update(int stdid,String stdname)
{
	Student e=emEntityManager.find(Student .class,stdid);
	e.setStdname(stdname);
	etEntityTransaction.begin();
	emEntityManager.merge(e);
	etEntityTransaction.commit();
}
}
