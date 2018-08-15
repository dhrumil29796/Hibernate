package lti.pojo.many2many;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;
public class TestExample {
	@Test
	public void addCustomers() 
	{
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Customer c1 = new Customer();
		c1.setName("Majrul");
		Customer c2 = new Customer();
		c2.setName("Vishal");
		session.save(c1);
		session.save(c2);
		tx.commit();
	}

	@Test
	public void addCategories() 
	{
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			Category c = new Category();
			c.setName("Mobiles");
			session.save(c);
			c = new Category();
			c.setName("Laptops");
			session.save(c);
			tx.commit();
	}
	
	@Test
	public void addItems() {
			Session session = HibernateUtil.getSession();
			Transaction tx = session.beginTransaction();
			Item i = new Item();
			i.setName("Nokia 6600");
			i.setInitialPrice(4500);
			session.save(i);
			i = new Item();
			i.setName("Apple Macbook");
			i.setInitialPrice(55000);
			session.save(i);
			tx.commit();
	}
	
	@Test
	public void linkItemToCategory() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Category c = (Category) session.get(Category.class, 1); //Mobiles category
		Item i = (Item) session.get(Item.class, 1); //Nokia mobile phone
		//make sure item-categories association is lazy=false
		i.getCategories().add(c);
		session.update(i);
		tx.commit();
	}
	
	@Test
	public void placeABid() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Customer c = (Customer) session.get(Customer.class, 1); //Majrul
		Item i = (Item) session.get(Item.class, 1); //Nokia mobile phone
		Bid b = new Bid();
		b.setAmount(5000);
		b.setCustomer(c);
		b.setItem(i);
		session.save(b);
		tx.commit();
	}
}
