package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {

	private List<Player> ipl_db = null;
	private IPLDao ipldao = null;

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

	public Player insertPlayer(Player p1) {
		ipldao = new IPLDao();
		ipldao.insertPlayer(p1);

		return p1;
	}

	public Player updatePlayer(Player p1) {
		ipldao = new IPLDao();
		ipldao.updatePlayer(p1);

		return p1;
	}

	public Player deletePlayer(Player p1) {
		ipldao = new IPLDao();
		ipldao.deletePlayer(p1);
		return p1;
	}

}
