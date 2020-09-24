package model;
public class Skill{
	
	//local variable
	private Long skilld;
	private String skillName;
	
	//constructor of the class
	public Skill(Long skilld, String skillName) {
		//super();
		this.skilld = skilld;
		this.skillName = skillName;
	}
	
	//getters and setters
	public Long getSkilld() {
		return skilld;
	}
	
	public void setSkilld(Long skilld) {
		this.skilld = skilld;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
}
