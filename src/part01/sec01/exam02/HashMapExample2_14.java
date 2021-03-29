package part01.sec01.exam02;

import java.util.HashMap;

class Name extends Object {
	String firstName;
	String lastName;

	Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
//
//	// overriding
//	public int hashCode() {
//		return firstName.hashCode() + lastName.hashCode(); // 이름과 성의 해쉬코드를 더해서 하나의 숫자로만들도록 재정의.
//	}
//	
//	public boolean equals(Object obj) {
//		if(!(obj instanceof Name))// instanceof 형변환 가능한가?
//			return false;
//		Name name=(Name)obj;
//		if(firstName.equals(name.firstName) && lastName.equals(name.lastName))
//			return true;
//		else
//			return false;
//	}
}

public class HashMapExample2_14 {
	public static void main(String[] args) {
		HashMap<Name, Integer> hashtable = new HashMap<Name, Integer>();
		hashtable.put(new Name("해리", "포터"), new Integer(95));
		hashtable.put(new Name("헤르미온느", "그레인져"), new Integer(100));
		hashtable.put(new Name("론", "위즐리"), new Integer(85));
		hashtable.put(new Name("드레이코", "말포이"), new Integer(93));
		hashtable.put(new Name("네빌", "롱버텀"), new Integer(70));

		Integer num = hashtable.get(new Name("헤르미온느", "그레인져"));
		System.out.println("헤르미온느 그레인져의 성적: " + num);

	}
}

/*
 * Name클래스가 Object클래스 로부터 상속받은 hashCode메소드를 그대로 사용 Name클래스가 해쉬테이블의 키로 사용하기에 부족
 */
