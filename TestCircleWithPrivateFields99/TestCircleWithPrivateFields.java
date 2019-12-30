
public class TestCircleWithPrivateFields {

	public static void main(String[] args) {
		CirClewhithPrivateDateFields myCircle=new CirClewhithPrivateDateFields(5.0);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+"is "+myCircle.getArea());

		myCircle.setRadius(myCircle.getArea()*1.1);
		System.out.println("The area of the circle of radius "+myCircle.getRadius()+"is "+myCircle.getArea());
		System.out.println("The number of objects created is "+CirClewhithPrivateDateFields.getNumberOfObjects());
	}

}
class CirClewhithPrivateDateFields {
	private double radius=1;
	private static int numberOfObjects=1;
	public CirClewhithPrivateDateFields() {
		numberOfObjects++;
	}
	public CirClewhithPrivateDateFields(double newRadius) {
		radius=newRadius;
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		radius=(newRadius >=0)?newRadius:0;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
}
