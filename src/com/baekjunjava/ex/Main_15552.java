package com.baekjunjava.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_15552 {
	public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        
        if((line = in.readLine()) != null) {
            String[] splitedLine = line.split(" ");
            
 

            if(splitedLine.length == 3) {
                int num1 = 0; int num2 = 0;
               
                // 정수형으로 변환..
                try { num1 = Integer.parseInt(splitedLine[0]); } catch(Exception e) {}
                try { num2 = Integer.parseInt(splitedLine[1]); } catch(Exception e) {}
                for(int i=1;i<=n;i++) {
                	System.out.println(num1+num2);
                }
               
                
            }
            
        }      
    }
}

