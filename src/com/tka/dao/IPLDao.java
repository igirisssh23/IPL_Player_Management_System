package com.tka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;
import com.tka.utility.DBConnection;

public class IPLDao {
	private Connection con = null;
	private List<Player> ipl_db = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private int rows = 0;
	private String allplayerquery = "select * from player";
	private String insertQuery = "insert into player values(?,?,?,?,?)";
	private String updateQuery = "update player set pname=?, age=?, teamName=?, role=? where pid=?";
	private String deletequery = "delete  from player where pid=?";

	public List<Player> getAllPlayer() {
		try {
			con = DBConnection.getConnection();
			pst = con.prepareStatement(allplayerquery);

			rs = pst.executeQuery();
			ipl_db = new ArrayList<Player>();
			while (rs.next()) {
				int id = rs.getInt(1);
				String nm = rs.getString(2);
				int age = rs.getInt(3);
				String tn = rs.getString(4);
				String rl = rs.getString(5);

				Player obj = new Player(id, nm, age, tn, rl);

				ipl_db.add(obj);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ipl_db;

	}

	public int insertPlayer(Player p1) {

		try {
			con = DBConnection.getConnection();
			pst = con.prepareStatement(insertQuery);

			pst.setInt(1, p1.getPid());
			pst.setString(2, p1.getPname());
			pst.setInt(3, p1.getAge());
			pst.setString(4, p1.getTeamName());
			pst.setString(5, p1.getRole());

			rows = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	public int updatePlayer(Player p1) {

		try {
			con = DBConnection.getConnection();
			pst = con.prepareStatement(updateQuery);

			pst.setString(1, p1.getPname());
			pst.setInt(2, p1.getAge());
			pst.setString(3, p1.getTeamName());
			pst.setString(4, p1.getRole());
			pst.setInt(5, p1.getPid());

			rows = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	public int deletePlayer(Player p1) {

		try {
			con = DBConnection.getConnection();
			pst = con.prepareStatement(deletequery);
			pst.setInt(1, p1.getPid());

			rows = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rows;

	}
}
