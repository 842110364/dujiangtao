
public class TestPassObject {
	public static void printAreas(CirClewhithPrivateDateFields  c,int times) {
		System.out.println("Radius \t\tArea");
		for(int i=1;i<=times;++i) {
		System.out.println(c.getRadius()+"\t\t"+c.getArea());
		c.setRadius(c.getRadius()+1);
		}
	}

	public static void main(String[] args) {
		CirClewhithPrivateDateFields  myCircle=new CirClewhithPrivateDateFields(1);
		int n=5;
		printAreas(myCircle,n);
		System.out.println("\n"+"Radius is "+myCircle.getRadius());
		System.out.println("n is "+n);
		

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
