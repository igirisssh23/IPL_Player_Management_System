package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLController {
	public static void main(String[] args) {

		IPLService iplservice = new IPLService();

		List<Player> allPlayers = iplservice.getAllPlayers();

		// allPlayers.forEach(p -> System.out.println(p.getPname()));
		allPlayers.forEach(p -> System.out.println("Player:-" + p.getPname() + " TeamName:-" + p.getTeamName()));

		// List<Player> allPlayersByTeam= iplservice.getPlayersByTeam("RCB");
		// allPlayersByTeam.forEach(p -> System.out.println("Player: " + p.getPname() +"
		// Team: " + p.getTeamName()));

		// List<Player> allPlayersByTeam1= iplservice.getPlayersByTeam("GT");
		// allPlayersByTeam1.forEach(p -> System.out.println("Player: " + p.getPname()
		// +" Team: " + p.getTeamName()));

		// List<Player> allPlayersByTeam11= iplservice.getPlayersByTeam("SRH");
		// allPlayersByTeam11.forEach(p -> System.out.println("Player: " + p.getPname()
		// +" Team: " + p.getTeamName()));

		// List<Player> allPlayersByTeam111= iplservice.getPlayersByTeam("RR");
		// allPlayersByTeam111.forEach(p -> System.out.println("Player: " + p.getPname()
		// +" Team: " + p.getTeamName()));

		// ------------Insert Players

		// Player p1= new Player(45,"David Malan",60,"RCB","WicketKeeper");
		// int ack=iplservice.insertPlayer(p1);
		// Player p2= new Player(46,"Jonty Rhodes",60,"RCB","WicketKeeper");
		// int ack1=iplservice.insertPlayer(p2);
		// Player p21= new Player(47,"David Beckham",650,"SRH","Bowler");
		// int ack2=iplservice.insertPlayer(p21);
		// Player p211= new Player(48,"Nucleya",750,"GT","Bowler");
		// int ack3=iplservice.insertPlayer(p211);

		// -----------Update Players

		// Player p1= new Player(1,"David Malan",600,"RCB","Bowler");
		// int ack2=iplservice.updatePlayer(p1);
		// System.out.println(ack2>0 ? "Success":"fail");
		// Player p2= new Player(35,"David ",60,"RR","WK");
		// int ack3=iplservice.updatePlayer(p2);
		// System.out.println(ack3>0 ? "Success":"fail");

		// -----------------Delete players
		// Player p1=new Player(48,"Nucleya",750,"GT","Bowler");
		// int ack3=iplservice.deletePlayer(p1);
		// System.out.println(ack3>0 ? "Success":"fail");
		// Player p2=new Player(35,"Nucleya",750,"GT","Bowler");
		// int ack3=iplservice.deletePlayer(p2);
		// System.out.println(ack3>0 ? "Success":"fail");

	}

}
