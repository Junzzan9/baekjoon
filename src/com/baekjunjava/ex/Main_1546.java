package com.baekjunjava.ex;

import java.util.Scanner;

public class Main_1546 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		double sum=0;
		double max=0;
		int[] arr=new int[n];
		double[] arr1=new double[n];

		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		
		for(int i=0;i<n;i++) {
			arr1[i]=((double)arr[i]/max)*100;
			sum=(double)sum+(double)arr1[i];
		}
		
		sc.close();
		System.out.println((double)sum/(double)n);
		
	}

}
