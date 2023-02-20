package plane;

public class Main {
	public static void main(String[] args) {
		PlaneController planeController = new PlaneController();
		Su27 su27 = new Su27(10, 100, 500, planeController, "white", 400);

		su27.engineStarting();
		su27.takeoffPlane();
		su27.getPlaneController().moveUp();
		su27.getPlaneController().moveRight();
		su27.stelsTechnology();
		su27.nuclearStrike();
		su27.turboBoost();
		su27.getPlaneController().moveLeft();
		su27.getPlaneController().moveDown();
		su27.planeLanding();

	}
}
