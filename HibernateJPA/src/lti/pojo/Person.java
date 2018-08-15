package lti.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
	@EmbeddedId
	private Person.Id id;
	private String name;
	private int age;

	@Embeddable
	public static class Id implements Serializable {
		private String country;
		@Column(name="medicare_number")
		private int medicareNumber;

		public Id() {
		}

		public Id(String country, int medicareNumber) {
			this.country = country;
			this.medicareNumber = medicareNumber;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getMedicareNumber() {
			return medicareNumber;
		}

		public void setMedicareNumber(int medicareNumber) {
			this.medicareNumber = medicareNumber;
		}

	}

	public Person() {
	}

	public Person(Id id, String name, int age) {
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
		return "Person [id=" +id+ ",name="+name+ "age= "+age+"]";
	}

}
