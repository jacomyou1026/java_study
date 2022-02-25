package javaExercise;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int num;
		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.계죄생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택>");
			num = scan.nextInt();
			if (num == 1) {
				createAccount(); 
			}
			else if(num==2) {
				accountList();
			}
			else if(num==3) {
				deposit();
			}
			else if(num==4) {
				withdraw();
			}
			else if(num==5) {
				System.out.println("프로그램 종료");
				run=false;
			}

		}

	}

	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		System.out.print("계좌번호: ");
		String ano = scan.next();
		
		System.out.print("계좌주: ");
		String owner = scan.next();
		
		System.out.print("초기입금액: ");
		int balance = scan.nextInt();
		

		Account newAccount = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");
		for(int i=0; i<accountArray.length;i++) {
			Account account =accountArray[i];
			if(account!=null) {
				System.out.print(account.getAno());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}

	private static void deposit() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		System.out.print("계좌번호:");
		String ano =scan.next();
		System.out.println("예금액:");
		int money = scan.nextInt();
		
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance()+money);
		System.out.println("결과: 입금이 성공되었습니다.");
		System.out.println("현재"+account.getBalance()+"원이 있습니다.");
	}

	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");
		System.out.print("계좌번호: ");
		String ano =scan.next();
		System.out.print("출금액:");
		int money = scan.nextInt();
		
		Account account = findAccount(ano);
		if(account ==null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance()-money);
		System.out.println("결과 출금이 성공되었습니다.");
		System.out.println(account.getBalance()+"원이 현재 남은 돈입니다.");
		
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account =null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account=accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}

class Account {
	private String ano;
	private String owner;
	private int balance;

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;

	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}