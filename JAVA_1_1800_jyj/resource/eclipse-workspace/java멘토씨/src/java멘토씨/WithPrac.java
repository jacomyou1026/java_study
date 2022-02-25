package java∏‡≈‰ææ;

import java.time.LocalDate;

public class WithPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate Id = LocalDate.now();
		System.out.println(Id);

		LocalDate new_Id = Id.withYear(1999).withMonth(7).withDayOfYear(23);
		System.out.println(new_Id);
		
	}

}
