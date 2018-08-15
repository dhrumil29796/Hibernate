import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Comment;
import lti.pojo.Feed;
import lti.pojo.User;
import lti.util.HibernateUtil;

public class TestForum {

	@Test
	public void test1() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();
		
		User user = new User();
		user.setUserId("deep80");
		user.setPassword("deep");
		user.setEmail("deep80@gmail.com");
		
		Feed feed = new Feed();
		feed.setFeedId(6);
		feed.setQuestion("Kya Sarthak chutya hai?");
		feed.setUser(user);
		feed.setTimestamp(new Timestamp(2018, 07, 12, 05, 05, 40, 0));

		
		
		Comment comment = new Comment();
		comment.setCommentId(2);
		comment.setComment("Nai hai");
		comment.setFeed(feed);
		comment.setUser(user);
		comment.setTimestamp(new Timestamp(2018, 07, 12, 05, 05, 40, 0));
		
		session.save(user);
		session.save(feed);
		session.save(comment);
		txn.commit();
	}
	
	
}
