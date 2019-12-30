
public class SimpleGeometericObject {
	private String color="white";
	private boolean filled;
	private java.util.Date datecreated;
	 
	public SimpleGeometericObject() {
		datecreated =new java.util.Date();
	}
	
	public SimpleGeometericObject(String color,boolean filled) {
		datecreated =new java.util.Date();
		this.color=color;
		this.filled=filled;
		
	}
	
	public String getColor() {
		return color;
		
	}
	
	public void setColor(String color) {
		this.color=color;
		
	}
	
	public boolean isFilled() {
		return filled;
	}

}
