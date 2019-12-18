package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	 Robot rob=new Robot();
	 
	public static void main(String[] args) {
	Houses obj=new Houses();
		obj.house("small", "ff");
	
		
	}
	void house(String height, String color) {
		int x;
		
	if (height.equals("small")) {
		x=60;
		
	}else if(height.equals("large")) {
		x=250;
		
	}else {
		x=120;
	}
		
		for (int i = 0; i < 9; i++) {
		rob.penDown();
		rob.setSpeed(10);
		
		if (color.equals("Red")) {
			rob.setPenColor(Color.red);
		}else if (color.equals("Blue")) {
			rob.setPenColor(Color.blue);
		}else {
			rob.setPenColor(Color.pink);
		}
		
		rob.move(x);
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
		rob.move(x);
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(25);
		rob.turn(-90);
	}	
		
		
		
	}

	
	public void run(String height, String color) {	
	
	}}
