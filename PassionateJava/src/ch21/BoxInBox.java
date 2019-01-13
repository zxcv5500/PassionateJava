package ch21;

class Box<T> {
	private T ob;
	
	public void set(T t) {
		ob = t;
	}
	
	public T get() {
		return ob;
	}
}

public class BoxInBox {

	public static void main(String[] args) {
		Box<String> sBox = new Box<>();
		sBox.set("I am so happy.");
		
		Box<Box<String>> wBox = new Box<>();
		wBox.set(sBox);
		
		Box<Box<Box<String>>> zBox = new Box<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
	}

}
