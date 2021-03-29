package part01.sec01.exam02;

import java.util.LinkedList;

public class LinkedListExample1_04 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();	// 링크리스트는 데이터끼리 떨어져있다. 주소값끼리연결돼있음.
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		int num=list.size();
		for(int cnt = 0;cnt<num;cnt++) {
			String str= list.get(cnt);	// 구조는 다르지만 배열처럼 인덱스로 접근
			System.out.println(str);	// ArrayList는 중간 값이 삭제되면 데이터들이 이동,
		}								// LinkedList는 중간 값이 삭제되어도 데이터들 이동없음. *데이터 삽입,삭제에 유리하다.
		
	}

}
