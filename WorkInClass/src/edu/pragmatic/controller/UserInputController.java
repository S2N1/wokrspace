package edu.pragmatic.controller;

import java.util.Scanner;

public class UserInputController {

	private Scanner scanner = new Scanner(System.in);

	private enum MenuOption {
		ADD_NEW_WORD, SEARCH, EXIT, INVALID
	}

	public void start() {

		do {
			MenuOption selectedOption = showMenu();

		} while (true);

	}

	private MenuOption showMenu() {
		System.out.println("Menu");
		System.out.println("-----");

		System.out.println("1 Add new word");
		System.out.println("2 Search");
		System.out.println("3 Exit");

		System.out.println("Enter option:  ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			return MenuOption.ADD_NEW_WORD;

		case 2:
			return MenuOption.SEARCH;
		case 3:
			return MenuOption.EXIT;
		default:
			return MenuOption.INVALID;

		}

	}

}
