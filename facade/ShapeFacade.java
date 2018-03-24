package facade;
import facade.Circle;
import facade.Rectangle;
import facade.Shape;
import facade.Triangle;

public class ShapeFacade {
	
	private Shape circle, triangle, rectangle;
	
	public ShapeFacade() {
		circle = new Circle();
		triangle = new Triangle();
		rectangle = new Rectangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawTriangle() {
		triangle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawAll() {
		circle.draw();
		triangle.draw();
		rectangle.draw();
	}
}
