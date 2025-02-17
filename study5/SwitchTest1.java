package study5;

import java.util.Scanner;

public class SwitchTest1 {
	
	public static void main(String[] args) {

		int number = 2;
		switch(number) {
			case 1 : System.out.println("1입니다.");
			break;
			case 2 : System.out.println("2입니다.");
			break;
			case 3 : System.out.println("3입니다.");
			break;
			default : System.out.println("몰라요");
		}
		
		if( number == 1 ) {
			System.out.println("1입니다.");
		} else if( number == 2 ) {
			System.out.println("2입니다.");
		} else if( number == 3 ) {
			System.out.println("3입니다.");
		} else {
			System.out.println("몰라요");
		}
		
		char gender = 'M';
		switch(gender) {
			case 'M' : System.out.println("남성");
			break;
			case 'F' : System.out.println("여성");
			break;
			default  : System.out.println("모름");
		}
		
		System.out.println("--------------");
		
		Scanner scn = new Scanner(System.in);
		
		int a = 10;
		int b = 20;
		System.out.print("연산기호입력>>");
		
		String mark = "+";
		switch( mark ) {
			case "+" : System.out.println( a+b );
			break;
			case "-" : System.out.println( a-b );
			break;
			case "*" : System.out.println( a*b );
			break;
			case "/" : System.out.println( a/b );
			break;
			default  : System.out.println("오류");
		}

		if( mark.equals("+") ) {
			System.out.println( a+b );
		} else if( mark.equals("-") ) {
			System.out.println( a-b );
		} else {
			System.out.println("오류");
		}
		//switch( number > 2 ) {  } (x)
		String name="홍길동";
		int pay=100;
		int level=1;
		switch(level) {
			case 1 : pay += 30;
			break;  // switch문의 종료
			case 2 : pay += 20;
			break; // switch문의 종료
			case 3 : pay += 10;
			break; // switch문의 종료
		}
		System.out.println( "pay : "+pay );

		int age = 38;
		String msg = "";
		switch ( age%10 ) {
			case 9 : msg = "올해가 아홉수네요.";
			break;
			default : msg = "평범한 한해~";
		}
		System.out.println(msg);
		
		/*
		int n1 = 10;
		int n2 = 20;
		boolean result = true;  
		switch( result ) {  // error
			case true : System.out.println("11");
			break;
		
		}*/
		
		//System.out.println(n1 < n2);

		/*if( true ) {
			System.out.println("11");
		}
		
		if( false ) {
			System.out.println("22");
		}
		
		if( false ) {
			System.out.println("22");
		} else {
			System.out.println("33");
		}
		
		if( 1==1 && 2==2 ) {
			System.out.println("44");
		}
		
		if( 1==1 && 2==3 ) { // false
			System.out.println("55");
		}
		
		if( 1==1 || 2==2 ) { // true
			System.out.println("66");
		}
		
		if( 1==1 || 2==3 ) { // true
			System.out.println("77");
		}
		
		if( 1==2 || 2==3 ) { // false
			System.out.println("88");
		}*/
		
		
		
		
		
		
		
	}
	
}
