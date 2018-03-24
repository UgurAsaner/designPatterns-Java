package facade;

public class Main {

	public static void main(String[] args) {
		
		ShapeFacade shapeFacade = new ShapeFacade();
		
		System.out.println("\nDrawing Shapes One By One:\n");
		shapeFacade.drawCircle();
		shapeFacade.drawTriangle();
		shapeFacade.drawRectangle();

		System.out.println("\nDrawing All Shapes:\n");
		shapeFacade.drawAll();


		
	}

}
