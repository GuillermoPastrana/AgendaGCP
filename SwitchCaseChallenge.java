package com.softtek.java.academy.challenge;

public class SwitchCaseChallenge {
	public static void main(String... args) {
		int formulaNumber = 50;
		String heisenbergFormula = "";

		switch(formulaNumber){
		 case 50:
		 heisenbergFormula += "Mn";
		 case 10:
		 heisenbergFormula += "Ne";
		 break;
		 case 30:
		 heisenbergFormula += "Zn";
		 case 5:
		 heisenbergFormula += "O";
		 default:
		 heisenbergFormula += "H";
		}
		System.out.println(heisenbergFormula);
	}
}
