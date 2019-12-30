
public class student extends man{//创建一个student的类用于存放学生数据
	private String quxiang;
	private String beizhu;
	private String username;
	public student(String username,String xingm,String password,String phoneNumber,String xingbie) {
		this.setusername(username);
		this.setxingm(xingm);
		this.setpa(password);
		this.setph(phoneNumber);
		this.setxingbie(xingbie);
		
	}
	
public String getusername() {
		
		
		return this.username;
	}
	public void setusername(String username) {
		this.username=username;
	}
	
public String getquxiang() {
		
		
		return this.quxiang;
	}
	public void setquxiang(String quxiang) {
		this.quxiang=quxiang;
	}
public String getbeizhu() {
		
		
		return this.beizhu;
	}
	public void setbeizhu(String beizhu) {
		this.beizhu=beizhu;
	}
	
	
}
