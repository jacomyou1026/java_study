import java.util.*;
public class Phonebookmain {
	static HashMap<String,String> hm = new HashMap<String, String>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		while(true) {
			System.out.println("�١ڡ١���ȭ��ȣ�Ρ١ڡ١�");
			System.out.println("1. ���� ���� ����");
			System.out.println("2. ���� ���� �˻�");
			System.out.println("3. ���� ���� ���");
			System.out.println("4. ������");
				System.out.print("��ȣ �Է�:");
				choice = sc.nextInt();
		
			if(choice==1) {
				System.out.println("---------���� ���� ����---------");
				insert();
			}
			else if(choice==2) {
				System.out.println("---------���� ���� �˻�---------");
				search();
				
			}
			else if(choice==3) {
				System.out.println("---------���� ���� ���---------");
				show();
				
			}
			else if(choice==4) {
				System.out.println("---------���α׷� �����մϴ�,---------");
				break;
			}
			else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");	
			}
		}
	}
	public static void insert() {
		String name,phone;
		System.out.print("������ ������ �̸�:");
		name = sc.next();			
		
		
		//name�� key�̹Ƿ�, �ߺ���� �Ұ�!!
		if(hm.containsKey(name)) {
			System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
			return;
		}
		else {
			System.out.println("������ ������ ��ȣ:");
			phone=sc.next();
			hm.put(name, phone);
			System.out.println("����Ϸ�!");
		}
	}
	public static void search() {
		String searChName;
		System.out.print("�˻��� �̸�: ");
		searChName = sc.next();
		//searChName�� hm�� ���ԵǾ� �������� �˻� ����!
		if(hm.containsKey(searChName)) {
			System.out.println("�˻��Ϸ�!");
			System.out.println("�˻��� ��ȭ��ȣ:"+hm.get(searChName));
		}else {
			System.out.println("�˻��� �̸��� �����ϴ�.");
		}
	}
	public static void show() {
		Set<String> Keyset =hm.keySet();
		Iterator i = Keyset.iterator();
		while(i.hasNext()) {
			String curName =(String) i.next();
			System.out.println("name: "+curName+",phone: "+hm.get(curName));
		}
	}
	
	
}