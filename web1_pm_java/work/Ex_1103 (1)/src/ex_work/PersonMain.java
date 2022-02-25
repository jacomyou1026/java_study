package ex_work;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Person> pArr = new ArrayList<Person>();
		Person p = null;

		while(true) {

			System.out.println("1.정보추가");
			System.out.println("2.정보삭제");
			System.out.println("3.전체정보");
			System.out.println("etc.종 료");
			System.out.print(">> ");

			int select = sc.nextInt();

			switch( select ) {

			case 1://정보추가
				System.out.println("--정보추가--");
				p = new Person();
				
				System.out.print("이름 : ");
				p.setName( sc.next() );
				
				System.out.print("나이 : ");
				p.setAge( sc.nextInt() );
				
				System.out.print("전화 : ");
				p.setTel( sc.next() );
				
				pArr.add(p);
				
				System.out.println();
				break;

			case 2://정보삭제
				System.out.println("--정보삭제--");
				System.out.print("삭제할 이름 : ");
				
				String name = sc.next();
				
				for( int i = 0; i < pArr.size(); i++ ) {
					
					if( pArr.get(i).getName().equals(name) ) {
						pArr.remove(i);
						break;
					}
					
				}//for
				
				break;

			case 3://전체정보
				System.out.println("--전체정보--");
				System.out.println("등록인원 " + pArr.size() + "명");
				
				for( int i = 0; i < pArr.size(); i++ ) {
					
					System.out.printf("%s / %d / %s\n", 
							pArr.get(i).getName(), 
							pArr.get(i).getAge(), 
							pArr.get(i).getTel());
					
				}//for
				
				System.out.println();
				break;

			default://종료
				System.out.println("종료합니다");
				return;//현재 메서드인 main을 통째로 종료
			}//switch

		}//while

	}//main
}














