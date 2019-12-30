import java.util.Scanner;

public class jiuye {
	int x;
	public void jiu(student t,Scanner input) {
		if(t.getquxiang()==null) {
			System.out.println("就业去向：无");
            System.out.println("工作请输入1");
            System.out.println("创业请输入2");
            System.out.println("待业请输入3");
            System.out.println("研究生请输入4");
            System.out.println("其他请输入5");
            System.out.println("返回上级界面请输入6");
		}
		else
		{
			System.out.println("就业去向："+t.getquxiang());
			if(t.getquxiang().equals("工作"))
			   System.out.println("单位和岗位："+t.getbeizhu());
			else if(t.getquxiang().equals("创业"))
				System.out.println("单位和岗位："+t.getbeizhu());
			else if(t.getquxiang().equals("待业"))
				System.out.println("去处："+t.getbeizhu());
			else if(t.getquxiang().equals("研究生"))
				System.out.println("学校信息："+t.getbeizhu());
			else
				System.out.println("备注："+t.getbeizhu());
			System.out.println("工作请输入1");
            System.out.println("创业请输入2");
            System.out.println("待业请输入3");
            System.out.println("研究生请输入4");
            System.out.println("其他请输入5");
            System.out.println("返回上级界面请输入6");
		}
		
		while(true){

			/**
			 * 重复判断指令形式是否错误
			 */
			try {
				x=input.nextInt();
			}
			catch(Exception e) {
				System.out.println("输入命令错误，请重新输入");
				input.next();
				continue;
			}
		    
		    if(x==1){ 
		    	
			t.setquxiang("工作");
			System.out.println("请输入单位和岗位：");
			input.nextLine();
			t.setbeizhu(input.nextLine());
			break;
		    }
		    else if(x==2) {
		    	t.setquxiang("创业");
				System.out.println("请输入单位和岗位：");
				input.nextLine();
				t.setbeizhu(input.nextLine());
				break;
		
		    }
            else if(x==3) {
            	t.setquxiang("待业");
				System.out.println("请输入去处：");
				input.nextLine();
				t.setbeizhu(input.nextLine());
				break;
            	
		    }
            else if(x==4) {
        	
            	t.setquxiang("研究生");
				System.out.println("请输入学校信息：");
				input.nextLine();
				t.setbeizhu(input.nextLine());
				break;
				
		    }
            else if(x==5) {
            	t.setquxiang("其他");
				System.out.println("请输入备注：");
				input.nextLine();
				t.setbeizhu(input.nextLine());
				break;
            	
		    }
            else if(x==6) {
            	
            	break;
		    }
            else
        	  System.out.println("输入命令错误，请重新输入");
		    }
			
	}
	}
	


