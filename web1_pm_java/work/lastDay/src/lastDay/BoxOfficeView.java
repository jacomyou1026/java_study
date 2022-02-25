package lastDay;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BoxOfficeView {
	private static String contexts;
	
	public static String getContexts() {
		return contexts;
	}

	public static void setContexts(String contexts) {
		BoxOfficeView.contexts = contexts;
	}

	public static void main(String[] args) throws Exception {
		contexts = new String(Files.readAllBytes(Paths.get("BoxOffice.txt")),"EUC-KR");
		new BoxOffice();
	}
}
