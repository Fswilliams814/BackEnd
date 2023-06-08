package shapes.demo.model;

public class Dimension {
	private String name;
	private double length;
	
	public Dimension(String name, double length) {
		super();
		this.name = name;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Dimension [name=" + name + ", length=" + length + "]";
	}
	
	

}
