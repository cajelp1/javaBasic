package Z_exam;

public class Exam02 {

	static public void main(String[] args) {
		/*
		
		
		
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
		크 기
		종 류
		1 byte 2 byte 4 byte 8 byte
		논리형 	boolean	1 byte
		문자형 	char	2 byte <<<
		정수형 	byte	1 byte
				short	2 byte
				int		4 byte
				long	8 byte
		실수형	float	4 byte <<<
				double	8 byte
		
		

		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
		(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
		초기화 하는 한 줄의 코드를 적으시오.
		
		long regNo = 9009222000000;
		
		
		
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		int i = 100;
		long l =100L;
		final float PI = 3.14f;
		- 리터럴 : 100, 100L, 3.14f
		- 변수 : i, l
		- 키워드 : int, long, final, float
		- 상수 : PI
		
		
		
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
		a. int
		b. Byte <<<<
		c. double
		d. boolean
		
		
		
		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오류’라고 적으시오.
		System.out.println(“1” + “2”) → ( 12 )
		System.out.println(true + “”) → ( true )
		System.out.println(‘A' + 'B') → ( 131 ) <<<<<
		System.out.println('1' + 2) → ( 51 )
		System.out.println('1' + '2') → ( 99 ) <<
		System.out.println('J' + “ava”) → ( Java ) <<<<<
		System.out.println(true + null) → ( 오류 )
		
		*/
			System.out.println(true + "0");
		
		/*
		
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
		a. if
		b. True <<<<
		c. NULL <<<<
		d. Class <<<<
		e. System <<<<
		
		
		
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
		a. $ystem <<<<<<
		b. channel#5 <<<<<<
		c. 7eleven
		d. If <<<<<<
 ch		e. 자바
		f. new
		g. $MAX_NUM <<<<<<
		h. hello@com
		
		
		
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고르시오)
		*참조형은 4byte. 그러므로, 
		a. int <<<
		b. long
		c. short
		d. float<<<
		e. double
		
		
		
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
ch		a. b = (byte)i; <<<<<
		b. ch = (char)b;
		c. short s = (short)ch;
		d. float f = (float)l; <<<<<
ch		e. i = (int)ch; <<<<
		
		
		
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		
		0~65535
ch. 2byte, 16bit 이기때문에 2의 16승까지만 표현가능. 		
		
		
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
		a. byte b = 256; <<<< 127까지만 됨
		b. char c = ''; <<<< 스페이스가 없음
		c. char answer = 'no'; <<<< 문자 하나만 가능함
ch		d. float f = 3.14<<<<를 넣지 않으면 더블타입. 안 들어감.
ch		e. double d = 1.4e3f; <<<< f는 float값임. <<<<그러나 double이 float보다 크기때문에 가능함..;
		
		
		
		[2-12] 다음 중 main메서드의 선언부로 알맞은 것은? (모두 고르시오)
		a. public static void main(String[] args) <<<<<
		b. public static void main(String args[])
		c. public static void main(String[] arv)
		d. public void static main(String[] args)
		e. static public void main(String[] args) <<<<<
		
		
		
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
		a. boolean - false
		b. char - '\u0000'
ch		c. float - 0.0 <<<<<<이러면 더블타입임.
		d. int - 0
		e. long - 0 <<<<<<
		f. String - ""
		
		
		
		
		*/
	
	}

}
