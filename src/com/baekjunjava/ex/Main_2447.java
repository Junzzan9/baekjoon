package com.baekjunjava.ex;

import java.util.Scanner;

public class Main_2447 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>n/3-1&&i<2*n/3&&j>n/3-1&&j<2*n/3) {
						System.out.print(" ");					
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}