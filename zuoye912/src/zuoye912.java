
public class zuoye912 {

	public static void main(String[] args) {
		System.out.println("Enter x1,y1,x2,y2,x3,y3,x4,y4:");
		java.util.Scanner input=new java.util.Scanner(System.in);
		double x1=input.nextInt(),y1=input.nextInt(),x2=input.nextInt(),y2=input.nextInt(),x3=input.nextInt(),y3=input.nextInt(),x4=input.nextInt(),y4=input.nextInt();
		double a,b,c,d,e,f;
		a=y1-y2;
		b=-x1+x2;
		c=y3-y4;
		d=-x3+x4;
		e=(y1-y2)*x1-(x1-x2)*y1;
		f=(y3-y4)*x3-(x3-x4)*y3;
		LinearEquation li= new LinearEquation(a,b,c,d,e,f);
		if(li.isSolvable()==true)
		   System.out.println("("+li.getx()+","+li.gety()+")");
		else
		   System.out.println("The equation has no solution");
		
	}

}
