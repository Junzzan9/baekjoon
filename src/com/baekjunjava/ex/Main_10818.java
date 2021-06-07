package com.baekjunjava.ex;

import java.util.Scanner;

public class Main_10818 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ary=new int[n];
		
		for(int i=0;i<n;i++) {
			ary[i]=sc.nextInt();
		}
		int min=1000000,max=-1000000;
		for(int i=0;i<n;i++) {
		if(ary[i]>max) {
				max=ary[i];
			}
		if(ary[i]<min) {
				min=ary[i];
			}
		}

		
		System.out.println(min+" "+max);
		sc.close();

		
	}
}
