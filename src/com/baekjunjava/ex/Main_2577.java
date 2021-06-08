package com.baekjunjava.ex;

import java.util.Scanner;

public class Main_2577 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b,c,sum;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sum=a*b*c;
		String str=Integer.toString(sum);
		sc.close();
		
		for(int i=0;i<10;i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if((str.charAt(j)-'0')==i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
