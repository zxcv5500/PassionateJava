package ch20;

class INum {
	private int num;
	public INum(int num) {
		this.num = num;
	}
	
	//* ArrayObjEquals2 에서 equals 메소드를 재정의 해서 쓸 떼 사용하는 코드
	@Override
	public boolean equals(Object obj) {
		if (this.num == ((INum) obj).num)
			return true;
		else {
			return false;	
		}		
	}
	//*/
}