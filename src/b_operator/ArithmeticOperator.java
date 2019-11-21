package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/* 
		 * 
		 * 
		 * <산술연산자>
		 * 
		 * +, -, *, /, %
		 * 이항 연산자는 양쪽의 타입이 일치해야 연산이 가능하다.
		 * 
		 * 
		 */
		
		int a = 10 +20-10*5 /10 %2; 
		System.out.println(a);
		
		a = (int)(10+20.3);
		
		byte b = 10;
		short c = 20;
		
		short d = (short)(c - b);
		
		long el = 100000 * 100000;
		System.out.println(el);
		long e2 = 100000L * 100000;
		System.out.println(e2);
		
		float f1 = 10 / 4;
		System.out.println(f1);
		float f2 = 10 / 4f;
		System.out.println(f2);
		
		int f3 = 10 % 4;
		System.out.println(f3);
		
//		int g1 = 10 / 0; 
		
		float g2 = 10.0f / 0;
		System.out.println(g2);
		float g3 = 0 / 0f;
		System.out.println(g3);
		
		char h1 = 'A';
		char h2 = (char)(h1 + 1);
		
		int h3 = 'D' - 'A'; //68-65
		System.out.println(h3);
		int h4 = '5' - '0'; //53-48
		System.out.println(h4);
		
		
	//산술연산자와 대입연산자 줄이기
		
		int i = 0;
			
		i = i+1;
		i += 1;
		
		i = i+2;
		i += 2;
	// 더하는 값이 1인 경우엔 더 줄일 수 있다.
		++i; //전위형 : 변수가 참조되기 전 수행
		i++; //후위형 : 변수가 참조된 후 수행


		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		
		i = i -1;
		i -= 1;
		--i;
		i--;
		
		i = i * 2;
		i *= 2;
		i = i / 3;
		i /= 3;
		
		i = i % 4;
		i %= 4;
				
	
		//실수의 반올림을 하고 싶다. 어떻게 해야할까?
		double round = 50.6;
		System.out.println((int)(round + 0.5));
		//반올림을 하기 위해서는 0.5를 더하고 형변환을 해버리면 된다!
		
		round = 3.14; //소수점 둘째자리에서 반올림하려면?
		//0.05를 더한 후
		//10을 곱한 다음 int로 바꾸고
		//int를 더블타입으로 바꿔서 10으로 나눈다.
		int cc = (int)((round+0.05)*10);
		double dd = cc/10.0;
		
		System.out.println(dd);
		System.out.println((int)((round+0.05)*10)/10.0);
		
		System.out.println((int)(round*10+0.5)/10d);
		
		
		/*다음을 한줄씩 계상해서 최종 결과값을 출력하라
		 * 1. 123456 + 654321
		 * 2. 1번의 결과값 * 123456
		 * 3. 2번의 결과값 / 123456
		 * 4. 3번의 결과값 - 654321
		 * 5. 4번의 결과값 % 123456
		 */
		
		double y = 123456 + 654321;
		System.out.println(y);
		y *= 123456;
		System.out.println(y);
		y /= 123456;
		System.out.println(y);
		y -= 654321;
		System.out.println(y);
		y %= 123456;
		System.out.println(y);
		
		
		/* 3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		 * 평균은 소수 둘째자리에서 반올림.*/
		 
		int u=3; int o=5; int p=11136;
		System.out.println(u+o+p);
		
		double ave = (u+o+p)/3.0;
		System.out.println((int)(ave*10+0.5)/10.0);
		
		/*
		int num1; int num2; int num3;
		
		int sum = num1 + num2 + num3;
		double avg = (int)(sum/3.0*10+0.5)/10.0;
		System.out.println("합계 : " + sum + " / 평균 : " + avg);
		
		
		*/


		
		
	}

}
