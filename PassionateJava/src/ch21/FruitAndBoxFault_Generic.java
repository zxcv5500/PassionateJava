package ch21;

class Apple {
    public String toString() {
        return "I am an apple.";
    }    
}

class Orange {
    public String toString() {
        return "I am an orange.";
    }
}

class Box<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

class FruitAndBoxFault_Generic {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();			// T를 Apple로 결정
		Box<Orange> oBox = new Box<Orange>();		// T를 Orange로 결정
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		
	}

}
