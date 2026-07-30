package com.tka.controller;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		IPLController iplcontroller = new IPLController();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("======================");
			System.out.println("IPL PLAYER MANAGEMENT SYSTEM");
			System.out.println("======================");
			System.out.println("1.Add Players");
			System.out.println("2.View All Players");
			System.out.println("3.View Players by Team");
			System.out.println("4.Update Players");
			System.out.println("5.Delete Players");
			System.out.println("6.Exit");

			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Add Player");
				System.out.println(iplcontroller.addPlayer());
				break;

			case 2:
				System.out.println("View All Players");
				iplcontroller.allPlayer();
				break;

			case 3:
				System.out.println("View Player By Team");
				iplcontroller.playerByTeam();
				break;

			case 4:
				System.out.println("Update Player");
				System.out.println(iplcontroller.updatePlayer());
				break;

		case 5:
			System.out.println("Delete Player");
			System.out.println(iplcontroller.deletePlayer());
			break;
			
		case 6:
			System.out.println("Thank you for using");
			System.exit(0);
			break;
			
			default:
				System.out.println("Invalid Choice");
			}

		}
	}

}
