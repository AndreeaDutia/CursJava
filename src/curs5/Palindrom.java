package curs5;

public class Palindrom {

	public static void main(String[] args) {
		
		//palindrom ==> radar ==> abba
		
		String cuvant = "masina"; //cuvant.lenght() == 5
		//				 01234
		String cuvantIntors = "";
		
		//cuvantIntors = "";
		//cuvantIntors = cuvant.charAt(4) = r
		//cuvantIntors = cuvantIntors + cuvant.charAt(4) 
		//cuvantIntors (r)  = r + cuvant.charAt(3) = a	
		// ra = ra + cuvant.charAt(3) --> d
		
		for (int i = cuvant.length()-1; i >= 0; i--) {
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
			System.out.println(cuvantIntors);
		}
		System.out.println(cuvantIntors);
		if(cuvant.equals(cuvantIntors)) {
			System.out.println("Este palindrom");
		}else {
			System.out.println("Nu este palindrom");
		}
	}

}
