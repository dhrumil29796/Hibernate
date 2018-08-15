package FeedForum.pojos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "users_jpa1")
public class User {
	@Id
	private String userId;
	private String password;
	private String email;
	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<Feed> feed = new HashSet<Feed>();// OneToMany
	
//	private Set<Comment> comment = new HashSet<Comment>();
//
//	
//	public Set<Comment> getComment() {
//		return comment;
//	}
//
//	public void setComment(Set<Comment> comment) {
//		this.comment = comment;
//	}

	

	public String getPassword() {
		return password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Feed> getFeed() {
		return feed;
	}

	public void setFeed(Set<Feed> feed) {
		this.feed = feed;
	}

}
