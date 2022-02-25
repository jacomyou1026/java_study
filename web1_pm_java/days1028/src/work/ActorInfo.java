package work;

import java.util.Scanner;

public class ActorInfo {
	String[][] actor = { { "[송강호]", "박쥐", "괴물", "관상" }, { "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게" },
			{ "[이병헌]", "지아이조", "레드", "광해" } };

	String result = "";
	String arIndex[] = new String[actor.length];

	String search(String name) {
			//배우 배열
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
				result = "해당 연예인 없음";
			}
			

			return result;
			}
	
}