package com.abtech.web.dao;

import java.sql.*;

import com.abtech.web.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int aid) throws SQLException, ClassNotFoundException {
		
			Alien a = new Alien();
				
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","spring1","ash@2018");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where id=" + aid);
			if(rs.next()) {
				a.setAid(rs.getInt("id"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
				}
			return a;
		
	}

}
