package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {

	private List<Player> ipl_db = null;
	private IPLDao ipldao = null;
	private int rows=0;

	public List<Player> getAllPlayers() {

		ipldao = new IPLDao();
		ipl_db = ipldao.getAllPlayer();
		

		return ipl_db;
	}

	public List<Player> getPlayersByTeam(String teamName) {
		ipldao = new IPLDao();
		List<Player> allPlayers = ipldao.getAllPlayer();

		List<Player> result = new ArrayList<>();

		for (Player player : allPlayers) {

			if (player.getTeamName().equalsIgnoreCase(teamName)) {
				result.add(player);
			}
		}
		return result;

	}

	public String insertPlayer(Player player) {
		ipldao = new IPLDao();
		rows=ipldao.insertPlayer(player);
		if(rows>0) {
			return "Player Inserted Successfully";
		}
		return "Insertion failed";
	}

	public String updatePlayer(Player player) {
		ipldao = new IPLDao();
		ipldao.updatePlayer(player);

		if(rows>0) {
			return "Player Updation Successfully";
		}
		return "Updation failed";
	}

	public String deletePlayer(Player player) {
		ipldao = new IPLDao();
		ipldao.deletePlayer(player);
		if(rows>0) {
			return "Player Deletion Successfully";
		}
		return "Deletion failed";	}

}
