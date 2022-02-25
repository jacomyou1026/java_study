package io;

import java.io.*;

public class serializalbleEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marshalling();
		unmarshalling();
	}
	public static void marshalling() {
		try {	//바이트로 바꿔줌		
			FileOutputStream fos = new FileOutputStream("User.ser");
			BufferedOutputStream bos= new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			User u1=new User("Test1234","1234","가길동");
			out.writeObject(u1);
			out.close();
			System.out.println("직렬화 완료");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void unmarshalling() {//바이트->객체복원
		try {
			FileInputStream fis = new FileInputStream("user.ser");
			BufferedInputStream bis =new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			User user2 = (User)in.readObject();
			System.out.println(user2.toString()); 
			in.close();
			System.out.println("객체 복원 완료");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

class User implements Serializable{
	private String id;
	private String pw;
	private String name;
	public User(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
}