package com.java;

import java.util.Scanner;

public class Qiz_2 {

	public static void main(String[] args) {
		// 숫자를 입력하고 그 팩토리얼값 구하기
Scanner scanner = new Scanner(System.in);              // 스캐너 사용 허가받기
  		int num1 =0;     //입력값
  		int tot = 1;     //팩토리얼값
		  System.out.print("Input your decimal no. :");    //입력 받아오기
		  		num1 = scanner.nextInt();                  //스캐너 사용
		  		
		  		for ( int i =1; i <= num1;  i ++) {         //팩토리얼값 구하기
		  			
		  			tot *=i;
		  		}
		
		  		System.out.println(num1 + "'s factorial value = " + tot);       //출력문
		  		
		
		
	}

}
