package plane;

public class Su27 extends Plane implements BattlePlane {

	private String color;
	private int maxSpeed;

	public Su27(int length, int height, int weight, PlaneController planeController, String color, int maxSpeed) {
		super(length, height, weight, planeController);
		this.setColor(color);
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void turboBoost() {
		System.out.println("Turbo speed is " + (Math.random() * (3000 - maxSpeed) + maxSpeed) + " m/s");
	}

	@Override
	public void stelsTechnology() {
		System.out.println("Plane is invisible during " + (Math.random() * 100) + " seconds");

	}

	@Override
	public void nuclearStrike() {
		System.out.println((int) (Math.random() * 10) + " warheads will be dropped on Moscow");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
