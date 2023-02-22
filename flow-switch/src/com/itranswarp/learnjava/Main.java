package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		Scanner scanner = new Scanner(System.in);
		int player = scanner.nextInt();
		// 计算机随机数 1, 2, 3:
		int computer = 1 + (int) Math.random() * 3;
		System.out.printf("你出%d，电脑出%d", player, computer);
		int result = computer - player;
		switch (result) {
		// TODO:
		case 0 -> System.out.println("平局");
		case 1,-2 -> System.out.println("你赢了！");
		default -> System.out.println("你输了。。");
		
		}
	}

}
