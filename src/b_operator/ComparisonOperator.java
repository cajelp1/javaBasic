package b_operator;

public class ComparisonOperator {
	
	public static void main(String[] args){
		
		// <비교연산자>
		// boolean type.
		// 산술연산 후 비교연산 함.
		
		boolean b = 10 < 20 - 15 ;
		System.out.println(b);
		
		b = 10 <= 10.0;
		System.out.println(b);
		b = 65 >= 'B';
		System.out.println(b);
		
		b=10.0f == 10.0;
		System.out.println(b);
		b=10.1f == 10.1;
		System.out.println(b);		
		System.out.printf("%21.20f%n", 10.1f);
		System.out.printf("%21.20f%n", 10.1);		
		
		
		//대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만 
		//등가비교 (==, !=)는 모든 타입을 비교할 수 있다.
		
		
		b = 'A' == 65;
		System.out.println(b);
		b = true != false;
		System.out.println(b);
		
		b = "abc" == "abc";
		System.out.println(b); //같은 스트링 같은 리터럴은 같은 주소를 갖는다.
		b = "abc" == new String("abc"); // new는 새로운 주소를 생성한다. 
		System.out.println(b);
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에 
		//String은 등가비교 연산자로 내용을 비교할 수 없다. 
		
		b= "abc".equals(new String("abc"));
		//equal을 사용하면 String의 내용을 비교할 수 있다. 
		System.out.println(b);
		b = !"abc".equals(new String("abc"));
		//같지 않다의 결과를 얻기 위해서는 !(NOT)을 앞에 붙여준다. 
		
		
		
	}

}
