import java.util.Scanner;
import java.util.Vector;

public class renyuan {
	public renyuan(Vector<student> st) {
		ren(st);
		
	}

public void ren(Vector<student> st) {//��Ա�����������

	for(student v:st) {
       System.out.print("�û���:"+v.getusername()+" "+"����:"+v.getxingm()+" "+"����:"+v.getpa()+" "+"��ϵ�绰:"+v.getph()+" "+"�Ա�:"+v.getxing()+" "+"��ҵȥ��");
       if(v.getquxiang()!=null){
    	   if(v.getquxiang().equals("����"))
		   System.out.println("��λ�͸�λ��"+v.getbeizhu());
		else if(v.getquxiang().equals("��ҵ"))
			System.out.println("��λ�͸�λ��"+v.getbeizhu());
		else if(v.getquxiang().equals("��ҵ"))
			System.out.println("ȥ����"+v.getbeizhu());
		else if(v.getquxiang().equals("�о���"))
			System.out.println("ѧУ��Ϣ��"+v.getbeizhu());
		else
			System.out.println("��ע��"+v.getbeizhu());
       }
       else
    	   System.out.println("��");
	}
	}
public void xian() {//��ʾ��ɾ�Ĳ����
	System.out.println("���Ӽ�¼������1");
	System.out.println("ɾ����¼������2");
	System.out.println("�༭��¼������3");
	System.out.println("��ѯ��¼������4");
	System.out.println("����������5");
}
public void shan(String u,Vector<student> st) {//ɾ����¼
	for(student v:st) {
		if(v.getusername()!=null) {
			if(v.getusername().equals(u)) {
				st.remove(st.indexOf(v) );//ElementAt
				break;
			}
	}
	}
}
public void gai(String u,student t,Scanner input) {//�༭��¼
	
	
		if(t.getusername()!=null) {
			if(t.getusername().equals(u)) {
				System.out.println("�޸�����������1");
				System.out.println("�޸�����������2");
				System.out.println("�޸���ϵ�绰������3");
				System.out.println("�޸��Ա�������4");
				System.out.println("�����ϼ�����������5");
				geren.xinxi(t,input);
				
			}
			
	
		
	}
	
}
public void cha(Vector<student> st,Scanner input) {//��ѯ��¼
	System.out.println("��������Ҫ���ҵ�����");
	String u=input.nextLine();
	System.out.println("���ҵ����¿�������");
	for(student v:st) {
		if(v.getusername()!=null) {
			if(v.getusername().equals(u))
			  {
				 System.out.print("�û���:"+v.getusername()+" "+"����:"+v.getxingm()+" "+"����:"+v.getpa()+" "+"��ϵ�绰:"+v.getph()+" "+"�Ա�:"+v.getxing()+" "+"��ҵȥ��");
			       if(v.getquxiang()!=null){
			    	   if(v.getquxiang().equals("����"))
					   System.out.println("��λ�͸�λ��"+v.getbeizhu());
					else if(v.getquxiang().equals("��ҵ"))
						System.out.println("��λ�͸�λ��"+v.getbeizhu());
					else if(v.getquxiang().equals("��ҵ"))
						System.out.println("ȥ����"+v.getbeizhu());
					else if(v.getquxiang().equals("�о���"))
						System.out.println("ѧУ��Ϣ��"+v.getbeizhu());
					else
						System.out.println("��ע��"+v.getbeizhu());
			       }
			       else
			    	   System.out.println("��");
			  }
		}
		else if(v.getxingm()!=null){
			if(v.getxingm().equals(u))
				 System.out.print("�û���:"+v.getusername()+" "+"����:"+v.getxingm()+" "+"����:"+v.getpa()+" "+"��ϵ�绰:"+v.getph()+" "+"�Ա�:"+v.getxing()+" "+"��ҵȥ��");
		       if(v.getquxiang()!=null){
		    	   if(v.getquxiang().equals("����"))
				   System.out.println("��λ�͸�λ��"+v.getbeizhu());
				else if(v.getquxiang().equals("��ҵ"))
					System.out.println("��λ�͸�λ��"+v.getbeizhu());
				else if(v.getquxiang().equals("��ҵ"))
					System.out.println("ȥ����"+v.getbeizhu());
				else if(v.getquxiang().equals("�о���"))
					System.out.println("ѧУ��Ϣ��"+v.getbeizhu());
				else
					System.out.println("��ע��"+v.getbeizhu());
		       }
		       else
		    	   System.out.println("��");
			}
	   else if(v.getph()!=null){
		if(v.getph().equals(u))
			 System.out.print("�û���:"+v.getusername()+" "+"����:"+v.getxingm()+" "+"����:"+v.getpa()+" "+"��ϵ�绰:"+v.getph()+" "+"�Ա�:"+v.getxing()+" "+"��ҵȥ��");
	       if(v.getquxiang()!=null){
	    	   if(v.getquxiang().equals("����"))
			   System.out.println("��λ�͸�λ��"+v.getbeizhu());
			else if(v.getquxiang().equals("��ҵ"))
				System.out.println("��λ�͸�λ��"+v.getbeizhu());
			else if(v.getquxiang().equals("��ҵ"))
				System.out.println("ȥ����"+v.getbeizhu());
			else if(v.getquxiang().equals("�о���"))
				System.out.println("ѧУ��Ϣ��"+v.getbeizhu());
			else
				System.out.println("��ע��"+v.getbeizhu());
	       }
	       else
	    	   System.out.println("��");
		}
	   else if(v.getxing()!=null){
		if(v.getxing().equals(u))
			 System.out.print("�û���:"+v.getusername()+" "+"����:"+v.getxingm()+" "+"����:"+v.getpa()+" "+"��ϵ�绰:"+v.getph()+" "+"�Ա�:"+v.getxing()+" "+"��ҵȥ��");
	       if(v.getquxiang()!=null){
	    	   if(v.getquxiang().equals("����"))
			   System.out.println("��λ�͸�λ��"+v.getbeizhu());
			else if(v.getquxiang().equals("��ҵ"))
				System.out.println("��λ�͸�λ��"+v.getbeizhu());
			else if(v.getquxiang().equals("��ҵ"))
				System.out.println("ȥ����"+v.getbeizhu());
			else if(v.getquxiang().equals("�о���"))
				System.out.println("ѧУ��Ϣ��"+v.getbeizhu());
			else
				System.out.println("��ע��"+v.getbeizhu());
	       }
	       else
	    	   System.out.println("��");
		}
	   else if(v.getquxiang()!=null){
			if(v.getquxiang().equals(u))
				 System.out.print("�û���:"+v.getusername()+" "+"����:"+v.getxingm()+" "+"����:"+v.getpa()+" "+"��ϵ�绰:"+v.getph()+" "+"�Ա�:"+v.getxing()+" "+"��ҵȥ��");
		       if(v.getquxiang()!=null){
		    	   if(v.getquxiang().equals("����"))
				   System.out.println("��λ�͸�λ��"+v.getbeizhu());
				else if(v.getquxiang().equals("��ҵ"))
					System.out.println("��λ�͸�λ��"+v.getbeizhu());
				else if(v.getquxiang().equals("��ҵ"))
					System.out.println("ȥ����"+v.getbeizhu());
				else if(v.getquxiang().equals("�о���"))
					System.out.println("ѧУ��Ϣ��"+v.getbeizhu());
				else
					System.out.println("��ע��"+v.getbeizhu());
		       }
		       else
		    	   System.out.println("��");
			}
	   else if(v.getbeizhu()!=null){
			if(v.getbeizhu().equals(u))
				 System.out.print("�û���:"+v.getusername()+" "+"����:"+v.getxingm()+" "+"����:"+v.getpa()+" "+"��ϵ�绰:"+v.getph()+" "+"�Ա�:"+v.getxing()+" "+"��ҵȥ��");
		       if(v.getquxiang()!=null){
		    	   if(v.getquxiang().equals("����"))
				   System.out.println("��λ�͸�λ��"+v.getbeizhu());
				else if(v.getquxiang().equals("��ҵ"))
					System.out.println("��λ�͸�λ��"+v.getbeizhu());
				else if(v.getquxiang().equals("��ҵ"))
					System.out.println("ȥ����"+v.getbeizhu());
				else if(v.getquxiang().equals("�о���"))
					System.out.println("ѧУ��Ϣ��"+v.getbeizhu());
				else
					System.out.println("��ע��"+v.getbeizhu());
		       }
		       else
		    	   System.out.println("��");
			}
}
	System.out.println("���������������һ������");
	input.nextLine();
}





}


