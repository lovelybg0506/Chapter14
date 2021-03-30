package part01.sec01.exam02;

import java.util.HashSet;

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && age == tmp.age;	// 중복된 데이터값 한번만 출력
		}else
			return false;
		
	}
	
	public int hashCode() {
		return name.hashCode()+age;
	}
	
	public String toString() {	// 원래 Object클래스의 toString은 (재정의전) 해쉬코드값을 리턴해준다.
		return name + ":" + age;	// 이런식으로 재정의를하면 해쉬코드값이 아닌 입력받은 name과 age값을 리턴한다.
	}
	
}


public class HashSetEx3_19 {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
//		set.add("abc");	// 동일문자열, 중복저장 X
//		set.add("abc");
//		set.add(new Person("David",10));
//		set.add(new Person("David",10));

		set.add(new String("abc"));	// 문자열이 같으면 새로운 객체를 만들었다 하더라도 새로운 주소가 만들어지는게 아니고 
		set.add(new String("abc"));	// 같은 값이 1번만 나온다.
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);
		/*
		System.out.println("=================================================");
		String st = new String("abcd");
		System.out.println("st:"+st);
		String st2 = new String("abcd");
		System.out.println("st2:"+st2);
		
		if(st == st2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(st.equals(st2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}*/
	}

}
