package com.bridgeLab.solution.oop.Practice;

import java.util.Scanner;

public class StockReport {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stocks: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        StockPortfolio portfolio = new StockPortfolio();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Stock " + (i + 1) + ":");
            System.out.print("Stock Name: ");
            String name = scanner.nextLine();
            System.out.print("Number of Shares: ");
            int numberOfShares = scanner.nextInt();
            System.out.print("Share Price: $");
            double sharePrice = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            Stock stock = new Stock(name, numberOfShares, sharePrice);
            portfolio.addStock(stock);
        }

        portfolio.printStockReport();

        scanner.close();
    }
}




	


