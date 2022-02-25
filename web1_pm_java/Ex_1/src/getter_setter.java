public class getter_setter {
	private int age;
	private String name;
	private String gender;
	//
	public void setProp(String n, int a, String g) {
		this.name = n;
		this.age =a;
		this.gender =g;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		getter_setter gs= new getter_setter();
	}
}
