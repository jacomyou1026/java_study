package collection_framework;

import  java.util.*;
public class ArrayListEx {
	private String title;
	private String content;
	private final String date ;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();//<String>�dfdfdk안녕하세요!
		// TODO Auto-generated method stub\
		al.add("three");
		al.add("two");
		for(int i=0;i<al.size();i++) {
			String value= al.get(i);//Arraylist-objectŸ���̿���
	 		System.out.println(value);

		}


	}
}
