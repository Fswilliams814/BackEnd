package shapes.demo.model;

public class ShapeInfo {
	private String name;
	private List <Dimension> dimensions = new LinkList<>();

public ShapeInfo(String name) {
	this.name = name;
}

public void setName(String name) {
	this.name = name;
}

public void setDimensions(List<Dimension> dimensions) {
	this.dimensions = dimensions;
}
}

