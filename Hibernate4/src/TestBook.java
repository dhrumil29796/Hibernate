
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Book;
import lti.util.HibernateUtil;

public class TestBook {
	@Test
	public void testSaveBook() {
		Session session = HibernateUtil.getSession();
		Transaction txns = session.getTransaction();
		txns.begin();// mandatory for dml transaction
		Book b = new Book(3456, "HarryPotter", "ViralSavla", 500);
		session.save(b);
		txns.commit();
	}

	@Test
	public void testGetBook() { // fetching records so no transaction required but if table has
		// relationship it may ask for transaction

		Session session = HibernateUtil.getSession();
		Book bk = (Book) session.get(Book.class, 1);
		System.out.println(bk);
	}

	@Test
	public void testGetByIsbn() {
		Session session = HibernateUtil.getSession();
		Book bk = (Book) session.bySimpleNaturalId(Book.class).load(3456);
		System.out.println(bk);
	}

}
