
public class RugularPolygon {
	private int n ;
	private double side;
	private double x;
	private double y;
	public RugularPolygon() {
		n=3;
		side=1;
		x=0;
		y=0;
	}
	
	public RugularPolygon(int n,double side) {
		this.n=n;
		this.side=side;
		x=0;
		y=0;
	}
	public RugularPolygon(int n,double side,double x,double y) {
		this.n=n;
		this.side=side;
		this.x=0;
		this.y=0;
	}
	
	public void setn(int n){
		this.n=n;
	}
	public int getn() {
		return this.n;
	}
	public void setside(double side){
		this.side=side;
	}
	public double getside() {
		return this.side;
	}
	public void setx(double x){
		this.x=x;
	}
	public double getx() {
		return this.x;
	}
	public void sety(double y){
		this.y=y;
	}
	public double gety() {
		return this.y;
	}
	
	public double getPerimeter() {
		double pe= n * side;
		return pe;
	}
	public double getArea() {
		double area=n*side*side/(4*Math.tan(Math.PI/n));
		return area;
	}

}
