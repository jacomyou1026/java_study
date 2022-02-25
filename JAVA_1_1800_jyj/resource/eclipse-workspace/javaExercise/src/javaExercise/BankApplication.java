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
			System.out.println("1.���˻���|2.���¸��|3.����|4.���|5.����");
			System.out.println("------------------------------------");
			System.out.print("����>");
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
				System.out.println("���α׷� ����");
				run=false;
			}

		}

	}

	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("���»���");
		System.out.println("-------------");
		System.out.print("���¹�ȣ: ");
		String ano = scan.next();
		
		System.out.print("������: ");
		String owner = scan.next();
		
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scan.nextInt();
		

		Account newAccount = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("-------------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("-------------");
		System.out.print("���¹�ȣ:");
		String ano =scan.next();
		System.out.println("���ݾ�:");
		int money = scan.nextInt();
		
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("���: ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance()+money);
		System.out.println("���: �Ա��� �����Ǿ����ϴ�.");
		System.out.println("����"+account.getBalance()+"���� �ֽ��ϴ�.");
	}

	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("���");
		System.out.println("-------------");
		System.out.print("���¹�ȣ: ");
		String ano =scan.next();
		System.out.print("��ݾ�:");
		int money = scan.nextInt();
		
		Account account = findAccount(ano);
		if(account ==null) {
			System.out.println("���: ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance()-money);
		System.out.println("��� ����� �����Ǿ����ϴ�.");
		System.out.println(account.getBalance()+"���� ���� ���� ���Դϴ�.");
		
	}
	
	//Account �迭���� ano�� ������ Account ��ü ã��
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