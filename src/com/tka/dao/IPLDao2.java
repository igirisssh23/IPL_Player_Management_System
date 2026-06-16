package com.tka.dao;

import com.tka.entity.Player;

public class IPLDao2 {
	
	private Player[] ipl_db=null;     

	public Player[] getAllPlayer() {
		 ipl_db=new Player[44];
		

		 ipl_db[0] = new Player(1,"Virat Kohli",37,"RCB","Batsman",false,false);
		 ipl_db[1] = new Player(2,"Rajat Patidar",32,"RCB","Batsman",true,false);
		 ipl_db[2] = new Player(3,"Phil Salt",29,"RCB","Wicket Keeper",false,true);
		 ipl_db[3] = new Player(4,"Devdutt Padikkal",26,"RCB","Batsman",false,false);
		 ipl_db[4] = new Player(5,"Jitesh Sharma",32,"RCB","Wicket Keeper",false,false);
		 ipl_db[5] = new Player(6,"Tim David",30,"RCB","All Rounder",false,true);
		 ipl_db[6] = new Player(7,"Krunal Pandya",35,"RCB","All Rounder",false,false);
		 ipl_db[7] = new Player(8,"Bhuvneshwar Kumar",36,"RCB","Bowler",false,false);
		 ipl_db[8] = new Player(9,"Josh Hazlewood",35,"RCB","Bowler",false,true);
		 ipl_db[9] = new Player(10,"Yash Dayal",28,"RCB","Bowler",false,false);
		 ipl_db[10] = new Player(11,"Suyash Sharma",22,"RCB","Bowler",false,false);

		 ipl_db[11] = new Player(12,"Shubman Gill",26,"GT","Batsman",true,false);
		 ipl_db[12] = new Player(13,"Sai Sudharsan",24,"GT","Batsman",false,false);
		 ipl_db[13] = new Player(14,"Jos Buttler",35,"GT","Wicket Keeper",false,true);
		 ipl_db[14] = new Player(15,"Glenn Phillips",29,"GT","All Rounder",false,true);
		 ipl_db[15] = new Player(16,"Rahul Tewatia",32,"GT","All Rounder",false,false);
		 ipl_db[16] = new Player(17,"Washington Sundar",26,"GT","All Rounder",false,false);
		 ipl_db[17] = new Player(18,"Rashid Khan",27,"GT","Bowler",false,true);
		 ipl_db[18] = new Player(19,"Mohammed Siraj",31,"GT","Bowler",false,false);
		 ipl_db[19] = new Player(20,"Prasidh Krishna",30,"GT","Bowler",false,false);
		 ipl_db[20] = new Player(21,"Sai Kishore",29,"GT","Bowler",false,false);
		 ipl_db[21] = new Player(22,"Kagiso Rabada",31,"GT","Bowler",false,true);

		 ipl_db[22] = new Player(23,"Pat Cummins",33,"SRH","Bowler",true,true);
		 ipl_db[23] = new Player(24,"Abhishek Sharma",25,"SRH","All Rounder",false,false);
		 ipl_db[24] = new Player(25,"Travis Head",32,"SRH","Batsman",false,true);
		 ipl_db[25] = new Player(26,"Heinrich Klaasen",34,"SRH","Wicket Keeper",false,true);
		 ipl_db[26] = new Player(27,"Ishan Kishan",27,"SRH","Wicket Keeper",false,false);
		 ipl_db[27] = new Player(28,"Nitish Kumar Reddy",23,"SRH","All Rounder",false,false);
		 ipl_db[28] = new Player(29,"Kamindu Mendis",27,"SRH","All Rounder",false,true);
		 ipl_db[29] = new Player(30,"Harshal Patel",35,"SRH","Bowler",false,false);
		 ipl_db[30] = new Player(31,"Jaydev Unadkat",34,"SRH","Bowler",false,false);
		 ipl_db[31] = new Player(32,"Brydon Carse",30,"SRH","Bowler",false,true);
		 ipl_db[32] = new Player(33,"Harsh Dubey",22,"SRH","Bowler",false,false);

		 ipl_db[33] = new Player(34,"Riyan Parag",24,"RR","All Rounder",true,false);
		 ipl_db[34] = new Player(35,"Yashasvi Jaiswal",24,"RR","Batsman",false,false);
		 ipl_db[35] = new Player(36,"Dhruv Jurel",25,"RR","Wicket Keeper",false,false);
		 ipl_db[36] = new Player(37,"Shimron Hetmyer",29,"RR","Batsman",false,true);
		 ipl_db[37] = new Player(38,"Vaibhav Suryavanshi",15,"RR","Batsman",false,false);
		 ipl_db[38] = new Player(39,"Ravindra Jadeja",37,"RR","All Rounder",false,false);
		 ipl_db[39] = new Player(40,"Jofra Archer",31,"RR","Bowler",false,true);
		 ipl_db[40] = new Player(41,"Tushar Deshpande",31,"RR","Bowler",false,false);
		 ipl_db[41] = new Player(42,"Ravi Bishnoi",25,"RR","Bowler",false,false);
		 ipl_db[42] = new Player(43,"Sandeep Sharma",33,"RR","Bowler",false,false);
		 ipl_db[43] = new Player(44,"Nandre Burger",30,"RR","Bowler",false,true);

		return ipl_db;

	}

}
