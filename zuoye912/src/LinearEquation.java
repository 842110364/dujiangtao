
public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	public double geta() {
		return this.a;
	}
	public double getb() {
		return this.b;
	}
	public double getc() {
		return this.c;
	}
	public double getd() {
		return this.d;
	}
	public double gete() {
		return this.e;
	}
	public double getf() {
		return this.f;
	}
	public boolean isSolvable(){
		if(a*d-b*c!=0)
		    return true;
		else
			return false;
	}
	public double getx() {
		
		return (e*d-b*f)/(a*d-b*c);
	}
	public double gety() {
		return (a*f-e*c)/(a*d-b*c);
	}

}
