package com.softtek.java.academy.exercises;

import java.util.Scanner;

public class Pino {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce los niveles del Pino: ");

		int nivel = scan.nextInt();
		
		System.out.println();
		
		for(int blanco=0, asterisco = (nivel*2)-1; asterisco>0;
				blanco++,asterisco-=2) {
			//Espacios en blanco
			for(int i=0; i <= blanco; i++){
					System.out.print(" ");
			}
			//Asteriscos
			for(int j=asterisco; j>0 ; j--) {
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
