package edu.eci.cvds.servlet.model;

public class Todo{
	private int userId; 
	private int id;
	private String title;
	private boolean completed;

	public int getUserId(){
		return userId;
	}
	public int getId(){
		return id;
	}
	public String getTitle(){
		return title;
	}
	public boolean getCompleted(){
		return completed;
	}

        public void setterUser(int userId){
		this.userId=userId;
	}
	public void setterid(int id){
		this.id=id;
	}
	public void setterTittle(String title){
		this.title=title;
	}
	public void setterCompleted(boolean completed){
		this.completed=completed;
	}
}