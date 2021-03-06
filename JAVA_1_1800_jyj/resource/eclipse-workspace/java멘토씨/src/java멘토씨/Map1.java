package java멘토씨;

import java.util.*;
import java.util.Scanner;


interface wordbookfunction {
	public void Menu();

	public void addword();

	public void wordsearch();

	public void deletword();

	public void test();

	public void wordlist();

	public void exit();
}

class mywordbook implements wordbookfunction {
	static HashMap<String, String> wordbook = new HashMap<>();
	static Scanner scan = new Scanner(System.in);

	public mywordbook() {
		wordbook.put("student", "학생");
		wordbook.put("people", "사람");
		wordbook.put("apple", "사과");
		wordbook.put("pizza", "피자");
	}

	@Override
	public void Menu() {
		// TODO Auto-generated method stub
		System.out.println("등록된 단어 수:" + wordbook.size());
		System.out.println("----하고싶은 것을 선택하세요--------");
		System.out.println("1.단어 등록");
		System.out.println("2. 단어 조회");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 테스트");
		System.out.println("5. 단어 목록 보기");
		System.out.println("6. 종료");
		System.out.println("---------------------------");
	}

	@Override
	public void addword() {
		// 단어 입력
		// 이미 있는 단어인지 확인 후 -> 없으면 추가
		// 반복으로 시행
		// meue입력시 -> menue로 입력
		String eng = null;
		String kor = null;
		while (true) {
			System.out.println("단어를 입력하세요..(Menu로 가려면 menu입력)");
			Scanner scan = new Scanner(System.in);
			eng = scan.next();
			if (eng.equals("menu") || eng.equals("Menu")) {
				break;
			} else {

				if (wordbook.containsKey(eng)) {
					System.out.println("이미 존재하는 단어입니다.");
					System.out.println(eng + " : " + wordbook.get(eng));

				} else {
					System.out.println("뜻을 입력하세요");
					kor = scan.next();
					wordbook.put(eng, kor);
					System.out.println("저장했습니다.");
				}

			}
		}
	}

	@Override
	public void wordsearch() {
		// TODO Auto-generated method stub
		// 단어입력후 해시테이블에 있는지 확인
		System.out.println("조회할 단어를 입력하세요!");
		String word = scan.next();
		if (wordbook.containsKey(word)) {
			System.out.println("검색 완료!");
			System.out.println("검색된 단어 : " + wordbook.get(word));
		} else {
			System.out.println("단어가 없습니다. 단어를 등록 하세요!");
			addword();
		}
	}

	@Override
	public void deletword() {
		// TODO Auto-generated method stub
		while (true) {
			Set<String> keyset = wordbook.keySet();
			Iterator i = keyset.iterator();
			while (i.hasNext()) {
				String curName = (String) i.next();
				System.out.println("단어 : " + curName + ", 뜻:" + wordbook.get(curName));
			}
			System.out.println("삭제할 단어를 입력하세요!!(Menu로 가면 menu입력)");
			String word = scan.next();
			if (wordbook.containsKey(word)) {
				wordbook.remove(word);
				System.out.println("삭제하였습니다.");
			} else if (word.equals("menu")) {
				break;
			} else {
				System.out.println("잘못입력하였습니다.");
			}

		}
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		// 주어진 단어로 뜻이 맞았는지 확인
		// 맞은 수 세기
		// 1은 시작 2는 종료
		int exit = 0;
		while (true) {
			System.out.println("입력하세요!");
			System.out.println("1. 시작하기");
			System.out.println("2. 종료하기");
			int number = scan.nextInt();
			if (number == 1) {
				Set key = wordbook.keySet();
				int count = 0;
				int totalcount = 0;
				Iterator iterator;
				System.out.println("<======뜻에 맞는 영단어 입력하세요======>");
				iterator = key.iterator();
				while (iterator.hasNext()) {
					String keyValue = (String) iterator.next();
					String ValueVar = (String) wordbook.get(keyValue);
					System.out.println(ValueVar);
					String answer = scan.next();
					if (answer.equals(keyValue)) {
						System.out.println("정답입니다.");
						count++;
					} else {
						System.out.println("틀렸습니다. (답:" + keyValue + ")");

					}
					totalcount++;

				}
				System.out.println("<<결과 : "+count+"/"+totalcount+">>");
				break;

			} else if (number == 2) {
				exit = -1;

			} else {
				System.out.println("1또는 2를 눌러주세요");
			}
		}
	}

	@Override
	public void wordlist() {
		// TODO Auto-generated method stub
		// wordbook에 있는거 조회
		System.out.println("---------목록---------");
		Set<String> keyset = wordbook.keySet();
		Iterator i = keyset.iterator();
		while (i.hasNext()) {
			String Curname = (String) i.next();
			System.out.println("단어 : " + Curname + " 뜻 : " + wordbook.get(Curname));
		}
		System.out.println("--------------------");

	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("시스템을 종료합니다.");

	}

}

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mywordbook mybook = new mywordbook();
		Scanner scan = new Scanner(System.in);
		int exit = 0;
		while (true) {
			mybook.Menu();
			int num = scan.nextInt();
			switch (num) {
			case 1:
				mybook.addword();
				break;
			case 2:
				mybook.wordsearch();
				break;
			case 3:
				mybook.deletword();
				break;
			case 4:
				mybook.test();
				break;
			case 5:
				mybook.wordlist();
				break;
			case 6:
				exit = -1;
				mybook.exit();
				break;

			default:
				System.out.println("1~6까지의 숫자를 입력하세요");
				continue;
			}
			if (exit == -1) {
				break;
			}
		}
	}
}