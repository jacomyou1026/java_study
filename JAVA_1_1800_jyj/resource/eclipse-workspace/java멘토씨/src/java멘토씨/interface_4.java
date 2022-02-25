package java¸àÅä¾¾;

public class interface_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MycellPhone phone1 = new MycellPhone();
		Cammera phone2=new MycellPhone();
		Call phone3=new MycellPhone();
		Memo phone4 =new MycellPhone();
		Clock phone5=new MycellPhone();
		PhoneUser user1 = new PhoneUser();
		user1.call(phone1);
//		user1.call(phone2);
		user1.call(phone3);
//		user1.call(phone4);
	}
}
interface Cammera{
	void photo();
}
interface Call{
	void calling();
}
interface Memo{
	void write();
}
interface Clock{
	void clock();
}
class MycellPhone implements Cammera,Call,Memo,Clock{

	@Override
	public void clock() {
		// TODO Auto-generated method stub
		System.out.println("clock()");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("write()");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("callint()");
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("photo()");
		
	}
	
}
class PhoneUser{
	void call(Call c) {
		System.out.println("ÀüÈ­¸¦ °É¾ú´Ù");
	}
}