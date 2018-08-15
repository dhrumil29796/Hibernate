package lti.pojo;

import java.io.Serializable;

public class Person {
	private Person.Id id;
	private String name;
	private int age;

	public static class Id implements Serializable {
		private String country;
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
		return "Person[id= "+id+",Name= "+name+",Age= "+age+"]";
	}
	
}
