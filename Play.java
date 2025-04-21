package com.practice;

class Player{
	private String name;
	private int age;
	private double height;
	private String country;
	Player(String name,int age,double height,String country){
		this.name=name;
		this.age=age;
		this.country=country;
		this.height=height;
	}
	void displayInfo() {
		System.out.println("The player name is "+name);
		System.out.println("The player age is "+age);
		System.out.println("The player height is "+height);
		System.out.println("The player country is "+country);
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	double getHeight() {
		return height;
	}
	String getCountry(){
		return country;
	}
}
class cricket_1 extends Player{
	int wickets;
	int runs;
	cricket_1(String name,int age,double height,String country,int wickets,int runs){
		super(name,age,height,country);
		this.wickets=wickets;
		this.runs=runs;
	}
	void displayCricketStats() {
		if(getAge()<0||getAge()>100) {
			System.out.println("Invalid age");	
			System.out.println("Enter valid age");
		}
		else {
			System.out.println("The player age is "+getAge());
		}
		if(getHeight()<0.0||getHeight()>10.0) {
			System.out.println("Invalid Height");	
			System.out.println("Enter valid Height");
		}
		else {
			System.out.println("The player Height is "+getHeight());
		}
		System.out.println("The player country is "+getCountry());
		if(wickets<0) {
			System.out.println("Invalid wickets");	
		}
		else {
			System.out.println("The player wickets is "+wickets);
		}
		if(runs<0) {
			System.out.println("Invalid runs");	
		}
		else {
			System.out.println("The player runs is "+runs);
		}
	}
}
class Football extends Player{
	int goals;
	String position;
	Football(String name,int age,double height,String country,int goals,String position){
		super(name,age,height,country);
		this.goals=goals;
		this.position=position;
	}
	void displayFootballStats() {
		System.out.println("The player name is "+getName());
		if(getAge()<0||getAge()>100) {
			System.out.println("Invalid age");	
		}
		else {
			System.out.println("The player age is "+getAge());
		}
		if(getHeight()<0.0||getHeight()>10.0) {
			System.out.println("Invalid Height");	
		}
		else {
			System.out.println("The player Height is "+getHeight());
		}
		System.out.println("The player country is "+getCountry());
		if(goals<0) {
			System.out.println("Invalid Goals");	
		}
		else {
			System.out.println("The player goals is "+goals);
		}
		
		System.out.println("The player position is "+position);
	}
}

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    cricket_1 c=new cricket_1("Virat",34,5.11,"India",3,55);
    Football f=new Football("Messi",34,5.11,"Argentina",3,"forward");
     c.displayCricketStats();
     f.displayFootballStats();
     
	}

}
