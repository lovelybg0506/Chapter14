package part01.sec01.exam02;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample1_17 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		System.out.println("저장된 데이터의 수 = " + set.size());

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);

		}
	}

}

/*
 * HashSet클래스는 내부에 있는 해쉬 테이블에 데이터를 저장한다. 데이터의 저장순서를 유지하지않는다 데이터의 중복저장을 허용하지 않는다.
 * 집합에 있는 데이터에는 순서가 없다. 따라서 HashSet에 있는 데이터를 순서대로 읽어오거나 특정위치의 데이터를 읽어 올 수 있는 방법은
 * 없다. 하지만 집합에 있는 데이터를 모두 읽어 올 수 있는 방법은 있다. Iterator 사용
 */
