import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Book;
import lti.util.HibernateUtil;

public class TestBook {
	@Test
	public void testSaveBook() {
		Session session = HibernateUtil.getSession();

		Transaction txn = session.beginTransaction();
//		Scanner sc = new Scanner(System.in);
//
//		int isbn = Integer.parseInt(sc.nextLine());
//		double price = Double.parseDouble(sc.nextLine());
//		String name = sc.nextLine();
//		String author = sc.nextLine();

		Book alc = new Book(345254, "The Alchemist" ,"Paulo Caehlo" , 350);
//		Book alc = new Book(isbn, name, author, price);
		session.save(alc);
		txn.commit();
	}

	@Test
	public void testGetBook() {
		Session session = HibernateUtil.getSession();
		Book bk = (Book) session.get(Book.class, 1);
		System.out.println(bk);
	}

	@Test
	public void testGetByIsbn() {
		Session session = HibernateUtil.getSession();
		Book bk = (Book) session.bySimpleNaturalId(Book.class).load(345254);

	}
}
