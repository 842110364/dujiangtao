import java.util.Scanner;

public class jiuye {
	int x;
	public void jiu(student t,Scanner input) {
		if(t.getquxiang()==null) {
			System.out.println("��ҵȥ����");
            System.out.println("����������1");
            System.out.println("��ҵ������2");
            System.out.println("��ҵ������3");
            System.out.println("�о���������4");
            System.out.println("����������5");
            System.out.println("�����ϼ�����������6");
		}
		else
		{
			System.out.println("��ҵȥ��"+t.getquxiang());
			if(t.getquxiang().equals("����"))
			   System.out.println("��λ�͸�λ��"+t.getbeizhu());
			else if(t.getquxiang().equals("��ҵ"))
				System.out.println("��λ�͸�λ��"+t.getbeizhu());
			else if(t.getquxiang().equals("��ҵ"))
				System.out.println("ȥ����"+t.getbeizhu());
			else if(t.getquxiang().equals("�о���"))
				System.out.println("ѧУ��Ϣ��"+t.getbeizhu());
			else
				System.out.println("��ע��"+t.getbeizhu());
			System.out.println("����������1");
            System.out.println("��ҵ������2");
            System.out.println("��ҵ������3");
            System.out.println("�о���������4");
            System.out.println("����������5");
            System.out.println("�����ϼ�����������6");
		}
		
		while(true){

			/**
			 * �ظ��ж�ָ����ʽ�Ƿ����
			 */
			try {
				x=input.nextInt();
			}
			catch(Exception e) {
				System.out.println("���������������������");
				input.next();
				continue;
			}
		    
		    if(x==1){ 
		    	
			t.setquxiang("����");
			System.out.println("�����뵥λ�͸�λ��");
			input.nextLine();
			t.setbeizhu(input.nextLine());
			break;
		    }
		    else if(x==2) {
		    	t.setquxiang("��ҵ");
				System.out.println("�����뵥λ�͸�λ��");
				input.nextLine();
				t.setbeizhu(input.nextLine());
				break;
		
		    }
            else if(x==3) {
            	t.setquxiang("��ҵ");
				System.out.println("������ȥ����");
				input.nextLine();
				t.setbeizhu(input.nextLine());
				break;
            	
		    }
            else if(x==4) {
        	
            	t.setquxiang("�о���");
				System.out.println("������ѧУ��Ϣ��");
				input.nextLine();
				t.setbeizhu(input.nextLine());
				break;
				
		    }
            else if(x==5) {
            	t.setquxiang("����");
				System.out.println("�����뱸ע��");
				input.nextLine();
				t.setbeizhu(input.nextLine());
				break;
            	
		    }
            else if(x==6) {
            	
            	break;
		    }
            else
        	  System.out.println("���������������������");
		    }
			
	}
	}
	


