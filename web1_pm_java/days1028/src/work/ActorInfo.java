package work;

import java.util.Scanner;

public class ActorInfo {
	String[][] actor = { { "[�۰�ȣ]", "����", "����", "����" }, { "[�����]", "���ϵ�", "������ �׳�", "�����ϰ� �����ϰ�" },
			{ "[�̺���]", "��������", "����", "����" } };

	String result = "";
	String arIndex[] = new String[actor.length];

	String search(String name) {
			//��� �迭
			int index = 0;
			for (int i = 0; i < actor.length; i++) {
				arIndex[i]  = actor[i][0].substring(1, actor[i][0].length() - 1);
				if(name.equals(arIndex[i])) {
					index = i;
					for (int j = 0; j < actor[i].length; j++) {
						result+=actor[index][j]+"\n";
					}
					break;
					
				}
			}
			if(result=="") {
				result = "�ش� ������ ����";
			}
			

			return result;
			}
	
}