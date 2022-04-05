//LaDarion Wells
package Shapes;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class State {
	private Color background = StdDraw.WHITE;
	private Shape[] shapes;
	private int numberOfShapes;
	private static final int MAX_NUMBER_SHAPES = 4;

	public State() {
		StdDraw.clear(background);
		this.numberOfShapes = 0;
		shapes = new Shape[MAX_NUMBER_SHAPES];
	}
	
	public State(State other) { //deep copy contructor
		this.background = other.background;
		this.numberOfShapes = other.numberOfShapes;
		this.shapes = new Shape[numberOfShapes];
			
			for(int i = 0; i<shapes.length; i++) {
				this.shapes[i] = new Shape(other.shapes[i]);
			}
	}
	
	public void setBackground(Color color) {
		this.background = color;
		StdDraw.clear(color);//  To prevent overlapping background color
	}
	
	public boolean addShapeToState(Shape shape) {
		if(numberOfShapes >= MAX_NUMBER_SHAPES) {
			return false;
		}
		shapes[numberOfShapes++] = shape;
		return true;
	}
	
	public Color getColor() {
		return background;
	}
	
	public void  draw(Color color2) {
		background = color2;
		setBackground(color2);
		for(int i = 0; i < numberOfShapes; ++i) {
			shapes[i].draw();
		}
		
	}
}
