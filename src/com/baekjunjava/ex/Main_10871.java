package com.baekjunjava.ex;

import java.util.Scanner;

public class Main_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int a;
		int c[]=new int[n];
		for(int i=0;i<n;i++) {
			a=sc.nextInt();	
			if(a<x) {
				c[i]=a;
			}
		}
		sc.close();
		for(int i=0;i<n;i++) {
			if(c[i]!=0) {
				System.out.print(c[i]+" ");
			}
		}

	}

}
