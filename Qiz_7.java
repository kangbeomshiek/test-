package com.java;

import java.util.Scanner;

public class Qiz_7 {

	public static void main(String[] args) {
		// 몇개의 숫자를 입력할지 결정한 후 숫자를 입력하고 이중 최대값의  위치와 최대값을 구하라
		
      Scanner scanner = new Scanner(System.in);   //스캐너 사용
      int num1 = 0;      //갯수 변수
	  int num2 = 0;      //숫자 입력받기
	  int max = 0;      //최대값 변수
	  int maxC = 0;     //최대값의 자리 변수
						System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");     // 갯수 입력받기
						  num1 = scanner.nextInt();
						  System.out.println(num1 + "개의 숫자를 입력하세요!");   //숫자 입력받기
						  for ( int i =1; i <= num1; i++) {
							  num2 = scanner.nextInt();
							  
							  if ( max < num2 ) {     //최대값과 그 자리 구하기
								  max = num2; 
								  maxC = i;
								  
							  }
							  
						  }
		
						  System.out.println("입력한 숫자중 최대값은" + max + "이고" + maxC + "번째 값 입니다.");   //출력문
		
		
	}

}
