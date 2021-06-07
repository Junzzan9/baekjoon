package com.baekjunjava.ex;

import java.util.Scanner;

public class Main_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int i=0;
		int x=n;
		
		while(true) {
			n=((n%10)*10)+(((n/10)+(n%10))%10);
			i++;
			
			if(x==n) {
				break;
			}
		}
		System.out.println(i);
		
	}	
}
