package curs9;

public class ExceptionExample {

	public static void main(String[] args) {
		String[] week = {"L", "M", "M", "J", "V", "S", "D"};
		//				0		1	2	3	  4	   5    6
		
		try {
			System.out.println(week[7]);
		}catch (ArrayIndexOutOfBoundsException err) {
			System.out.println("Am prins o eroare: " + err.getMessage());
			System.out.println("Stack trace: ");
			err.printStackTrace();
		}
		
		
		System.out.println("---------------------------------------------------");
		
		for(String day : week) {
			System.out.println(day);
		}

	}

}
