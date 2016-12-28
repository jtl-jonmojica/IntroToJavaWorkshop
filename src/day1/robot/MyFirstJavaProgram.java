package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot chewbaca=new Robot();
chewbaca.setPenColor(255,0,0);
chewbaca.setSpeed(10);
chewbaca.penDown();
chewbaca.move(500);
chewbaca.turn(90);		
chewbaca.move(500);
chewbaca.turn(90);
chewbaca.move(500);
chewbaca.turn(90);	
chewbaca.move(500);	
for (int i = 0; i < 1010; i++) {
	chewbaca.turn(10);
}
 }

}
