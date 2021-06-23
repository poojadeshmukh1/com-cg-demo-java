package com.cg.demo;

public class Logical {
	public static void main(String[] args) {
		int score1=59;
		 int score2=45;
		 int passingmarks=50;
		System.out.println((score1 >= passingmarks) && (score2 >= passingmarks));
		System.out.println((score1 >= passingmarks) || (score2 >= passingmarks));
	}

}
