package com.baekjunjava.ex;

import java.util.Scanner;

public class Main_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int l=0;l<=i;l++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();

	}

}
