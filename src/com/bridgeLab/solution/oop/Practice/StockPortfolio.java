package com.bridgeLab.solution.oop.Practice;

import java.util.ArrayList;
import com.bridgeLab.solution.oop.Practice.Stock;

public class StockPortfolio {
	
	private ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double calculateTotalPortfolioValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.calculateStockValue();
        }
        return totalValue;
    }

    public void printStockReport() {
        System.out.println("Stock Report:");
        for (Stock stock : stocks) {
            System.out.println("Stock Name: " + stock.getName());
            System.out.println("Number of Shares: " + stock.getNumberOfShares());
            System.out.println("Share Price: $" + stock.getSharePrice());
            System.out.println("Stock Value: $" + stock.calculateStockValue());
            System.out.println();
        }
        System.out.println("Total Portfolio Value: $" + calculateTotalPortfolioValue());
    }

}
