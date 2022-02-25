package collection_framework;

import java.util.*;

/**
 * 안녕하세요!
 */
class Computer implements Comparable {
	int serial;
	String owner;

	Computer(int serial, String owner) {
		this.serial = serial;
		this.owner = owner;
	}

	@Override
	public int compareTo(Object o) {
		return this.serial - ((Computer) o).serial;
	}

	public String toString() {
		return serial + " " + owner;
	}

}

public class CollecctionDemo {
	public static void main(String[] args) {
		   List<Computer> computer = new ArrayList<Computer>();
	        comp uter.add(new Computer(200, "leezche"));
	        computer.add(new Computer(500, "egoing"));
	        computer.add(new Computer(3233, "graphittie"));
	        Iterator i = computer.iterator();
		System.out.println("before");
		while(i.hasNext()){
			System.out.println(i.next());
	        }
	        Collections.sort(computer);
	        System.out.println("\nafter");
	        i = computer.iterator();
	        while(i.hasNext()){
	            System.out.println(i.next());
	        }
	    }
	 
}
