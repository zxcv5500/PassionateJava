package ch23;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		
		// que 저장 확인 꺼내기 방법1 실패시 예외를 발생시킴
		que.add("Rabbit");	// 저장하기
		que.element();		// 확인하기
		que.remove();		// 꺼내기
		
		// que 저장 확인 꺼내기 방법2 실패시 상태를 값으로 알려줌 false나 null로 반환해서 알려줌
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");
		
		System.out.println("que에 저장된 갯수 : " + que.size());
		
		// 무엇이 다음에 나올지 확인
		System.out.println("next : " + que.peek());
		
		// 첫 번째, 두번째 인스턴스 꺼내기
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		// 무엇이 다음에 나올 지 확인
		System.out.println("next: " + que.peek());
		
		// 마지막 인스턴스 꺼내기
		System.out.println(que.poll());
		
		System.out.println(que.size());
		
	}

}
