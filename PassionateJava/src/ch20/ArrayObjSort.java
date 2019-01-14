package ch20;

import java.util.Arrays;

class Person implements Comparable {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		
		/*// 기본 예제 코드
		Person p = (Person) o;
		if (this.age > p.age)
			return 1;		// 인자로 전달된 o가 작다면 양의 정수 반환
		else if (this.age < p.age)
			return -1;		// 인자로 전달된 o가 크다면 음의 정수 반환
		else
			return 0;		// 인자로 전달된 o와 같다면 0을 반환
		//*/
		
		/*// 문제20-2 1번 문제 코드
		Person p = (Person) o;
		return -(this.age - p.age);
		//*/
		//*// 문제20-2 2번 문제 코드
		Person p = (Person) o;
		return this.name.length() - p.name.length();
		//*/
		
	}
	
	@Override
	public String toString() {	
		return name + " : " + age;
	}
	
}

class ArrayObjSort {

	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Lee", 29);
		ar[1] = new Person("Goo", 15);
		ar[2] = new Person("Soo", 37);
		
		Arrays.sort(ar);
		for (Person p : ar)
			System.out.println(p);
	}

}
