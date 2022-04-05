//LaDarion Wells
package Shapes;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class ShapeManager {
	
	public static final Color MellowYellow = new Color(225, 225, 20);
	public static final Color PurpleMurple = new Color(255, 0, 255);
	public static final Color GreenBean = new Color(0, 255, 0);
	
	public static final int canvasSize = 500;
	private static int numberUndo =0;
	//to keep track of what to undo
	private static State currentState = new State();
	private static State previousState;
	
	static {
		StdDraw.setCanvasSize(canvasSize, canvasSize);
		StdDraw.setScale(0, canvasSize);
	}

	public static void addShape(Shape shape) {
		previousState = new State(currentState);
		if(currentState.addShapeToState(shape)) {
		shape.draw();
		}
	}
	
	public static void changeBackground(Color color) {
		previousState = new State(currentState);
		currentState.draw(color);
	}
	
	public static void undo() {
		if(previousState == null || numberUndo >0) {
			System.out.println("Nothing to undo.");
		} else {
			previousState.draw(previousState.getColor());
			numberUndo++;
		}
	}
}
