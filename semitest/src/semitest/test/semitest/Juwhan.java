package semitest.test.semitest;

import java.util.Objects;

public class Juwhan {
	private String name = "김주환";
	private int age = 25;
	private double height = 183.4;
	
	public Juwhan() {
		// TODO Auto-generated constructor stub
	}

	public Juwhan(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Juwhan [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, height, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juwhan other = (Juwhan) obj;
		return age == other.age && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name);
	}
	
}
