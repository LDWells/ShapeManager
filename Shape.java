//LaDarion Wells
package Shapes;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Shape {

	private int x;
	private int y;
	private Shape shapes;
	private Color color;
	private static final int size = 50;
	private State shapeState;
	
	public enum State {
		Square, Cirlce, Triangle;
	}
	
	public Shape(int x, int y, State state, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.shapeState = state;
	}
	
	public Shape(Shape other) {
		this.x = other.x;
		this.y = other.y;
		this.shapes = other.shapes;
		this.color = other.color;
		this.shapeState = other.shapeState;
	}
	


	public void draw() {
		if(shapeState == Shape.State.Cirlce) {
			StdDraw.setPenColor(color);
			StdDraw.filledCircle(x, y, size);
		}
		
		if(shapeState == Shape.State.Square) {
			StdDraw.setPenColor(color);
			StdDraw.filledSquare(x, y, size);
		}
		//In order to make a triangle
		double[] xPos = {this.x, (this.x +50), (this.x-50) }; 
		double[] yPos = {this.x, (this.y -50), (this.y-50) };
		
		if(shapeState == Shape.State.Triangle) {
			StdDraw.setPenColor(color);
			StdDraw.filledPolygon(xPos, yPos);
		}
	}
	
}
