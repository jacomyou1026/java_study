package work;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String infomation = "1.정보추가\n2.정보삭제\n3.전체정보\netc 종료";
		String name ="";
		int age=0;
		String tel ="";
		while (true) {
			System.out.println(infomation);
			int num = sc.nextInt();
			Person p =new Person();
			if(!(num>=1&&num<=3)) {
				break;
			}
			switch (num) {
			//정보추가
			case 1:
				PersonDAO pd = new PersonDAO();
				System.out.println("--정보추가--");
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("나이 : ");
				age = sc.nextInt();
				System.out.print("전화 : ");
				tel =sc.next();
				pd.setNames(name);
				pd.setAge(age);
				pd.setTel(tel);
				Person.al.add(pd);
				p.insert(pd);
				break;
			//정보 삭제
			case 2:
				System.out.println("삭제한 이름을 입력하세요");
				name =sc.next();
				if(p.delete(name)) {
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("삭제할 이름 없습니다.");
				}
				break;
				
			//정보 정보
			case 3:
				p.info();
				break;

		}}
	}
}