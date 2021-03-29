package part01.sec01.exam02;

class Name_ {
	String firstName;
	String lastName;

	Name_(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

public class HashCodeExample2_15 {

	public static void main(String[] args) {
		Name_ obj1 = new Name_("헤르미온느","그레인져");
		Name_ obj2 = new Name_("헤르미온느","그레인져");
		
		int hash1=obj1.hashCode();	// 둘 이상의 스트링값을 넣게되면 같은 문자열이지만 다른 해쉬코드값이나온다.
		int hash2=obj2.hashCode();
	
		System.out.println(hash1);
		System.out.println(hash2);
	
	}

}
