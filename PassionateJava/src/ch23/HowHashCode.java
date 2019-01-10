package ch23;

import java.util.HashSet;

class Car {
	private String model;
	private String color;
	
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return model + " : " + color;
	}
	
	@Override
	public int hashCode() {
		return (model.hashCode() + color.hashCode()) / 2;
	}
	/*
	@Override
	public int hashCode() {
		return java.util.Objects.hash(model, color);
	}
	*/

	@Override
	public boolean equals(Object obj) {
		String m = ((Car) obj).model;
		String c = ((Car) obj).color;
		
		if (model.equals(m) && color.equals(c))
			return true;
		else
			return false;
	}
}

class HowHashCode {

	public static void main(String[] args) {
		HashSet<Car> set = new HashSet<>();
		set.add(new Car("HY-MD-301", "RED"));
		set.add(new Car("HY-MD-301", "BLACK"));
		set.add(new Car("HY-MD-302", "RED"));
		set.add(new Car("HY-MD-302", "WHITE"));
		set.add(new Car("HY-MD-301", "BLACK"));
		
		System.out.println("인스턴스 수 : " + set.size());
		
		for (Car car : set) {
			System.out.println(car.toString() + "\t");
		}
	}

}
