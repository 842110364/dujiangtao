

public class mainsystem {
	 
	
	public static void main(String[] args) {
		
			denglu x=new denglu();//�����µĶ������ڵ�¼ע��ģ�鹦��
			
			x.deng();//��ʾ��¼ע�����

	    /**
	    * ÿ������ָ��ʱ�ж�һ��ָ��������ʽ�Ƿ����
		*/
		while(true) {
				
				try {
					x.i=x.input.nextInt();
				}
				catch(Exception e) {
					System.out.println("���������������������");
					x.input.next();
					continue;
				}
				
		if(x.i==1){//��⵽�������Ա��¼ָ��ִ��
			  x.input.nextLine();
			  x.guan();
			
		}
		
		else if(x.i==2)//������ѧ����¼ָ��ʱִ��
		{
			x.input.nextLine();
			x.xueshen();
			
		}
		
		else if(x.i==3) {//������ע��ָ��ʱִ��
			x.input.nextLine();
			x.zhuce();
			x.deng();
		}
		else
			System.out.println("���������������������");
		}
		
	}
	}



