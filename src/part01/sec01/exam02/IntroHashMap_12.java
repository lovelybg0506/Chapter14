package part01.sec01.exam02;

import java.util.HashMap;

public class IntroHashMap_12 {

	public static void main(String[] args) {
		HashMap<Integer,String> hMap = new HashMap<Integer,String>(); // Key값이 Integer , data값이 String
		hMap.put(new Integer(3) , "나삼번"); // boxing
		hMap.put(5,"윤오번");	// auto boxing
		hMap.put(8,"박팔번");

		System.out.println("6학년 3반 8번 학생:"+hMap.get(new Integer(8)));
		System.out.println("6학년 3반 5번 학생:"+hMap.get(5));
		System.out.println("6학년 3반 3번 학생:"+hMap.get(3));
		
		hMap.remove(5);
		System.out.println("6학년 3반 5번 학생"+ hMap.get(5));
		
	}

}
