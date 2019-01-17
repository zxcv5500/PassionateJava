package ch28;

import java.util.function.ToIntBiFunction;
class IBox2 {
	private int n;
	
	public IBox2(int i) { n = i; }
	
	public int larger(IBox2 b) {
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
 * Function<T, U> 타입인 경우이고
 * Stirng에 포함된 s.equal("") 와 같이 첫번째 인자로 전달된 인스턴스 변수T가 두번째 인자로 전달된 변수U를 활용해서 메소드를 사용하는 경우
 * 메소드 참조 방식으로 표시할 수 있다.
 */
class NoObjectMethodRef2 {

	public static void main(String[] args) {
		IBox2 ib1 = new IBox2(5);
		IBox2 ib2 = new IBox2(7);
		
		// 두 상자에 저장된 값 비교하여 더 큰 값 반환
		ToIntBiFunction<IBox2, IBox2> bf = IBox2::larger;
		int bigNum = bf.applyAsInt(ib1, ib2);
		System.out.println(bigNum);
	}

}
