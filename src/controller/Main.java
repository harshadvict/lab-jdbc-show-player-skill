package controller;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

class Main{
	public static void main(String[] Args) throws ClassNotFoundException, SQLException {
		System.out.println("List of all Skills");
		
		SkillDAO skillobj=new SkillDAO();
		//storing value in the variable of type list
		List<Skill> list=skillobj.listAllSkills();
		//to iterate over the list
		Iterator<Skill> iterator=list.iterator();
		int i=1;
		while(iterator.hasNext()) {
			
			Skill skillobj1=iterator.next();
			System.out.println(i+"."+skillobj1.getSkillName());
			i++;
		}
		
	}
}
