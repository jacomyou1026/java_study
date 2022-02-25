package java멘토씨;

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
			System.out.println(x+"는 정수입니다.");
		}
		else if(x instanceof Double||x instanceof Float) {
			System.out.println(x+"는 실수입니다.");
		}
		else if(x instanceof Character) {
			System.out.println(x+"는 문자형입니다.");
		}
		else if(x instanceof String) {
			System.out.println(x+"는 문자열입니다.");
		}
		else if(x instanceof Boolean) {
			System.out.println(x+"는 논리형입니다.");
		}
	}
}
