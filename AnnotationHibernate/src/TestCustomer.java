import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Customer;
import lti.util.HibernateUtil;

public class TestCustomer {
	@Test
	public void testSaveCustomer() {
		Session session = HibernateUtil.getSession();
		Transaction txns = session.getTransaction(); // mandatory for dml transaction
		try {
			txns.begin(); // starting db transaction
			Customer c = new Customer();
			c.setCustName("Shah Dhrumil");
			c.setCreditLimit(9000);
			session.save(c); // saving customer object
			txns.commit(); // ending transaction with commit
		} catch (Exception e) {
			txns.rollback(); // transaction failed hence rollback
			e.printStackTrace();
		}
	}

	@Test
	public void testGetCustomer() { // fetching records so no transaction required but if table has
									// relationship it may ask for transaction

		Session session = HibernateUtil.getSession();
		Customer cust = (Customer) session.get(Customer.class, 2);
		System.out.println("Name :" + cust.getCustName());
	}

}
