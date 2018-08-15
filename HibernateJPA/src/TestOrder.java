import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestOrder {
	@Test
	public void TestCase1() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();
		
		Order order = new Order();
		order.setId(1);
		order.setOrderDate(new Date());
		order.setPromoCode("Sarthak");
		order.setAmount(100);
		
		session.save(order);
		txn.commit();
		

	}
}
