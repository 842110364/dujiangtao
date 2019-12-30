
public class CircleWithSticMembers {

	double radius;
	static int numberOfObjects=0;
	CircleWithSticMembers(){
		radius=1;
		numberOfObjects++;
	}
	
	static int getNumbersOfObjects() {
		return numberOfObjects;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}
}

