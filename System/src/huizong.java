import java.util.Scanner;
import java.util.Vector;
    public class huizong{
    	
    	/**
    	 * ����һ����ʱ����ͳ����Ů�����;�ҵ�ֲ�
    	 */
    	private int nan;
    	private int nv;
    	private int gong;
    	private int chuang;
    	private int yan;
    	private int dai;
    	private int qi;
    	
    	public void hui() {//�����������
    		System.out.println("����������1");
    		System.out.println("�����ҵ��ͳ�Ʋ�ѯ������2");
    		System.out.println("ȫ����ҵ��ͳ�Ʋ�ѯ������3");
    		System.out.println("�����ϼ�����������4");
    	}
    	public void shu(Vector<student> st) {//���������Ա
    		System.out.println("ѡ�������У�");
    		for(student v:st) {
    			if(v.getquxiang()!=null&&v.getquxiang().equals("����"))
    				System.out.println("�û���"+v.getusername()+"������"+v.getxingm()+" ���� ��"+v.getpa()+" ��ϵ�绰��"+v.getph()+" �Ա�"+v.getxing());
    		}
    		System.out.println("ѡ��ҵ���У�");
    		for(student v:st) {
    			if(v.getquxiang()!=null&&v.getquxiang().equals("��ҵ"))
    				System.out.println("�û���"+v.getusername()+"������"+v.getxingm()+" ���� ��"+v.getpa()+" ��ϵ�绰��"+v.getph()+" �Ա�"+v.getxing());
    		}
    		System.out.println("ѡ���о������У�");
    		for(student v:st) {
    			if(v.getquxiang()!=null&&v.getquxiang().equals("�о���"))
    				System.out.println("�û���"+v.getusername()+"������"+v.getxingm()+" ���� ��"+v.getpa()+" ��ϵ�绰��"+v.getph()+" �Ա�"+v.getxing());
    		}
    		System.out.println("ѡ���ҵ���У�");
    		for(student v:st) {
    			if(v.getquxiang()!=null&&v.getquxiang().equals("��ҵ"))
    				System.out.println("�û���"+v.getusername()+"������"+v.getxingm()+" ���� ��"+v.getpa()+" ��ϵ�绰��"+v.getph()+" �Ա�"+v.getxing());
    		}
    		System.out.println("ѡ����������");
    		for(student v:st) {
    			if(v.getquxiang()!=null&&v.getquxiang().equals("����"))
    				System.out.println("�û���"+v.getusername()+"������"+v.getxingm()+" ���� ��"+v.getpa()+" ��ϵ�绰��"+v.getph()+" �Ա�"+v.getxing());
    		}
    		
    	}
    	public void ren(Vector<student> st) {//������ܵ���Ϣ

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
    	    	   System.out.println("��ҵȥ����");
    		}
    		}
	public void cha(Vector<student> st,Scanner input) {//����ѧ����¼
		System.out.println("��������Ҫ���ҵ�����");
		String u=input.nextLine();
		System.out.println("���ҵ����¿�������");
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
		System.out.println("���������������һ������");
		input.nextLine();
	}
	
	public void p(String u,Scanner input) {//�ж���������Ƿ���ȷ
		
		System.out.println("������Ҫ��ѯ�Ľ�������ѧ��ǰ��λ��");
		try {
			u=input.nextLine();
		     char[] ch =u.toCharArray(); 
		       for(int i=0;i<ch.length;i++){ 
		       if((!Character.isDigit(ch[i]))||i>3)//�ж��Ƿ����� 
		           throw new Exception();
		    	
			   }
		      
			}
			catch(Exception e) {
				System.out.println("��������λ����");
				p(u,input);
			}
	}
	public void mei(String u,Vector<student> st) {//ÿ�����ͳ��
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
					 if(v.getxing().equals("��"))
						 nan++;
					 else
						 nv++;
				 }
				 if(v.getquxiang()!=null) {
					 if(v.getquxiang().equals("����"))
						 gong++;
					 else if(v.getquxiang().equals("��ҵ"))
						 chuang++;
					 else if(v.getquxiang().equals("�о���"))
						 yan++;
					 else if(v.getquxiang().equals("��ҵ"))
						 dai++;
					 else if(v.getquxiang().equals("����"))
						 qi++;
				 }
			 }
		}
		if(nan+nv==0)
			System.out.println("���Ҳ�����Ӧ������ҵ��");
	}
	public void quan(Vector<student> st) {//ȫ����ҵ������ͳ��
		nan=0;
    	nv=0;
    	gong=0;
    	chuang=0;
    	yan=0;
    	qi=0;
    	for(student v:st) {
    		 if(v.getxing()!=null) {
				 if(v.getxing().equals("��"))
					 nan++;
				 else
					 nv++;
			 }
			 if(v.getquxiang()!=null) {
				 if(v.getquxiang().equals("����"))
					 gong++;
				 else if(v.getquxiang().equals("��ҵ"))
					 chuang++;
				 else if(v.getquxiang().equals("�о���"))
					 yan++;
				 else if(v.getquxiang().equals("��ҵ"))
					 dai++;
				 else if(v.getquxiang().equals("����"))
					 qi++;
			 }
    	}
    	
    	
	}
	public void tong() {//���ͳ�ƽ��
		System.out.println("����"+(nan+nv)+"��");
		System.out.println("����"+nan+"�����ԣ�ռ"+((float)nan/(float)(nan+nv))+"%");
		System.out.println("����"+nv+"��Ů�ԣ�ռ"+((float)nv/(float)(nan+nv))+"%");
		System.out.println(gong+"ѡ������ռ"+((float)gong/(float)(nan+nv))+"%");
		System.out.println(chuang+"ѡ��ҵ��ռ"+((float)chuang/(float)(nan+nv))+"%");
		System.out.println(yan+"ѡ���о�����ռ"+((float)yan/(float)(nan+nv))+"%");
		System.out.println(dai+"ѡ���ҵ��ռ"+((float)dai/(float)(nan+nv))+"%");
		System.out.println(qi+"ѡ��������ռ"+((float)qi/(float)(nan+nv))+"%");
	}
public void a(Vector<student> st,Scanner input) {//��Ϣ����ƽ̨����
	int i;
	System.out.println("��Ϣ����ƽ̨");
	shu(st);
	hui();
	while(true){

		/**
		 * �ظ��ж�ָ����ʽ�Ƿ����
		 */
		try {
			i=input.nextInt();
		}
		catch(Exception e) {
			System.out.println("���������������������");
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
        	System.out.println("ÿ���ҵ��ͳ�ƽ����");
        	input.nextLine();
        	String u=null;
        	p(u,input);
        	mei(u,st);
        	tong();
        	hui();
	    }
        else if(i==3) {
        	System.out.println();
        	System.out.println("ȫ����ҵ��ͳ�ƽ����");
        	quan(st);
        	tong();
        	hui();
	    }
        else
    	  System.out.println("���������������������");
	    hui();
	    }
	   
}



}