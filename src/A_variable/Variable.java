package A_variable;

public class Variable {

	public static void main(String[] args) {	
		/* <변수>
		 * 하나의 데이터를 저장할 수 있는 메모리상의 공간. 
		 * 이 데이터는 메모리, 램 에 있는 공간에 저장된다.
		 * 
		 * <사용 가능한 '기본형' 데이터의 종류>
		 * - 정수 : byte, short, int, long
		 * - 실수 : float, double (정확도를 위해 큰 크기를 사용. float 보다 double 을 쓴다.)
		 * - 문자 : char
		 * - 논리 : boolean (참, 거짓을 구분)
		 *p.29
		 *
		 * - byte는 8개의 bit로 이루어져있다. 
		 * - 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지, 
		 *   그것의 이름은 무엇인지 알려줘야 한다.
		 * - 명령규칙 p.25~26
		 */
		
		//변수 선언 방법 : 데이터 타입 + 변수 이름
		//모든 기본형 타입을 사용하는 8개의 변수를 선언해주세요.
		
		byte bye;
		short shorta;
		int inte;
		long tong;
		char chara;
		float floor;
		double dooble;
		boolean booboo;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
		//System.out.println(bye); 문법이 틀려서 컴파일 에러.
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
		
		//=(대입연산자) : 대입연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		bye = 127; //타입에 맞는 값을 저장해야한다.
		shorta = 30000;
		inte = 20;
		tong = 900L; //long 접미사 : L. 소문자 l은 1과 헷갈릴 수 있기에 대문자로.
		floor = 3.14f; //float 접미사 : f
		dooble = 3.14; //double 접미사 : d (생략가능)
		chara ='가'; //문자를 표현할 때는 따옴표로 묶음. 문자 하나만 표현 가능.
		booboo = true;
		// 초기화 : 변수에 처음으로 값을 저장하는 것.
		
		System.out.println(inte);
		//ctrl + f11 : 프로그램 실행
		//f11 : 프로그램을 디버그 모드로 실행
		
		inte = 30;
		System.out.println(inte);
		inte = 30 + 40;
		System.out.println(inte);
		inte = shorta;
		System.out.println(inte);
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		
		bye = 111;
		shorta = 22222;
		inte = 6879;
		tong = 1991919L;
		floor = 445f;
		dooble = 4.4;
		chara = 'e';		
		booboo = false;
		
		System.out.println(bye);	
		System.out.println(shorta);
		System.out.println(inte);
		System.out.println(tong);
		System.out.println(floor);
		System.out.println(dooble);
		System.out.println(chara);
		System.out.println(booboo);
		
		//문자열을 표현하기 위한 타입이 있다. 다만 기본형은 아님. string이라는 타입을 쓴다.
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""(큰따옴표)로 감싸진 글자
		
		String strong = new String("aasefsdf");
		System.out.println(strong);
		
		strong = "12312";
		System.out.println(strong);
		
		/*
		 * <<리터럴의 종류>>
		 * 
		 * 숫자 : 0, 10, -5, 3.14 ...
		 * 문자 : ''로 감싸주는 것. 문자 하나만 표현. '가', 'a', '3',
		 * 		아무것도 없는건 ' '로 표현. 공백도 문자.
		 * 문자열 : "가나다라마바사", "abcdefg", "123124123", 
		 *        " ", "" 아무것도 없어도 문자열로 인식.
		 * 그외 : true, false, null(값이 없다)
		 * 
		 * <<참조형 타입>>
		 * - 기본형 타입을 제외한 모든 데이터 타입 (배열, 클래스)
		 * ex) String, ABC, Variable
		 * - 값이 변수에 직접 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte 이다.
		 * 
		 */
		
		/*
		 * 기본값 : 전역변수에 아무것도 저장하지 않았을 때 저장되어 있는 값.
		 *main 안에 있으면 지역변수, 바깥은 전역변수.
		 *기본값은 0.
		 *
		 */
		
		 /*
		  *byte = 0;
		  *short = 0;
		  *int = 0;
		  *long = 0L;
		  *float = 0.0f;
		  *double = 0.0;
		  *char = '\u0000'; // ' '. 유니코드로 0을 표현한 것.
		  *boolean = false;
		  *string = null;
		  *
		  */
		 
		  bye = 0;
		  shorta = 0;
		  inte = 0;
		  tong = 0L;
		  floor = 0.0f;
		  dooble = 0.0;
		  chara = '\u0000'; // ' '. 유니코드로 0을 표현한 것.
		  booboo = false;
		  strong = null;
		  
		  //경우에 따라 변수에 타입이 다른 값을 저장하기도 한다. 
		  bye = 127; 
		  inte = 128;
		  bye =(byte)inte;/*형변환이 필요함. 앞에 괄호치고 타입을 적는다*/
		  System.out.println(bye); //128 -> -128 오버플로우. 
		
		  bye = -128;
		  inte = -129;
		  bye = (byte)inte;
		  System.out.println(bye); //-129 -> 127 언더플로우.
		//표현범위가 큰 타입에서 작은타입으로 형변환 할 경우 **데이터가 손실**될 수 있다.
		
		//double 타입에서 int 타입으로 형변환해서 출력해주세요.
		  
		  dooble = 3.14;
		  inte = (int)dooble;
		  System.out.println(inte); //int는 소수점을 표현할 수 없으므로 소수점이 손실됨
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환할 경우 데이터 손실은 없음.
		//고로 형변환 생략 가능.
		/* int = byte
		 * long = int
		 * double = int
		 * double = float
		 */
		  
		  
		//수학의 상수 = java 리터럴. java는 값이 변하지 않는 변수를 상수라고 한다.
		/*
		 * <<상수>>
		 * 
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER;
		 * - 리터럴에 의미를 부여하기위해 사용한다.
		 * - 상수의 이름은 모두 대문자로 저장한다.
		 */
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; 컴파일 에러 발생.
		
		
	}
				
}