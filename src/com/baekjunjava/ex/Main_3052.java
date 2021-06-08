package com.baekjunjava.ex;

import java.util.Scanner;

public class Main_3052 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ary=new int[10];
		int[] ary1=new int[42];
		int count=0;
		
		for(int i=0;i<10;i++) {
			int n=sc.nextInt();
			int a=n%42;
			ary[i]=a;
			for(int j=0;j<42;j++) {
				if(a==j) {
					ary1[j]=a;
				}
				else if (a==0) {
					ary1[0]=1;
				}
			}
			
		}
		sc.close();
		for(int j=0;j<42;j++) {
			if(ary1[j]!=0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
