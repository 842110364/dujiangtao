import java.util.Scanner;
import java.util.Vector;

public class denglu {
	
	int i;//���ڼ�¼ÿ�������ָ��
	String s1,s2; //����������ʱ������ŵ�ǰ������˺�����
	Admin a = new Admin();//����һ����������ʵ��Ψһ�Ĺ���Ա�˺ŵ�¼����
	Scanner input = new Scanner(System.in);
	
    private static Vector<student> st = new Vector<student>();//����һ�����ڴ洢ѧ����Ϣ��Vector
	
    /**
     * ����һ����ʱ��������������û�����
     */
	private String username;
	private String xingm;
	private String password;
	private String phoneNumber;
	private String xingbie;
	 	
	public denglu() {//�趨����Ա�˺ų�ʼ�˺�����
		a.setID("Admin");
		a.setpa("123456");
	}
	public void deng(){//���ڵ�����ʼ��¼����
		System.out.println("��ҵ����ҵȥ�����ƽ̨:");
        System.out.println("����Ա��¼������1");
		System.out.println("ѧ����¼������2");
		System.out.println("ע��������3");
		System.out.println("Tips:Ĭ�Ϲ���Ա�˺ţ�Admin ���룺123456");
	}
	
	public void pp() {//�ж��û����Ƿ����
		System.out.println("�������û���������������ѧ�ţ�");
		try {
			username=input.nextLine();
			 char[] ch = username.toCharArray(); 
		       for(int i=0;i<ch.length;i++){ 
		       if(!Character.isDigit(ch[i]))//�ж��Ƿ����� 
		    	   throw new Exception();
			   }
		      
			}
			catch(Exception e) {
				System.out.println("�벻Ҫ������������ķ���");
				pp();
			}
	}
	public void panyong() {//�ж��û��������Ƿ���ȷ
		System.out.println("�������û���������������ѧ�ţ�");
		try {
			username=input.nextLine();
		     char[] ch = username.toCharArray(); 
		       for(int i=0;i<ch.length;i++){ 
		       if(!Character.isDigit(ch[i]))//�ж��Ƿ����� 
		    	   throw new Exception();
			   }
		       for(student v:st)
					if(username.equals(v.getusername()))
					{
						System.out.println("���û��Ѿ�����");
						panyong();
						break;
					}
			}
			catch(Exception e) {
				System.out.println("�벻Ҫ������������ķ���");
				panyong();
			}
	}
	public void panph() {//�ж���ϵ�绰�����Ƿ���ȷ
		System.out.println("������������ϵ�绰");
		try {
			phoneNumber=input.nextLine();
		     char[] ch =phoneNumber.toCharArray(); 
		       for(int i=0;i<ch.length;i++){ 
		       if(!Character.isDigit(ch[i]))//�ж��Ƿ����� 
		           throw new Exception();
		    	
			   }
			}
			catch(Exception e) {
				System.out.println("�벻Ҫ������������ķ���");
				panph();
			}
	}
	public void panmi() {//�ж����������Ƿ���ȷ
		String pa;
		System.out.println("����������");
		password=input.nextLine();
		System.out.println("��ڶ�����������");
		pa=input.nextLine();
		if(!pa.equals(password))
		{
			System.out.println("�����������벻һ�£�����������");
			panmi();
		}
		
		
	}
	public void panxing() {//�ж��Ա������Ƿ���ȷ
		int b;
		System.out.println("����������1��Ů��������0");
		try {
		b=input.nextInt();
		if(b==1)
			xingbie="��";
		else if(b==0)
			xingbie="Ů";
		else {
			System.out.println("ָ�����������������ȷָ��");
			panxing();
		}
		}
		catch(Exception e) {
			System.out.println("ָ�����������������ȷָ��");
			input.next();
			panxing();
		}
		}
	public void insertst(student x)//����һ���µ�ѧ������
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
				System.out.println("���û��Ѿ�����,����������");
				zhuce() ;
				deng();
			}
			
		}
		
			st.insertElementAt(x, l);
		
		
	}
	public void zhuce() {//����ע���µ�ѧ���˺�
	
		panyong();
		System.out.println("����������");
		xingm=input.nextLine();
		panmi();
		panph();
		panxing();
		student t=new student(username, xingm,password,phoneNumber,xingbie);
		insertst(t);
		System.out.println("ע��ɹ�,���¼");
		
	}
	
	public void hedui() {//���ں˶�ÿ��������˺�����
		System.out.println("�������˺ţ�");
		s1=input.nextLine();
		System.out.println("���������룺");
		s2=input.nextLine();
	}
	public void guanli(Admin i) {//����Ա��¼�����
		if(i.getxingm()!=null)
			System.out.println("��ӭ������"+i.getxingm());
		else
			System.out.println("��ӭ������Admin");
		System.out.println("��������������11");
		System.out.println("��Ա��Ϣ����������12");
		System.out.println("��Ϣ����ƽ̨������13");
		System.out.println("�˳���¼������14");
	}
	public void xinxi() {//����Ա���ø�����Ϣ
		while(true) {
    		try {
    			i=input.nextInt();
    			if(i!=5&&i!=4&&i!=3&&i!=2&&i!=1)
   	    	 {
   	    		 System.out.println("���������������������");
   	    		
   	    		 continue;
   	    	 }
    		}
    		catch(Exception e) {
    			System.out.println("���������������������");
    			input.next();
    			continue;
    		}
    		
    	
    	 if(i==1) {//��������
    		 
    		System.out.println("������������");
    		input.nextLine();
 			a.setxingm(input.nextLine());
 			
 		}
 		else if(i==2) {//��������
 			input.nextLine();
 			panmi();
 			a.setpa(password);
 		}
 		else if(i==3)//������ϵ�绰
 		{
 			input.nextLine();
 			panph();
 			a.setph(phoneNumber);
 		}
 		else if(i==4) {//�����Ա�
 			input.nextLine();
 			panxing();
 			a.setxingbie(xingbie);
 		}
 		else//�����ϼ�����
 		{
 			
    	 guanli(a);
    	 break;
    }
    	 System.out.println("���óɹ�");
    	
    }
	}
	
	
	public void zuo(renyuan r) {//ʵ����ɾ�Ĳ����
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
		    if(i==5){ //�����ϼ�����
			
			break;
		    }
		    else if(i==1) { //���Ӽ�¼
		    	input.nextLine();
		    	zhuce();
		    	r.xian();
		    }
            else if(i==2) { //ɾ����¼
            	input.nextLine();
            	pp();
            	r.shan(username,st);
            	r.xian();
		    }
            else if(i==3) { //�༭��¼
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
 						System.out.println("���û�������");
 						pp();
 						
 					}
            	 }
            	r.xian();
		    }
            else if(i==4) { //��ѯ��¼
            	input.nextLine();
            	
            	r.cha(st, input);
            	r.xian();
		    }
            else
        	  System.out.println("���������������������");
		    }
	}

	public void guan() {//�������Ա�������
		hedui();//ÿ���������Ա��¼ָ���������Ա��¼����
		
		/**
		 * ������˺Ŵ���ʱ��ʾ�����µ�����¼����
		 */
		while(!s1.equals("Admin")||!s2.equals(a.getpa()))
		{
			System.out.println("�˺Ż����������������������");
			deng();
		}
		
		/**
		 * ����Ա�˺�����ͨ����֤��������һ����������
		 */
		System.out.println("��¼�ɹ�");
		guanli(a);
		
		/**
		 * ����ѭ��ֱ���û�������ȷָ��
		 */
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
		    if(i==14){ //�����˳�ָ��ʱ���˳�ѭ�������½����ʼ��¼����
			deng();
			break;
		    }
		    else if(i==11) {//����������Ĳ���
		    	System.out.println("��������");
		    	geren g=new geren(a);
		    	xinxi();
		    	
		    }
            else if(i==12) {//������Ա��Ϣ����
            	renyuan r=new renyuan(st);//���������Ա�б�
            	r.xian();//��ʾ��ɾ�Ĳ����
            	zuo(r);
            	
            	guanli(a);
		    }
            else if(i==13) {//������Ϣ����ƽ̨
        	
        	    huizong h=new huizong();
        	    h.a(st, input);
        	   
            	guanli(a);
		    }
            else
        	  System.out.println("���������������������");
		    }
	}
	
	public void xue(student t) {//ѧ����¼�����
		
			if(t.getxingm()!=null)
				System.out.println("��ӭ������"+t.getxingm());
			else
				System.out.println("��ӭ������"+t.getusername());
		System.out.println("��������������21");
		System.out.println("��ҵ�Ǽ�������22");
		System.out.println("�˳�������23");
	}
	
	
	@SuppressWarnings("static-access")
	public void xues(student t) {//��ѧ����������Ĳ������д���
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
		    
		    if(i==23){ //�����˳�ָ��ʱ���˳�ѭ�������½����ʼ��¼����
			deng();
			break;
		    }
		    else if(i==21) {//�����������
		    	System.out.println("��������");
		    	geren g=new geren(t);
		    	g.xinxi(t, input);
		    	xue(t);
		    }
            else if(i==22) {//�����ҵ�Ǽ�
        	
            	jiuye j=new jiuye();
            	j.jiu(t, input);
            	xue(t);
		    }
           
            else
        	  System.out.println("���������������������");
		    }
			
	}
	
	
	
	public static student contains(String x)//�ж��Ƿ���ڸ��û������ڷ����û��������ã������ڷ���null
	{
		for(student v:st)
			if(x.equals(v.getusername()))
				return v;
		return null;
	}
	public void xueshen() {//��ѧ����¼ʱ���˺����������֤
		System.out.println("�������˺ţ�");
		s1=input.nextLine();
		student t;
		t=contains(s1);
		if(t==null) {
			System.out.println("���û������ڣ�����������");
			deng();
			}
		else {
			System.out.println("���������룺");
			s2=input.nextLine();
			if(t.getpa().equals(s2))
			{
				System.out.println("��¼�ɹ�");
				xue(t);//����ѧ����������
				xues(t);//��ѧ����������Ĳ������д���
			}
			else
			{
				System.out.println("�����������������");
				xueshen();
			}
		}	
	}
	
	
	
	
}
