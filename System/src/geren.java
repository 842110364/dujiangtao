import java.util.Scanner;

public class geren {
	
	public static void xinxi(student t,Scanner input) {//����ѧ��������Ϣ
		int i;
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
    		
    	
    	 if(i==1) {
    		 
    		System.out.println("������������");
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
    	 System.out.println("���óɹ�");
    	
    }
	}
	public static void panmi(student t,Scanner input) {//�ж����������Ƿ���ȷ
		String pa;
		System.out.println("����������");
		pa=input.nextLine();
		System.out.println("��ڶ�����������");
		
		if(!pa.equals(input.nextLine()))
		{
			System.out.println("�����������벻һ�£�����������");
			panmi(t,input);
		}
		else
			t.setpa(pa);
	}
	public static void panxing(student t,Scanner input) {//�ж��Ա������Ƿ���ȷ
		int b;
		System.out.println("����������1��Ů��������0");
		try {
		b=input.nextInt();
		if(b==1)
			t.setxingbie("��");
		else if(b==0)
			t.setxingbie("Ů");
		else {
			System.out.println("ָ�����������������ȷָ��");
			panxing(t,input);
		}
		}
		catch(Exception e) {
			System.out.println("ָ�����������������ȷָ��");
			input.next();
			panxing(t,input);
		}
		}
	public static void panph(student t,Scanner input) {//�ж���ϵ�绰�����Ƿ���ȷ
		System.out.println("������������ϵ�绰");
		String u;
		try {
			u=input.nextLine();
		     char[] ch =u.toCharArray(); 
		       for(int i=0;i<ch.length;i++){ 
		       if(!Character.isDigit(ch[i]))//�ж��Ƿ����� 
		       { 
		    	   throw new Exception();
		      
		       }
			   }
		       t.setph(u);
		       
			}
			catch(Exception e) {
				System.out.println("�벻Ҫ������������ķ���");
				panph(t,input);
			}
	}
	public void gg(man i) {

		System.out.println("������"+i.getxingm()+" ���� ��"+i.getpa()+" ��ϵ�绰��"+i.getph()+" �Ա�"+i.getxing());
		System.out.println("�޸�����������1");
		System.out.println("�޸�����������2");
		System.out.println("�޸���ϵ�绰������3");
		System.out.println("�޸��Ա�������4");
		System.out.println("�����ϼ�����������5");
	}
	public geren(man i) {
		gg(i);
	}
	

}
