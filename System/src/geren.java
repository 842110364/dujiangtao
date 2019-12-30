import java.util.Scanner;

public class geren {
	
	public static void xinxi(student t,Scanner input) {//重置学生个人信息
		int i;
		while(true) {
    		try {
    			 i=input.nextInt();
    			if(i!=5&&i!=4&&i!=3&&i!=2&&i!=1)
   	    	 {
   	    		 System.out.println("输入命令错误，请重新输入");
   	    		
   	    		 continue;
   	    	 }
    		}
    		catch(Exception e) {
    			System.out.println("输入命令错误，请重新输入");
    			input.next();
    			continue;
    		}
    		
    	
    	 if(i==1) {
    		 
    		System.out.println("请输入姓名：");
    		input.nextLine();
 			t.setxingm(input.nextLine());
 			
 		}
 		else if(i==2) {
 			input.nextLine();
 			panmi(t,input);
 			
 		}
 		else if(i==3)
 		{
 			input.nextLine();
 			panph(t,input);
 			
 		}
 		else if(i==4) {
 			input.nextLine();
 			panxing(t,input);
 			
 		}
 		else
 		{
 			
    	 
    	 break;
    }
    	 System.out.println("设置成功");
    	
    }
	}
	public static void panmi(student t,Scanner input) {//判断密码设置是否正确
		String pa;
		System.out.println("请输入密码");
		pa=input.nextLine();
		System.out.println("请第二次输入密码");
		
		if(!pa.equals(input.nextLine()))
		{
			System.out.println("二次输入密码不一致，请重新输入");
			panmi(t,input);
		}
		else
			t.setpa(pa);
	}
	public static void panxing(student t,Scanner input) {//判断性别设置是否正确
		int b;
		System.out.println("男性请输入1，女性请输入0");
		try {
		b=input.nextInt();
		if(b==1)
			t.setxingbie("男");
		else if(b==0)
			t.setxingbie("女");
		else {
			System.out.println("指令错误，请重新输入正确指令");
			panxing(t,input);
		}
		}
		catch(Exception e) {
			System.out.println("指令错误，请重新输入正确指令");
			input.next();
			panxing(t,input);
		}
		}
	public static void panph(student t,Scanner input) {//判断联系电话设置是否正确
		System.out.println("请输入您的联系电话");
		String u;
		try {
			u=input.nextLine();
		     char[] ch =u.toCharArray(); 
		       for(int i=0;i<ch.length;i++){ 
		       if(!Character.isDigit(ch[i]))//判断是否数字 
		       { 
		    	   throw new Exception();
		      
		       }
			   }
		       t.setph(u);
		       
			}
			catch(Exception e) {
				System.out.println("请不要输入数字以外的符号");
				panph(t,input);
			}
	}
	public void gg(man i) {

		System.out.println("姓名："+i.getxingm()+" 密码 ："+i.getpa()+" 联系电话："+i.getph()+" 性别："+i.getxing());
		System.out.println("修改姓名请输入1");
		System.out.println("修改密码请输入2");
		System.out.println("修改联系电话请输入3");
		System.out.println("修改性别请输入4");
		System.out.println("返回上级界面请输入5");
	}
	public geren(man i) {
		gg(i);
	}
	

}
