package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	public List<Skill> listAllSkills () throws ClassNotFoundException, SQLException{
		
		
		//function of this method
		//The above method is used to fetch all the skills from skill table and returns the list of skills.
		//Display the skills in ascending order based on name.
		
		ConnectionManager con =new ConnectionManager();
		Connection conn=con.getConnection();
		String sql="select * from skill";
		PreparedStatement stmt=conn.prepareStatement(sql);
		ResultSet rs=stmt.executeQuery();
		List<Skill> skilllist=new ArrayList<>();
		while(rs.next()) {
			//printing value of the first column for testing
			//System.out.println(rs.getString(1));
			
			//loading value of first and second column in the variable
			Long id=Long.parseLong(rs.getString(1));
			String skill=rs.getString(2);
			
			//calling constructor of skill class
			Skill skillobj=new Skill(id,skill);
			//System.out.println("flow is correct");
			skilllist.add(skillobj);
		}
		return skilllist;
		
	}
}
