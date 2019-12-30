import java.util.Scanner;
import java.util.Vector;

public class renyuan {
	public renyuan(Vector<student> st) {
		ren(st);
		
	}

public void ren(Vector<student> st) {//人员管理界面内容

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
    	   System.out.println("无");
	}
	}
public void xian() {//显示增删改查界面
	System.out.println("增加记录请输入1");
	System.out.println("删除记录请输入2");
	System.out.println("编辑记录请输入3");
	System.out.println("查询记录请输入4");
	System.out.println("返回请输入5");
}
public void shan(String u,Vector<student> st) {//删除记录
	for(student v:st) {
		if(v.getusername()!=null) {
			if(v.getusername().equals(u)) {
				st.remove(st.indexOf(v) );//ElementAt
				break;
			}
	}
	}
}
public void gai(String u,student t,Scanner input) {//编辑记录
	
	
		if(t.getusername()!=null) {
			if(t.getusername().equals(u)) {
				System.out.println("修改姓名请输入1");
				System.out.println("修改密码请输入2");
				System.out.println("修改联系电话请输入3");
				System.out.println("修改性别请输入4");
				System.out.println("返回上级界面请输入5");
				geren.xinxi(t,input);
				
			}
			
	
		
	}
	
}
public void cha(Vector<student> st,Scanner input) {//查询记录
	System.out.println("请输入您要查找的内容");
	String u=input.nextLine();
	System.out.println("查找到以下可能内容");
	for(student v:st) {
		if(v.getusername()!=null) {
			if(v.getusername().equals(u))
			  {
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
			    	   System.out.println("无");
			  }
		}
		else if(v.getxingm()!=null){
			if(v.getxingm().equals(u))
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
		    	   System.out.println("无");
			}
	   else if(v.getph()!=null){
		if(v.getph().equals(u))
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
	    	   System.out.println("无");
		}
	   else if(v.getxing()!=null){
		if(v.getxing().equals(u))
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
	    	   System.out.println("无");
		}
	   else if(v.getquxiang()!=null){
			if(v.getquxiang().equals(u))
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
		    	   System.out.println("无");
			}
	   else if(v.getbeizhu()!=null){
			if(v.getbeizhu().equals(u))
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
		    	   System.out.println("无");
			}
}
	System.out.println("输入任意键返回上一级界面");
	input.nextLine();
}





}


