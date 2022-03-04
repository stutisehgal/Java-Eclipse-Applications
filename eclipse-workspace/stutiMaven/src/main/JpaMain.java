package mavenGroup.stutiMaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;





public class JpaMain {



public static void main(String[] args) {
// TODO Auto-generated method stub


EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa1");
EntityManager em = emf.createEntityManager();


Employee e1 = new Employee(100,"John",23);

em.getTransaction().begin();
em.persist(e1);
em.getTransaction().commit();

}



}