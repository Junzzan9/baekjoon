package com.baekjunjava.ex;

import java.io.*;

public class br_prac {
	public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
       
        System.out.println("2개의 수를 입력하세요.(예:56 43)");
        if((line = in.readLine()) != null) {
            String[] splitedLine = line.split(" ");

 

            if(splitedLine.length == 2) {
                int num1 = 0; int num2 = 0;
               
                // 정수형으로 변환..
                try { num1 = Integer.parseInt(splitedLine[0]); } catch(Exception e) {}
                try { num2 = Integer.parseInt(splitedLine[1]); } catch(Exception e) {}
               
                // 사칙연산 결과 출력
                System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
                System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
                System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
            } else {
                System.out.println("잘못입력되었습니다.");
            }
        }      
    }
}