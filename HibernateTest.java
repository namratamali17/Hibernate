package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step 1 create obbject of user details class
		UserDetails userdetail=new UserDetails(101,"Namrata",148555,"pune");
		 // step 2create session factory object
		//SessionFactory sessionfactory=new HibernateUtil.getgetSessionFactory();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		//step 3
		Session session =sessionFactory.openSession();
		 //step4;
		session.save(userdetail);
		//step 5
		session.getTransaction().commit();
		//step 6
		System.out.println(userdetail);
		

	}

}
