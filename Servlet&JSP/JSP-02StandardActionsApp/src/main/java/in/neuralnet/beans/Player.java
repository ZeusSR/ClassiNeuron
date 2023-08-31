package in.neuralnet.beans;

public class Player {
	static{
		System.out.println("class loading");
	}
	
	
	private Integer id;
	private String name;
	private String jersey;
	private String team;
	@Override
	
	
	
	
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", jersey=" + jersey + ", team=" + team + "]";
	}
	public Integer getId() {
		
		System.out.println("Player.getId()");
		return id;
	}
	public void setId(Integer id) {
		System.out.println("Player.setId()");
		this.id = id;
	}
	public String getName() {
		System.out.println("Player.getName()");
		
		return name;
	}
	public void setName(String name) {
		System.out.println("Player.setName()");
		this.name = name;
	}
	public String getJersey() {
		System.out.println("Player.getJersey()");
		return jersey;
	}
	public void setJersey(String jersey) {
		System.out.println("Player.setJersey()");
		this.jersey = jersey;
	}
	public String getTeam() {
		System.out.println("Player.getTeam()");
		return team;
	}
	public void setTeam(String team) {
		System.out.println("Player.setTeam()");
		this.team = team;
	}
	
	

	
}
