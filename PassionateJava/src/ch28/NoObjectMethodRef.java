package ch28;

import java.util.function.ToIntBiFunction;

class IBox {
	private int n;
	
	public IBox(int i) { n = i; }
	
	public int larger(IBox b) {
		if (n > b.n)
			return n;
		else
			return b.n;
	}
}

/**
 * @author Administrator
 * 인스턴스 메소드 참조2: 인스턴스 없이 인스턴스 메소드 참조
 * 약속에 근거한 줄인 표현
 * Stirng에 포함된 s.equal("") 와 같이 첫번째 인자로 전달된 인스턴스 변수가 두번째 인자로 전달된 변수를 활용해서 메소드를 사용하는 경우
 * 메소드 참조 방식으로 표시할 수 있다.
 */
class NoObjectMethodRef {

	public static void main(String[] args) {
		IBox ib1 = new IBox(5);
		IBox ib2 = new IBox(7);
		
		// Function<T, U>타입 일 경우 두 상자에 저장된 값 비교하여 더 큰 값 반환
		ToIntBiFunction<IBox, IBox> bf = (b1, b2) -> b1.larger(b2);
		int bigNum = bf.applyAsInt(ib1, ib2);
		System.out.println(bigNum);
	}

}
