package com.baekjunjava.ex;

import java.util.Scanner;

public class Main_10872 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int sum=1;
		
		
		for(int i=n;i>1;i--) {
			sum=sum*n;
			n--;
		}
		
		System.out.println(sum);
		

	}

}
