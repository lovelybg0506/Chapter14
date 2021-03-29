package part01.sec01.exam02;

import java.util.ArrayList;

public class ArrayListExample2_02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // 이동이 많아서 삽입 또는 삭제가 빈번하게 일어나는 데이터에서는 적합하지않다.
		list.add("포도");									// 적합할때 : index로 찾아낼수 있어서 찾는건 빠르다?
		list.add("딸기");
		list.add("복숭아");
		list.add(2,"키위");	// 배열의 3번째칸에 키위를 넣음, 3번째 칸에있던 복숭아가 뒤로 밀림(데이터가 지워지는게아님)
		list.set(0,"오렌지"); // 배열의 1번째칸에 오렌지를 넣음
		list.remove(1);	// 제거 배열의 2번째칸에 딸기를 제거, 3번째칸에있던 키위가 앞으로 당겨짐
		int num=list.size();
		
		for(int cnt=0; cnt<num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
		
	}

}
