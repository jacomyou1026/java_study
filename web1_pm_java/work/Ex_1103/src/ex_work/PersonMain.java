package ex_work;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Person> pArr  =new ArrayList<Person>();
		Person p = null;
		String s = "1.정보추가\n2.정보삭제\n3.전체정보\netc. 종료\n>>";
		 while(true) {
			System.out.println(s);
			int select =sc.nextInt();
			switch(select) {
			//정보추가
			case 1:
				System.out.println("--정보추가--");
				p = new Person();
				System.out.print("이름 : ");
				p.setName(sc.next());
				
				System.out.println("나이 : ");
				p.setAge(sc.nextInt());
				
				System.out.println("전화 : ");
				p.setTel(sc.next());
				pArr.add(p);
				
				System.out.println();
				break;
				
			//정보삭제
			case 2:
				System.out.println("--정보 삭제--");
				System.out.print("삭제할 이름 : ");
				String name = sc.next();
				
				for (int i = 0; i < pArr.size(); i++) {
					if(name.equals(pArr.get(i).getName())) {
						System.out.println("중복입니다.");
						pArr.remove(i);
					}
				}
				break;
				
			//전체정보
			case 3:
				System.out.println("--전체 정보--");
				System.out.println("등록인원"+pArr.size()+"명");
				for (int i = 0; i < pArr.size(); i++) {
					System.out.printf("%s/%d/%s\n",pArr.get(i).getName(),
							pArr.get(i).getAge(),
							pArr.get(i).getTel());
				}
				System.out.println();
				break;
			//종료
			default :
				System.out.println("종료");
				return; //현재 메서드인 main을 통째로 종료
			}
				
			
		}
	}
}
