
public class zuoye99 {
	public static void main(String[] args) {
		RugularPolygon ru1=new RugularPolygon();
		RugularPolygon ru2=new RugularPolygon(6,4);
		RugularPolygon ru3=new RugularPolygon(10,4,5.6,7.8);
		System.out.println("ru1 Perimeter="+ru1.getPerimeter()+" Area="+ru1.getArea());
		System.out.println("ru2 Perimeter="+ru2.getPerimeter()+" Area="+ru2.getArea());
		System.out.println("ru3 Perimeter="+ru3.getPerimeter()+" Area="+ru3.getArea());


	}

}
