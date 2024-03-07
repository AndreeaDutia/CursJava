package curs2;

public class Room {

	//variabile
	private int lungime;
	private int latime;
	
	
	//metode
	
	public int calculArie(int lungime, int latime) {
		//int arie = lungime * latime;
		//return arie;
		return lungime * latime;
	}
	
	public void calculPerimetru () {
		//int perimetru = 2 * (lungime * latime);
		//System.out.println(perimetru);
		return 2 * (lungime + latime);
	}
	
	//constructor
	public Room(int lungime, int latime) {
	 this.lungime = lungime;
	 this.latime = latime;
	}
	
}
