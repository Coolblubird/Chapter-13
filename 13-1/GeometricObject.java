import java.util.Date;

//Jordan Ashe 4-15-21

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;

	protected GeometricObject() {
		dateCreated = new Date();
	}

	protected GeometricObject(String c, boolean f) {
		dateCreated = new Date();
		this.color = c;
		this.filled = f;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		this.color = c;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean f) {
		this.filled = f;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	public abstract double getArea();

	public abstract double getPeri();
}