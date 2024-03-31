package curs8;

public class Qualification extends Teacher {

	public Qualification(String Course, String Schedule, int ExperienceYears) {
        super(Course, Schedule, ExperienceYears);
    }
	
	public void verify() {
        if (ExperienceYears > 3 && Course.equals("Java") && Schedule.equals("Afternoon")) {
            System.out.println("You qualify to teach at this school!");
        } else {
            System.out.println("You do not qualify!");
        }
    }
}
	
	


