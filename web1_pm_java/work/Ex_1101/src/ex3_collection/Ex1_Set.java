package ex3_collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex1_Set {
	public static void main(String[] args) {
		
		//컬렉션 : 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 클래스들의 집합.
		//배열처럼 사용하지만 index의 제한 없이 원하는 만큼 값을 추가하거나 삭제가 가능한 클래스들
		
		//컬렉션 인터페이스의 종류
		//Set, Map, List
		
		//Set : 특정 코드에서 중복된 값의 허용이 있어서는 안될 때 사용
		//HashSet : 정렬기능은 없다...!
		//TreeSet : 오름차순 정렬
		
		//<> : 제너릭타입 -> 컬렉션 객체가 앞으로 저장해서 사용하고자 할 타입을 미리 지정
		//제너릭타입에는 기본자료형이 들어갈 수 없으므로 반드시 클래스형태로 정의되어야 한다
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(10);
		hs.add(100);
		hs.add(100);
		hs.add(20);
		hs.remove(20);//20이라는 값을 가진 방을 삭제
		System.out.println( hs.size() );//hs의 방 갯수
		System.out.println( hs );
		hs.removeAll(hs);//hs에 담긴 모든 값을 삭제
			
		System.out.println("---------------------------");
		
		while(true) {
			int r = new Random().nextInt(45) + 1;
			
			hs.add(r);
			
			if(hs.size() == 6) {
				break;
			}
		}
		
		System.out.println(hs);
		
		System.out.println("--------------------------");
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		while( true ) {
			
			int r = new Random().nextInt(45) + 1;
			ts.add(r);
			
			if( ts.size() == 6 ) {
				break;
			}
			
		}
		
		System.out.println( ts );
		
	}//main
}














