package plane;

public class PlaneController {
	public void moveUp() {
		System.out.println("Plane move UP on " + Math.random()*100 + "km");
	}

	public void moveDown() {
		System.out.println("Plane move DOWN on " + Math.random()*100 + "km");
	}

	public void moveRight() {
		System.out.println("Plane move RIGHT on " + Math.random()*100 + "km");
	}

	public void moveLeft() {
		System.out.println("Plane move LEFT on " + Math.random()*100 + "km");
	}

}
