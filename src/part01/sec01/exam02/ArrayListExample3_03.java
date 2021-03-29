package part01.sec01.exam02;

import java.util.ArrayList;

public class ArrayListExample3_03 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("머루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과");
		int index1=list.indexOf("사과");	// list 배열의 처음으로나오는 사과의 순서는 몇번인가?
		int index2=list.lastIndexOf("사과");	// list 배열의 마지막순서 사과는 몇번인가?
		System.out.println("첫번째 사과: "+index1);
		System.out.println("마지막 사과: "+index2);

	}

}
