package java멘토씨;

public class Anonymous2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass_1 o = new OuterClass_1() {
			void  a() {
				System.out.println("새롭게 정의된 익명 클래스 메서드입니다.");
			}
		};
		o.a();
		OuterClass_1 ok=new OuterClass_1();
		ok.a();;
	}

}
class OuterClass_1{
	void a() {
		System.out.println("method a");
	}
	void b() {
		
	}
	
}
