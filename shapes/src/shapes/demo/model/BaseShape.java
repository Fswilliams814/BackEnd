package shapes.demo.model;

public abstract class BaseShape implements Shape {
	
	protected abstract ShapeInfo shapeInfo();

	

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		String area = String.format("%.2f", area());
		String perimeter = String.format("%.2f", perimeter());
		ShapeInfo info = shapeInfo();
		String lf = System.lineSeparator();
		//text block
		String desc = """
				This shape is a %s. It has %d dimensions(s)
				used in the area and perimeter calculations:
				""".formatted(info.getName(), info.getDimensions().size());
		for(Dimension dimension : info.getDimensions()) {
			desc += lf + " " + dimension;
		}
		
		desc += "The area"

	}

}
