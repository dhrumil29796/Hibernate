import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Person;
import lti.util.HibernateUtil;

public class TestPerson {
	@Test
	public void testSavePerson() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Person p = new Person(new Person.Id("India",12345), "Polo" ,21);
		session.save(p);
		
		tx.commit();
	}
}
