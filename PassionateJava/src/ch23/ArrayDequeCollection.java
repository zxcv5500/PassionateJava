package ch23;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Administrator
 * deque(덱)는 양쪽이 뚤려있는 자료구조형인데 
 * 넣고 빼는 방향을 stack나 que에 맞게 통일하면 stack나 que용도로 활용 가능하다. 
 */
public class ArrayDequeCollection {

	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<>();
		
		// 앞으로 넣고
		deq.offerFirst("1.Box");
		deq.offerFirst("2.Toy");
		deq.offerFirst("3.Robot");
		
		// deq의 내용 확인
		System.out.println(deq.peekLast());
		System.out.println(deq.peekFirst());
		
		// 앞에서 꺼내기
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
	}

}
