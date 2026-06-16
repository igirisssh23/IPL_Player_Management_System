package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {
	
	private List<Player> ipl_db=null;     

	public List<Player> getAllPlayer() {
		ipl_db=new ArrayList<>(); 
		

		// RCB
		ipl_db.add(new Player(1,"Virat Kohli",37,"RCB","Batsman",false,false));
		ipl_db.add(new Player(2,"Rajat Patidar",32,"RCB","Batsman",true,false));
		ipl_db.add(new Player(3,"Phil Salt",29,"RCB","Wicket Keeper",false,true));
		ipl_db.add(new Player(4,"Devdutt Padikkal",26,"RCB","Batsman",false,false));
		ipl_db.add(new Player(5,"Jitesh Sharma",32,"RCB","Wicket Keeper",false,false));
		ipl_db.add(new Player(6,"Tim David",30,"RCB","All Rounder",false,true));
		ipl_db.add(new Player(7,"Krunal Pandya",35,"RCB","All Rounder",false,false));
		ipl_db.add(new Player(8,"Bhuvneshwar Kumar",36,"RCB","Bowler",false,false));
		ipl_db.add(new Player(9,"Josh Hazlewood",35,"RCB","Bowler",false,true));
		ipl_db.add(new Player(10,"Yash Dayal",28,"RCB","Bowler",false,false));
		ipl_db.add(new Player(11,"Suyash Sharma",22,"RCB","Bowler",false,false));

		// GT
		ipl_db.add(new Player(12,"Shubman Gill",26,"GT","Batsman",true,false));
		ipl_db.add(new Player(13,"Sai Sudharsan",24,"GT","Batsman",false,false));
		ipl_db.add(new Player(14,"Jos Buttler",35,"GT","Wicket Keeper",false,true));
		ipl_db.add(new Player(15,"Glenn Phillips",29,"GT","All Rounder",false,true));
		ipl_db.add(new Player(16,"Rahul Tewatia",32,"GT","All Rounder",false,false));
		ipl_db.add(new Player(17,"Washington Sundar",26,"GT","All Rounder",false,false));
		ipl_db.add(new Player(18,"Rashid Khan",27,"GT","Bowler",false,true));
		ipl_db.add(new Player(19,"Mohammed Siraj",31,"GT","Bowler",false,false));
		ipl_db.add(new Player(20,"Prasidh Krishna",30,"GT","Bowler",false,false));
		ipl_db.add(new Player(21,"Sai Kishore",29,"GT","Bowler",false,false));
		ipl_db.add(new Player(22,"Kagiso Rabada",31,"GT","Bowler",false,true));

		// SRH
		ipl_db.add(new Player(23,"Pat Cummins",33,"SRH","Bowler",true,true));
		ipl_db.add(new Player(24,"Abhishek Sharma",25,"SRH","All Rounder",false,false));
		ipl_db.add(new Player(25,"Travis Head",32,"SRH","Batsman",false,true));
		ipl_db.add(new Player(26,"Heinrich Klaasen",34,"SRH","Wicket Keeper",false,true));
		ipl_db.add(new Player(27,"Ishan Kishan",27,"SRH","Wicket Keeper",false,false));
		ipl_db.add(new Player(28,"Nitish Kumar Reddy",23,"SRH","All Rounder",false,false));
		ipl_db.add(new Player(29,"Kamindu Mendis",27,"SRH","All Rounder",false,true));
		ipl_db.add(new Player(30,"Harshal Patel",35,"SRH","Bowler",false,false));
		ipl_db.add(new Player(31,"Jaydev Unadkat",34,"SRH","Bowler",false,false));
		ipl_db.add(new Player(32,"Brydon Carse",30,"SRH","Bowler",false,true));
		ipl_db.add(new Player(33,"Harsh Dubey",22,"SRH","Bowler",false,false));

		// RR
		ipl_db.add(new Player(34,"Riyan Parag",24,"RR","All Rounder",true,false));
		ipl_db.add(new Player(35,"Yashasvi Jaiswal",24,"RR","Batsman",false,false));
		ipl_db.add(new Player(36,"Dhruv Jurel",25,"RR","Wicket Keeper",false,false));
		ipl_db.add(new Player(37,"Shimron Hetmyer",29,"RR","Batsman",false,true));
		ipl_db.add(new Player(38,"Vaibhav Suryavanshi",15,"RR","Batsman",false,false));
		ipl_db.add(new Player(39,"Ravindra Jadeja",37,"RR","All Rounder",false,false));
		ipl_db.add(new Player(40,"Jofra Archer",31,"RR","Bowler",false,true));
		ipl_db.add(new Player(41,"Tushar Deshpande",31,"RR","Bowler",false,false));
		ipl_db.add(new Player(42,"Ravi Bishnoi",25,"RR","Bowler",false,false));
		ipl_db.add(new Player(43,"Sandeep Sharma",33,"RR","Bowler",false,false));
		ipl_db.add(new Player(44,"Nandre Burger",30,"RR","Bowler",false,true));
		
		

		return ipl_db;

	}

}
