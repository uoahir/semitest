package semitest.test.semitest;

import java.util.Objects;

public class Juwhan {
	private int age = 12;
	private double wheight = 200;
	@Override
	public String toString() {
		return "Juwhan [age=" + age + ", wheight=" + wheight + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, wheight);
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
		return age == other.age && Double.doubleToLongBits(wheight) == Double.doubleToLongBits(other.wheight);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWheight() {
		return wheight;
	}
	public void setWheight(double wheight) {
		this.wheight = wheight;
	}
	
	public Juwhan() {
		// TODO Auto-generated constructor stub
	}
	
}
