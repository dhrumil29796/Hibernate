package lti.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {
	@EmbeddedId
	private Person.Id id;
	private String name;
	private int age;

	@Embeddable //if embeddedid is used
	public static class Id implements Serializable {
		private String country;
		@Column(name="medicare_number")
		private int medicarenumber;

		public Id() {
		}

		public Id(String country, int medicarenumber) {
			super();
			this.country = country;
			this.medicarenumber = medicarenumber;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getMedicarenumber() {
			return medicarenumber;
		}

		public void setMedicarenumber(int medicarenumber) {
			this.medicarenumber = medicarenumber;
		}

	}

	public Person() {
	}

	public Person(Id id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person.Id getId() {
		return id;
	}

	public void setId(Person.Id id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person[id= " + id + ",Name= " + name + ",Age= " + age + "]";
	}

}
