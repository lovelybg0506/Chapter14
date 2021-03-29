package part01.sec01.exam02;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample3_06 {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		
		Iterator<String> iterator = list.iterator();	// (공식) 
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		for(String str:list)		// 위 while문과 같은걸 출력
			System.out.println(str);

	}

}

/*
	public interface Iterator{
		boolean hasNext();	=> 참조할 다음 요소가 있으면 true, 없으면 false
		Object next(); 		=> 다음 요소를 읽어 온다.
		void remove();		=> 읽어 온 요소를 삭제
		
	}
*/