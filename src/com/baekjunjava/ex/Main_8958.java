package com.baekjunjava.ex;

import java.util.Scanner;

public class Main_8958 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int reset=0;
		String[] o=new String[n];
		for(int i=0;i<n;i++) {
			o[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			if(o[i].equals("O")){
				reset=reset+1;
				if(o[i].equals(o[i+1])) {
					reset=reset+1;
				}
				sum=sum+reset;
			}
			else {
				reset=0;
				sum=sum+reset;
			}
			System.out.println(sum);
		}
		
		

	}

}
