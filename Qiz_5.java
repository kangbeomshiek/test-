package com.java;

import java.util.Scanner;

public class Qiz_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner scanner = new Scanner(System.in);    //스캐너 사용 허락받기
			int num1 = 0 ;        //숫자의 갯수 입력값
			int num2 = 0;         //출력변수
			int numtot = 0;       //합산
				System.out.print("몇개의 숫자를 더할까요 ? :");    //입력값 받기
					 num1 = scanner.nextInt();
					 
					 System.out.println(num1 + "의 숫자를 입력하세요");      //사용자가 입력하기
					 for (int i = 1; i<=num1; i++) {
						 num2 = scanner.nextInt();
					     numtot += num2;      //입력값 합 구하기
					       
						
					 }
		                    
					 System.out.println("입력한 숫자의 합은 " + numtot + "입니다.");   //합 출력
					 
					 
					 
		
	}

}
