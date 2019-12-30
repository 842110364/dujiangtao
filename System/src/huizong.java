import java.util.Scanner;
import java.util.Vector;
    public class huizong{
    	
    	/**
    	 * 创建一组临时变量统计男女比例和就业分布
    	 */
    	private int nan;
    	private int nv;
    	private int gong;
    	private int chuang;
    	private int yan;
    	private int dai;
    	private int qi;
    	
    	public void hui() {//弹出管理界面
    		System.out.println("搜索请输入1");
    		System.out.println("单届毕业生统计查询请输入2");
    		System.out.println("全部毕业生统计查询请输入3");
    		System.out.println("返回上级界面请输入4");
    	}
    	public void shu(Vector<student> st) {//输出所有人员
    		System.out.println("选择工作的有：");
    		for(student v:st) {
    			if(v.getquxiang()!=null&&v.getquxiang().equals("工作"))
    				System.out.println("用户名"+v.getusername()+"姓名："+v.getxingm()+" 密码 ："+v.getpa()+" 联系电话："+v.getph()+" 性别："+v.getxing());
    		}
    		System.out.println("选择创业的有：");
    		for(student v:st) {
    			if(v.getquxiang()!=null&&v.getquxiang().equals("创业"))
    				System.out.println("用户名"+v.getusername()+"姓名："+v.getxingm()+" 密码 ："+v.getpa()+" 联系电话："+v.getph()+" 性别："+v.getxing());
    		}
    		System.out.println("选择研究生的有：");
    		for(student v:st) {
    			if(v.getquxiang()!=null&&v.getquxiang().equals("研究生"))
    				System.out.println("用户名"+v.getusername()+"姓名："+v.getxingm()+" 密码 ："+v.getpa()+" 联系电话："+v.getph()+" 性别："+v.getxing());
    		}
    		System.out.println("选择待业的有：");
    		for(student v:st) {
    			if(v.getquxiang()!=null&&v.getquxiang().equals("待业"))
    				System.out.println("用户名"+v.getusername()+"姓名："+v.getxingm()+" 密码 ："+v.getpa()+" 联系电话："+v.getph()+" 性别："+v.getxing());
    		}
    		System.out.println("选择其他的有");
    		for(student v:st) {
    			if(v.getquxiang()!=null&&v.getquxiang().equals("其他"))
    				System.out.println("用户名"+v.getusername()+"姓名："+v.getxingm()+" 密码 ："+v.getpa()+" 联系电话："+v.getph()+" 性别："+v.getxing());
    		}
    		
    	}
    	public void ren(Vector<student> st) {//输出可能的信息

    		for(student v:st) {
    	       System.out.print("用户名:"+v.getusername()+" "+"姓名:"+v.getxingm()+" "+"密码:"+v.getpa()+" "+"联系电话:"+v.getph()+" "+"性别:"+v.getxing()+" "+"就业去向：");
    	       if(v.getquxiang()!=null){
    	    	   if(v.getquxiang().equals("工作"))
    			   System.out.println("单位和岗位："+v.getbeizhu());
    			else if(v.getquxiang().equals("创业"))
    				System.out.println("单位和岗位："+v.getbeizhu());
    			else if(v.getquxiang().equals("待业"))
    				System.out.println("去处："+v.getbeizhu());
    			else if(v.getquxiang().equals("研究生"))
    				System.out.println("学校信息："+v.getbeizhu());
    			else
    				System.out.println("备注："+v.getbeizhu());
    	       }
    	       else
    	    	   System.out.println("就业去向：无");
    		}
    		}
	public void cha(Vector<student> st,Scanner input) {//查找学生记录
		System.out.println("请输入您要查找的内容");
		String u=input.nextLine();
		System.out.println("查找到以下可能内容");
		for(student v:st) {
			if(v.getusername()!=null) {
				if(v.getusername().equals(u))
				  ren(st);
			}
			else if(v.getxingm()!=null){
				if(v.getxingm().equals(u))
					  ren(st);
				}
		   else if(v.getph()!=null){
			if(v.getph().equals(u))
				  ren(st);
			}
		   else if(v.getxing()!=null){
			if(v.getxing().equals(u))
				  ren(st);
			}
		   else if(v.getquxiang()!=null){
				if(v.getquxiang().equals(u))
					  ren(st);
				}
		   else if(v.getbeizhu()!=null){
				if(v.getbeizhu().equals(u))
					  ren(st);
				}
	}
		System.out.println("输入任意键返回上一级界面");
		input.nextLine();
	}
	
	public void p(String u,Scanner input) {//判断输入届数是否正确
		
		System.out.println("请输入要查询的届数（按学号前四位）");
		try {
			u=input.nextLine();
		     char[] ch =u.toCharArray(); 
		       for(int i=0;i<ch.length;i++){ 
		       if((!Character.isDigit(ch[i]))||i>3)//判断是否数字 
		           throw new Exception();
		    	
			   }
		      
			}
			catch(Exception e) {
				System.out.println("请输入四位数字");
				p(u,input);
			}
	}
	public void mei(String u,Vector<student> st) {//每届汇总统计
		nan=0;
    	nv=0;
    	gong=0;
    	chuang=0;
    	yan=0;
    	dai=0;
    	qi=0;
		for(student v:st) {
			char[] ch=v.getusername().toCharArray();
			 for(int i=4;i<ch.length;i++){ 
			       ch[i]=' ';
			    	
				   }
			 String i=String.valueOf(ch);
			 if(i.equals(u))
			 {
				 if(v.getxing()!=null) {
					 if(v.getxing().equals("男"))
						 nan++;
					 else
						 nv++;
				 }
				 if(v.getquxiang()!=null) {
					 if(v.getquxiang().equals("工作"))
						 gong++;
					 else if(v.getquxiang().equals("创业"))
						 chuang++;
					 else if(v.getquxiang().equals("研究生"))
						 yan++;
					 else if(v.getquxiang().equals("待业"))
						 dai++;
					 else if(v.getquxiang().equals("其他"))
						 qi++;
				 }
			 }
		}
		if(nan+nv==0)
			System.out.println("查找不到对应届数毕业生");
	}
	public void quan(Vector<student> st) {//全部毕业生汇总统计
		nan=0;
    	nv=0;
    	gong=0;
    	chuang=0;
    	yan=0;
    	qi=0;
    	for(student v:st) {
    		 if(v.getxing()!=null) {
				 if(v.getxing().equals("男"))
					 nan++;
				 else
					 nv++;
			 }
			 if(v.getquxiang()!=null) {
				 if(v.getquxiang().equals("工作"))
					 gong++;
				 else if(v.getquxiang().equals("创业"))
					 chuang++;
				 else if(v.getquxiang().equals("研究生"))
					 yan++;
				 else if(v.getquxiang().equals("待业"))
					 dai++;
				 else if(v.getquxiang().equals("其他"))
					 qi++;
			 }
    	}
    	
    	
	}
	public void tong() {//输出统计结果
		System.out.println("共计"+(nan+nv)+"人");
		System.out.println("其中"+nan+"名男性，占"+((float)nan/(float)(nan+nv))+"%");
		System.out.println("其中"+nv+"名女性，占"+((float)nv/(float)(nan+nv))+"%");
		System.out.println(gong+"选择工作，占"+((float)gong/(float)(nan+nv))+"%");
		System.out.println(chuang+"选择创业，占"+((float)chuang/(float)(nan+nv))+"%");
		System.out.println(yan+"选择研究生，占"+((float)yan/(float)(nan+nv))+"%");
		System.out.println(dai+"选择待业，占"+((float)dai/(float)(nan+nv))+"%");
		System.out.println(qi+"选择其他，占"+((float)qi/(float)(nan+nv))+"%");
	}
public void a(Vector<student> st,Scanner input) {//信息汇总平台处理
	int i;
	System.out.println("信息汇总平台");
	shu(st);
	hui();
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
	    if(i==4){ 
		
		break;
	    }
	    else if(i==1) {
	    	input.nextLine();
	    	cha(st,input);
	    	hui();
	    }
        else if(i==2) {
        	System.out.println();
        	System.out.println("每届毕业生统计结果：");
        	input.nextLine();
        	String u=null;
        	p(u,input);
        	mei(u,st);
        	tong();
        	hui();
	    }
        else if(i==3) {
        	System.out.println();
        	System.out.println("全部毕业生统计结果：");
        	quan(st);
        	tong();
        	hui();
	    }
        else
    	  System.out.println("输入命令错误，请重新输入");
	    hui();
	    }
	   
}



}