package com.bridgeLab.solution.oop.Practice;

public class Stock {
	
	private String name;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice) {
        this.name = name;
        this.setNumberOfShares(numberOfShares);
        this.setSharePrice(sharePrice);
    }

    public double calculateStockValue() {
        return getNumberOfShares() * getSharePrice();
    }

    public String getName() {
        return name;
    }

	public int getNumberOfShares() {
		return numberOfShares;
		
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
		
	}

	public double getSharePrice() {
		return sharePrice;
		
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
		
	}

}
