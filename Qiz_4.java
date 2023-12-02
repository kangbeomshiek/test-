package com.java;

import java.util.Scanner;

public class Qiz_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라
		Scanner scanner = new Scanner(System.in);    //스캐너 사용 허락받기
		int num1 =0;    //입력값
		int plusnum = 0;    //더한값
		System.out.print("Enter an integer(0~9) :");     //입력 받아오기
		     num1 = scanner.nextInt();
		      
		
		    while ( num1 > 0 ) {        //입력값 더하기
		    	
		    	num1 /= 10;
		    	plusnum += num1%10;
		    	
		          	
		    }
		 System.out.println("Sum of digits = " + plusnum);   	  //출력문
		
		
		

	}

}
