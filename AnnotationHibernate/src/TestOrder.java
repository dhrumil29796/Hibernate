import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Order;
import lti.util.HibernateUtil;

public class TestOrder {
	@Test
	public void testOrders() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Order o=new Order();
		o.setId(100);
		o.setOrderDate(new Date());
		o.setAmount(1000);
		o.setPromoCode("xynwdj122");
		
		session.save(o);
		tx.commit();
		
	}
}