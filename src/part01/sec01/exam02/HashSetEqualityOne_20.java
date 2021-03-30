package part01.sec01.exam02;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber {
	int num;
	
	public SimpleNumber(int n) {
		num=n;
	}
	
	@Override
	public String toString() {
		
		return String.valueOf(num);
		
	}
	
	public int hashCode() {
		return num;
	}
	
	public boolean equals(Object obj) {
		SimpleNumber A = (SimpleNumber)obj;
		if(A.num==num)
			return true;
		else
			return false;
	}
	
}

public class HashSetEqualityOne_20 {

	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(20));
		
		System.out.println("저장된 데이터 수: "+hSet.size());
		
		System.out.println(hSet);
		
		Iterator<SimpleNumber> itr= hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
