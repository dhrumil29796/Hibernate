
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import FeedForum.pojos.Comment;
import FeedForum.pojos.Feed;
import FeedForum.pojos.User;
import lti.pojo.one2many.Department;
import lti.pojo.one2many.Employee;
import lti.util.HibernateUtil;

public class TestRun {
	@Test
	public void test1() {

		Session session = HibernateUtil.getSession();
		Transaction txns = session.beginTransaction();

		User u = new User();
		u.setUserId("12346");
		u.setEmail("dhrumil@gmail.com");
		u.setPassword("964542");

		session.save(u);
		txns.commit();
	}

	@Test
	public void testCase2() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		User u = (User) session.get(User.class, Integer.parseInt("12346"));
		Feed feed = new Feed();
		feed.setFeedId("987684");
		feed.setFeedDate(new Date());
		feed.setQuestion("What is a smartphone?");
		session.save(feed);
		tx.commit();
	}

	@Test
	public void testCase3() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Feed feed = (Feed) session.get(Feed.class, Integer.parseInt("987684"));
		User user = (User) session.get(User.class, Integer.parseInt("12346"));
		Comment comment = new Comment();
		comment.setCommentId("12389");
		comment.setComment("Smartphone is a phone");

		comment.setCommentDate(new Date());
		session.save(comment);
		tx.commit();
	}
}
