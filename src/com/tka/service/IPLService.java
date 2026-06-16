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

	public List<Player> getPlayersByTeam(String string) {
		ipldao = new IPLDao();
		List<Player> allPlayers = ipldao.getAllPlayer();

		List<Player> result = new ArrayList<>();

		for (Player player : allPlayers) {

			if (player.getTeamName().equalsIgnoreCase(string)) {
				result.add(player);
			}
		}
		return result;

	}

}
