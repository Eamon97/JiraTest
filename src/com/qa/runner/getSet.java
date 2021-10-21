package com.qa.runner;

public class getSet {
	private int rank;
	private String sport;
	private boolean finish;
	private int timeTaken;
	
	
	public getSet(int rank, String sport, boolean finish, int timeTaken) {
		super();
		this.rank = rank;
		this.sport = sport;
		this.finish = finish;
		this.timeTaken = timeTaken;
		}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		if(rank>0)
		this.rank = rank;
	}


	public String getSport() {
		return sport;
	}


	public void setSport(String sport) {
		this.sport = sport;
	}


	public boolean isFinish() {
		return finish;
	}


	public void setFinish(boolean finish) {
		if(finish=true) {
		this.finish = finish;
		System.out.println("Congratulations you have finished the race!");} 
		else {
			this.finish=false;
		}
	}


	public int getTimeTaken() {
		return timeTaken;
	}


	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}
	
	
	

}
