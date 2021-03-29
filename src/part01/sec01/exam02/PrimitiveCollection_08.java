package part01.sec01.exam02;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimitiveCollection_08 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
			list.add(10); // auto boxing
			list.add(20);
			list.add(30);
		
		Iterator<Integer> itr= list.iterator();
			while(itr.hasNext()) {
				int num=itr.next();	// auto unboxing
				System.out.println(num);
			}
			
	}

}
