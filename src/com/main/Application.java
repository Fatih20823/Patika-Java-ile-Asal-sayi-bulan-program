package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n sayisi giriniz");
		int n = scan.nextInt();
		
		for (int i=2;i<n;i++) {
			if(i%2==0 && i<4) {
				System.err.println(i);
			}
			if(i%2==1) {
				if(i%2==1 && i<10 && !(i%9==0)) {
					System.out.println(i);
				}
				
				if(i%3==0) {
					
				}
				else if (i%5==0) {
					
				}
				else if (i%7==0) {
					
				}
				else if (i%9==0) {
					
				}else {
					System.out.println(i);
				}
			}
		}
		
		

	}

}
