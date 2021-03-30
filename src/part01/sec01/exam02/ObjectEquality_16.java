package part01.sec01.exam02;

class IntNumber extends Object{
	int num;
	
	public IntNumber(int num) {
		this.num=num;
	}

	//Overriding
	/*public boolean equals(Object obj) {
		if(this.num == ((IntNumber)obj).num)
			return true;
		else
			return false;
	}*/

	public boolean isEquals(IntNumber obj) {
		if(this.num == obj.num)
			return true;
		else
			return false;
	}
	
}

public class ObjectEquality_16 {

	public static void main(String[] args) {
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(12);
		IntNumber num3 = new IntNumber(10);
		
		/*
		if(num1.equals(num2))	// 참조변수값을 비교 equals가 Object의 재정의되지않은 메소드이기때문에
			System.out.println("num1과 num2는 동일한 정수");
		else
			System.out.println("num1과 num2는 다른 정수");

		if(num1.equals(num3))
			System.out.println("num1과 num3은 동일한 정수");
		else
			System.out.println("num1과 num3은 다른 정수");
		 */

		if(num1.isEquals(num2))
			System.out.println("num1과 num2는 동일한 정수");
		else
			System.out.println("num1과 num2는 다른 정수");
		
		if(num1.isEquals(num3))
			System.out.println("num1과 num3은 동일한 정수");
		else
			System.out.println("num1과 num3은 다른 정수");
		
	
	}

}
