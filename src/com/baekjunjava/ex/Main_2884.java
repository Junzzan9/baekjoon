package com.baekjunjava.ex;

import java.util.Scanner;

public class Main_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if (m>=45) {
			System.out.println(h+" "+(m-45));
		}
		else if (m<45) {
			if(h>0) {
				System.out.println((h-1)+" "+(60-(45-m)));
			}
			else if (h==0) {
				System.out.println("23 "+(60-(45-m)));
			}
		}
}
		

}
