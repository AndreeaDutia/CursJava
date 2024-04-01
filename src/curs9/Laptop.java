package curs9;

public class Laptop extends Product {
	
	private int buyPrice;
	private int adaos;

	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return buyPrice + adaos;
	}
	public Laptop(int buyPrice, int adaos) {
		this.buyPrice = buyPrice;
		this.adaos = adaos;
	}

}
