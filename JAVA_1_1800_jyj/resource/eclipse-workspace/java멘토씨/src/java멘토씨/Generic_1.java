package java���侾;

public class Generic_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v = new Value();
		v.<Integer>tyoeSearch(3);
		v.tyoeSearch(3.14);
		v.tyoeSearch(3.14f);
		v.tyoeSearch('a');
		v.tyoeSearch("Alleor");
		v.tyoeSearch(true);
		
		
	}

}
class Value{
	public <T> void tyoeSearch(T x) {
		if(x instanceof Integer) {
			System.out.println(x+"�� �����Դϴ�.");
		}
		else if(x instanceof Double||x instanceof Float) {
			System.out.println(x+"�� �Ǽ��Դϴ�.");
		}
		else if(x instanceof Character) {
			System.out.println(x+"�� �������Դϴ�.");
		}
		else if(x instanceof String) {
			System.out.println(x+"�� ���ڿ��Դϴ�.");
		}
		else if(x instanceof Boolean) {
			System.out.println(x+"�� �����Դϴ�.");
		}
	}
}
