//LaDarion Wells
package Shapes;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Driver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Color color = StdDraw.BLACK;
		Shape newShape;
		

		while (true) {
			System.out.println("Please enter a command: square, circle, triangle, background, undo");
				String command = keyboard.next();
				//an if statement based off what command the user has inputted
			if(command.equalsIgnoreCase("Circle")) {
				System.out.println("Where would you like your circle?");
				//User inputted x postion
				System.out.println("Enter an x position:");
				int xPos = keyboard.nextInt();
				//User inputted y position
				System.out.println("Enter a y position:");
				int yPos = keyboard.nextInt();
				System.out.println("Choose a color for your cirlce: MellowYellow, PurpleMurple, GreenBean");
				String color1 = keyboard.next();
					if(color1.equalsIgnoreCase("MellowYellow")) {
						color = ShapeManager.MellowYellow;
					}else if(color1.equalsIgnoreCase("PurpleMurple")) {
						color = ShapeManager.PurpleMurple;
					}else if(color1.equalsIgnoreCase("GreenBean")) {
						color = ShapeManager.GreenBean;
					}
					newShape = new Shape(xPos,yPos,Shape.State.Cirlce,color);
					ShapeManager.addShape(newShape);
			}
			if(command.equalsIgnoreCase("Square")) {
				System.out.println("Where would you like your square?");
				System.out.println("Enter an x position:");
				int xPos = keyboard.nextInt();
				System.out.println("Enter a y position:");
				int yPos = keyboard.nextInt();
				System.out.println("Choose a color for your square: MellowYellow, PurpleMurple, GreenBean");
				String color1 = keyboard.next();
					if(color1.equalsIgnoreCase("MellowYellow")) {
						color = ShapeManager.MellowYellow;
					}else if(color1.equalsIgnoreCase("PurpleMurple")) {
						color = ShapeManager.PurpleMurple;
					}else if(color1.equalsIgnoreCase("GreenBean")) {
						color = ShapeManager.GreenBean;
					}
					newShape = new Shape(xPos,yPos,Shape.State.Square,color);
					ShapeManager.addShape(newShape);
			
		}
			if(command.equalsIgnoreCase("Triangle")) {
				System.out.println("Where would you like your Triangle?");
				//User inputted x postion
				System.out.println("Enter an x position:");
				int xPos = keyboard.nextInt();
				//User inputted y position
				System.out.println("Enter a y position:");
				int yPos = keyboard.nextInt();
				System.out.println("Choose a color for your triangle: MellowYellow, PurpleMurple, GreenBean");
				String color1 = keyboard.next();
					if(color1.equalsIgnoreCase("MellowYellow")) {
						color = ShapeManager.MellowYellow;
					}else if(color1.equalsIgnoreCase("PurpleMurple")) {
						color = ShapeManager.PurpleMurple;
					}else if(color1.equalsIgnoreCase("GreenBean")) {
						color = ShapeManager.GreenBean;
					}
					newShape = new Shape(xPos,yPos,Shape.State.Triangle,color);
					ShapeManager.addShape(newShape);
			}
			
			if(command.equalsIgnoreCase("Background")) {
				System.out.println("Choose a background: MellowYellow, PurpleMurple, GreenBean");
				System.out.println("Choose a color for your background: MellowYellow, PurpleMurple, GreenBean");
				String color1 = keyboard.next();
					if(color1.equalsIgnoreCase("MellowYellow")) {
						color = ShapeManager.MellowYellow;
					}else if(color1.equalsIgnoreCase("PurpleMurple")) {
						color = ShapeManager.PurpleMurple;
					}else if(color1.equalsIgnoreCase("GreenBean")) {
						color = ShapeManager.GreenBean;
					}
					ShapeManager.changeBackground(color);
			}
			
			if(command.equalsIgnoreCase("undo")) {
				ShapeManager.undo();
			}
	}

}

}