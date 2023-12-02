package com.java;

import java.util.Scanner;

public class Qiz_6 {

	public static void main(String[] args) {
		// 숫자 삼각형에 프로그램 작성
		
		Scanner scanner = new Scanner(System.in);     //사용자로부터 정수 입력
		int num1 = 0;      //변수 지정
		
		int dan =0;
		
						System.out.print("몇 단계의 피라미드로 구성할까 ? :");      //입력 받기
						    	  num1 = scanner.nextInt();
						

						    	for ( int i =1; i <= num1; i++ ) {     //피라미드의 단계
						    	      for ( int e =1; e<= i; e++) {   //단계의 숫자
						    	    	  dan++;     //숫자 증가
						    	    	  System.out.print(String.format("%4d", dan));   //출력문
						    	      }
						    	      
						    	      System.out.println();      //줄띄기
						    	}
		
		
		
		
		
	}

}
