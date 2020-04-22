
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot  Rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		for (int i = 0; i < 4; i++) {
			Rob.penDown();
			Rob.setSpeed(100);
			Rob.move(100);
			Rob.turn(90);
		}
				
				//3. Set the pen width to 10
		Rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("What color pen do you want Rob to draw with");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals( "Red")) {
			Rob.setPenColor(Color.red);
		}
		if (color.equals( "Blue")) {
			Rob.setPenColor(Color.blue);
		}
		if (color.equals( "Green")) {
			Rob.setPenColor(Color.green);
		}
			//6. If the user doesn’t enter anything, choose a random color
		else { 
			Rob.setRandomPenColor();
		}
		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
