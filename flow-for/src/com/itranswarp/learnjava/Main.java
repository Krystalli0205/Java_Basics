package com.itranswarp.learnjava;

/**
 * for练习
 */
public class Main {

	public static void main(String[] args) {
		double pi = 0;
		for (int i = 1; i < 10; i = i+2) {
			// TODO:
			pi = pi + (-1)*((i+1)/2-1)*1/i;
		}
		System.out.println(pi);
	}

}
