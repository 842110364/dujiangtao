

public class mainsystem {
	 
	
	public static void main(String[] args) {
		
			denglu x=new denglu();//创建新的对象用于登录注册模块功能
			
			x.deng();//显示登录注册界面

	    /**
	    * 每次输入指令时判断一次指令输入形式是否错误
		*/
		while(true) {
				
				try {
					x.i=x.input.nextInt();
				}
				catch(Exception e) {
					System.out.println("输入命令错误，请重新输入");
					x.input.next();
					continue;
				}
				
		if(x.i==1){//检测到输入管理员登录指令执行
			  x.input.nextLine();
			  x.guan();
			
		}
		
		else if(x.i==2)//当输入学生登录指令时执行
		{
			x.input.nextLine();
			x.xueshen();
			
		}
		
		else if(x.i==3) {//当输入注册指令时执行
			x.input.nextLine();
			x.zhuce();
			x.deng();
		}
		else
			System.out.println("输入命令错误，请重新输入");
		}
		
	}
	}



