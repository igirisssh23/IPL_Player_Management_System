package com.tka.controller;

import java.util.List;
import java.util.Scanner;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLController {
	private Scanner sc = new Scanner(System.in);
	private IPLService iplservice = null;
	private Player player = null;

	public Player addPlayer() {
		iplservice = new IPLService();
		player = new Player();

		System.out.println("Enter player's id:");
		player.setPid(sc.nextInt());

		System.out.println("Enter player's name:");
		player.setPname(sc.next());

		System.out.println("Enter player's age:");
		player.setAge(sc.nextInt());

		System.out.println("Enter player's team name:");
		player.setTeamName(sc.next());

		System.out.println("Enter player's role:");
		player.setRole(sc.next());

		iplservice.insertPlayer(player);
		return player;
	}

	public List<Player> allPlayer() {
		iplservice = new IPLService();

		List<Player> allPlayer = iplservice.getAllPlayers();

		for (Player p : allPlayer) {
			System.out.println(p);
		}

		return allPlayer;
	}

	public List<Player> playerByTeam() {
		iplservice = new IPLService();

		System.out.println("Enter your team name:");
		String teamName = sc.next();

		List<Player> playerByTeam = iplservice.getPlayersByTeam(teamName);
		playerByTeam.forEach(p -> System.out.println(p));

		return playerByTeam;
	}

	public Player updatePlayer() {
		iplservice = new IPLService();
		player = new Player();

		System.out.println("Enter player's id:");
		player.setPid(sc.nextInt());

		System.out.println("Enter player's name:");
		player.setPname(sc.next());

		System.out.println("Enter player's age:");
		player.setAge(sc.nextInt());

		System.out.println("Enter player's team name:");
		player.setTeamName(sc.next());

		System.out.println("Enter player's role:");
		player.setRole(sc.next());

		iplservice.updatePlayer(player);

		return player;
	}

	public Player deletePlayer() {
		iplservice = new IPLService();
		player = new Player();

		System.out.println("Enter player ID you want to delete");
		player.setPid(sc.nextInt());

		iplservice.deletePlayer(player);

		return player;

	}

}
