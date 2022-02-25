package ex3_constructor;

public class Person {

	private String id;
	private String pwd;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	//생성자가 오버로딩되어 있을 때
	//기본생성자를 들어두지 않으면 기본생성자는 자동으로 호출되지 않는다
	
	
}
