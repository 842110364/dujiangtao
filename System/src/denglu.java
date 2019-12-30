import java.util.Scanner;
import java.util.Vector;

public class denglu {
	
	int i;//用于记录每次输入的指令
	String s1,s2; //定义两个临时变量存放当前输入的账号密码
	Admin a = new Admin();//创建一个对象用于实现唯一的管理员账号登录管理
	Scanner input = new Scanner(System.in);
	
    private static Vector<student> st = new Vector<student>();//创建一个用于存储学生信息的Vector
	
    /**
     * 定义一组临时变量存放新输入用户数据
     */
	private String username;
	private String xingm;
	private String password;
	private String phoneNumber;
	private String xingbie;
	 	
	public denglu() {//设定管理员账号初始账号密码
		a.setID("Admin");
		a.setpa("123456");
	}
	public void deng(){//用于弹出初始登录界面
		System.out.println("毕业生就业去向管理平台:");
        System.out.println("管理员登录请输入1");
		System.out.println("学生登录请输入2");
		System.out.println("注册请输入3");
		System.out.println("Tips:默认管理员账号：Admin 密码：123456");
	}
	
	public void pp() {//判断用户名是否存在
		System.out.println("请输入用户名（请输入您的学号）");
		try {
			username=input.nextLine();
			 char[] ch = username.toCharArray(); 
		       for(int i=0;i<ch.length;i++){ 
		       if(!Character.isDigit(ch[i]))//判断是否数字 
		    	   throw new Exception();
			   }
		      
			}
			catch(Exception e) {
				System.out.println("请不要输入数字以外的符号");
				pp();
			}
	}
	public void panyong() {//判断用户名设置是否正确
		System.out.println("请输入用户名（请输入您的学号）");
		try {
			username=input.nextLine();
		     char[] ch = username.toCharArray(); 
		       for(int i=0;i<ch.length;i++){ 
		       if(!Character.isDigit(ch[i]))//判断是否数字 
		    	   throw new Exception();
			   }
		       for(student v:st)
					if(username.equals(v.getusername()))
					{
						System.out.println("该用户已经存在");
						panyong();
						break;
					}
			}
			catch(Exception e) {
				System.out.println("请不要输入数字以外的符号");
				panyong();
			}
	}
	public void panph() {//判断联系电话设置是否正确
		System.out.println("请输入您的联系电话");
		try {
			phoneNumber=input.nextLine();
		     char[] ch =phoneNumber.toCharArray(); 
		       for(int i=0;i<ch.length;i++){ 
		       if(!Character.isDigit(ch[i]))//判断是否数字 
		           throw new Exception();
		    	
			   }
			}
			catch(Exception e) {
				System.out.println("请不要输入数字以外的符号");
				panph();
			}
	}
	public void panmi() {//判断密码设置是否正确
		String pa;
		System.out.println("请输入密码");
		password=input.nextLine();
		System.out.println("请第二次输入密码");
		pa=input.nextLine();
		if(!pa.equals(password))
		{
			System.out.println("二次输入密码不一致，请重新输入");
			panmi();
		}
		
		
	}
	public void panxing() {//判断性别设置是否正确
		int b;
		System.out.println("男性请输入1，女性请输入0");
		try {
		b=input.nextInt();
		if(b==1)
			xingbie="男";
		else if(b==0)
			xingbie="女";
		else {
			System.out.println("指令错误，请重新输入正确指令");
			panxing();
		}
		}
		catch(Exception e) {
			System.out.println("指令错误，请重新输入正确指令");
			input.next();
			panxing();
		}
		}
	public void insertst(student x)//插入一个新的学生数据
	{
		int l=0,r=st.size()-1;
		int c;
		if(st.size()==0)
		{
			st.add(x);
			return;
		}
		while(l<=r)
		{
		int mid=(l+r)/2;
		
		c=st.elementAt(mid).getusername().compareTo(x.getusername());
			if(c<0)
				r=mid-1;
			else if(c>0)
				l=mid+1;
			else
			{
				System.out.println("该用户已经存在,请重新输入");
				zhuce() ;
				deng();
			}
			
		}
		
			st.insertElementAt(x, l);
		
		
	}
	public void zhuce() {//用于注册新的学生账号
	
		panyong();
		System.out.println("请输入姓名");
		xingm=input.nextLine();
		panmi();
		panph();
		panxing();
		student t=new student(username, xingm,password,phoneNumber,xingbie);
		insertst(t);
		System.out.println("注册成功,请登录");
		
	}
	
	public void hedui() {//用于核对每次输入的账号密码
		System.out.println("请输入账号：");
		s1=input.nextLine();
		System.out.println("请输入密码：");
		s2=input.nextLine();
	}
	public void guanli(Admin i) {//管理员登录后界面
		if(i.getxingm()!=null)
			System.out.println("欢迎回来，"+i.getxingm());
		else
			System.out.println("欢迎回来，Admin");
		System.out.println("个人中心请输入11");
		System.out.println("人员信息管理请输入12");
		System.out.println("信息汇总平台请输入13");
		System.out.println("退出登录请输入14");
	}
	public void xinxi() {//管理员重置个人信息
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
    		
    	
    	 if(i==1) {//重置姓名
    		 
    		System.out.println("请输入姓名：");
    		input.nextLine();
 			a.setxingm(input.nextLine());
 			
 		}
 		else if(i==2) {//重置密码
 			input.nextLine();
 			panmi();
 			a.setpa(password);
 		}
 		else if(i==3)//重置联系电话
 		{
 			input.nextLine();
 			panph();
 			a.setph(phoneNumber);
 		}
 		else if(i==4) {//重置性别
 			input.nextLine();
 			panxing();
 			a.setxingbie(xingbie);
 		}
 		else//返回上级界面
 		{
 			
    	 guanli(a);
    	 break;
    }
    	 System.out.println("设置成功");
    	
    }
	}
	
	
	public void zuo(renyuan r) {//实现增删改查操作
		while(true){

			/**
			 * 重复判断指令形式是否错误
			 */
			try {
				i=input.nextInt();
			}
			catch(Exception e) {
				System.out.println("输入命令错误，请重新输入");
				input.next();
				continue;
			}
		    if(i==5){ //返回上级界面
			
			break;
		    }
		    else if(i==1) { //增加记录
		    	input.nextLine();
		    	zhuce();
		    	r.xian();
		    }
            else if(i==2) { //删除记录
            	input.nextLine();
            	pp();
            	r.shan(username,st);
            	r.xian();
		    }
            else if(i==3) { //编辑记录
            	input.nextLine();
            	pp();
            	 for(student v:st) {
 					if(username.equals(v.getusername()))
 					{
 						r.gai(username,v,input);
 						break;
 						}
 					else
 					{
 						System.out.println("该用户不存在");
 						pp();
 						
 					}
            	 }
            	r.xian();
		    }
            else if(i==4) { //查询记录
            	input.nextLine();
            	
            	r.cha(st, input);
            	r.xian();
		    }
            else
        	  System.out.println("输入命令错误，请重新输入");
		    }
	}

	public void guan() {//处理管理员界面操作
		hedui();//每次输入管理员登录指令，弹出管理员登录界面
		
		/**
		 * 密码或账号错误时提示并重新弹出登录界面
		 */
		while(!s1.equals("Admin")||!s2.equals(a.getpa()))
		{
			System.out.println("账号或密码输入错误，请重新输入");
			deng();
		}
		
		/**
		 * 管理员账号密码通过验证，弹出下一级操作界面
		 */
		System.out.println("登录成功");
		guanli(a);
		
		/**
		 * 不断循环直至用户输入正确指令
		 */
		while(true){

			/**
			 * 重复判断指令形式是否错误
			 */
			try {
				i=input.nextInt();
			}
			catch(Exception e) {
				System.out.println("输入命令错误，请重新输入");
				input.next();
				continue;
			}
		    if(i==14){ //输入退出指令时，退出循环，重新进入初始登录界面
			deng();
			break;
		    }
		    else if(i==11) {//进入个人中心操作
		    	System.out.println("个人中心");
		    	geren g=new geren(a);
		    	xinxi();
		    	
		    }
            else if(i==12) {//进入人员信息管理
            	renyuan r=new renyuan(st);//输出所有人员列表
            	r.xian();//显示增删改查界面
            	zuo(r);
            	
            	guanli(a);
		    }
            else if(i==13) {//进入信息汇总平台
        	
        	    huizong h=new huizong();
        	    h.a(st, input);
        	   
            	guanli(a);
		    }
            else
        	  System.out.println("输入命令错误，请重新输入");
		    }
	}
	
	public void xue(student t) {//学生登录后界面
		
			if(t.getxingm()!=null)
				System.out.println("欢迎回来，"+t.getxingm());
			else
				System.out.println("欢迎回来，"+t.getusername());
		System.out.println("个人中心请输入21");
		System.out.println("就业登记请输入22");
		System.out.println("退出请输入23");
	}
	
	
	@SuppressWarnings("static-access")
	public void xues(student t) {//对学生界面输入的操作进行处理
		while(true){

			/**
			 * 重复判断指令形式是否错误
			 */
			try {
				i=input.nextInt();
			}
			catch(Exception e) {
				System.out.println("输入命令错误，请重新输入");
				input.next();
				continue;
			}
		    
		    if(i==23){ //输入退出指令时，退出循环，重新进入初始登录界面
			deng();
			break;
		    }
		    else if(i==21) {//进入个人中心
		    	System.out.println("个人中心");
		    	geren g=new geren(t);
		    	g.xinxi(t, input);
		    	xue(t);
		    }
            else if(i==22) {//进入就业登记
        	
            	jiuye j=new jiuye();
            	j.jiu(t, input);
            	xue(t);
		    }
           
            else
        	  System.out.println("输入命令错误，请重新输入");
		    }
			
	}
	
	
	
	public static student contains(String x)//判断是否存在该用户，存在返回用户对象引用，不存在返回null
	{
		for(student v:st)
			if(x.equals(v.getusername()))
				return v;
		return null;
	}
	public void xueshen() {//对学生登录时的账号密码进行验证
		System.out.println("请输入账号：");
		s1=input.nextLine();
		student t;
		t=contains(s1);
		if(t==null) {
			System.out.println("该用户不存在，请重新输入");
			deng();
			}
		else {
			System.out.println("请输入密码：");
			s2=input.nextLine();
			if(t.getpa().equals(s2))
			{
				System.out.println("登录成功");
				xue(t);//弹出学生操作界面
				xues(t);//对学生界面输入的操作进行处理
			}
			else
			{
				System.out.println("密码错误，请重新输入");
				xueshen();
			}
		}	
	}
	
	
	
	
}
