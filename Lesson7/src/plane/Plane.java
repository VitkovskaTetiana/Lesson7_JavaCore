package plane;

public abstract class Plane {
	private int length;
	private int height;
	private int weight;
	private PlaneController planeController;
	
	
	public Plane (int length, int height, int weight, PlaneController planeController) {
		this.setLength(length);
		this.setHeight(height);
		this.setWeight(weight);
		this.planeController = planeController;
	}

	public void engineStarting() {
		System.out.println("Engine starts in " + (Math.random() * 68 + 20) + " seconds");
	}

	public void takeoffPlane() {
		System.out.println("Plane is able to fly " + (Math.random() * 1000)  +" kilometers");
	}
	
	public void planeLanding() {
		System.out.println("Plane is landing");
	}
	
	public PlaneController getPlaneController() {
		return this.planeController;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
