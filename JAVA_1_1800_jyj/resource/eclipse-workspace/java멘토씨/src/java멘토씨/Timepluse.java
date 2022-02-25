package java∏‡≈‰ææ;

import java.time.LocalDate;

public class Timepluse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate Id = LocalDate.now();
		System.out.println(Id);
		
		LocalDate Id2= Id.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println(Id2);
		
		LocalDate Id3 = Id2.minusDays(3);
		System.out.println(Id3);
		
		LocalDate Id4 =Id3.plusWeeks(3);
		System.out.println(Id4);
	}
}
