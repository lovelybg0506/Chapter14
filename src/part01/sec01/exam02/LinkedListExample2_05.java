package part01.sec01.exam02;

import java.util.LinkedList;

public class LinkedListExample2_05 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위");
		list.set(0, "오렌지");
		list.remove(1);
		int num = list.size();

		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}

	}

}
