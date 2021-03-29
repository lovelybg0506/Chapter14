package part01.sec01.exam02;

import java.util.ArrayList;

public class ArrayListExample1_01 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add("복숭아");

		int num = list.size();	// ArrayList의 갯수를 리턴한다
		System.out.println(num);
		
		for(int cnt=0; cnt<num; cnt++) {
			String str=list.get(cnt); //get(알고싶은 배열번호) 특정 인덱스의 값을 추출할 수 있다
			System.out.println(str);
		}
		
	}

}
