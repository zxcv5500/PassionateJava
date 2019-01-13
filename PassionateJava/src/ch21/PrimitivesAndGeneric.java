package ch21;

class Box<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

class PrimitivesAndGeneric {

	public static void main(String[] args) {
		Box<Integer> iBox = new Box<Integer>();
		iBox.set(125);			// 오토박싱 진행
		int num = iBox.get();
		System.out.println(num);
	}

}
