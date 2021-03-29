package part01.sec01.exam02;

public class HashCodeExample1_13 {

	public static void main(String[] args) {
		String obj1 = new String("헤르미온느");
		String obj2 = new String("헤르미온느");
		
		System.out.println(obj1);	// String type 참조변수의 값은 실제 저장되어있는 값.
		System.out.println(obj2);
		
		int hash1=obj1.hashCode();	// "헤르미온느"라는 문자열에 대한 값을 숫자열로 바꿔주는것이 hashcode.
		int hash2=obj2.hashCode();	// hashtable 에 저장된 문자열로되어있는 key값이 이 hashcode값 으로 대조되며 일치하는것이 data값으로 나온다?
		
		System.out.println(hash1);
		System.out.println(hash2);
		
	}

}
/*
	hashCode 메소드는 Object클래스에 선언되어 있는 메소드이다.
	키 값에 대해 hashCode메소드를 호출한다.
*/