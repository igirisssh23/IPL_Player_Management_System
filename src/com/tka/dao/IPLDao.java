package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {

	private List<Player> ipl_db = null;
	private String path = "com.mysql.cj.jdbc.Driver";
	private Connection con = null;
	private String url = "jdbc:mySql://localhost:3306/advjava_433_db";
	private String un = "root";
	private String pass = "";
	PreparedStatement pst = null;
	ResultSet rs = null;

	String allplayerquery = "select * from player";

	public List<Player> getAllPlayer() {
		ipl_db = new ArrayList<>();

		try {
			Class.forName(path);

			con = DriverManager.getConnection(url, un, pass);
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

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ipl_db;

	}

	public void insertPlayer(Player p1) {

		String insertQuery = "insert into player values(?,?,?,?,?)";

		try {
			Class.forName(path);

			con = DriverManager.getConnection(url, un, pass);

			pst = con.prepareStatement(insertQuery);

			pst.setInt(1, p1.getPid());
			pst.setString(2, p1.getPname());
			pst.setInt(3, p1.getAge());
			pst.setString(4, p1.getTeamName());
			pst.setString(5, p1.getRole());

			pst.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int updatePlayer(Player p1) {
		String updateQuery = "update player set pname=?, age=?, teamName=?, role=? where pid=?";
		int rows = 0;

		try {
			Class.forName(path);

			con = DriverManager.getConnection(url, un, pass);

			pst = con.prepareStatement(updateQuery);

			pst.setString(1, p1.getPname());
			pst.setInt(2, p1.getAge());
			pst.setString(3, p1.getTeamName());
			pst.setString(4, p1.getRole());
			pst.setInt(5, p1.getPid());

			rows = pst.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	public int deletePlayer(Player p1) {
		String deletequery = "delete  from player where pid=?";
		int rows = 0;

		try {
			Class.forName(path);

			con = DriverManager.getConnection(url, un, pass);

			pst = con.prepareStatement(deletequery);
			pst.setInt(1, p1.getPid());

			rows = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rows;

	}
}
