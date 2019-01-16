package com.bridgelabz.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StockList {
private String stockName;
private int stockPrice;
private double numberShares;
private String date;
private String transaction;

public String getStockName() {
	return stockName;
}
public void setStockName(String stockName) {
	this.stockName = stockName;
}
public int getStockPrice() {
	return stockPrice;
}
public void setStockPrice(int stockPrice) {
	this.stockPrice = stockPrice;
}
public double getNumberShares() {
	return numberShares;
}
public void setNumberShares(double d) {
	this.numberShares = d;
}

public String getDate() {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  
    System.out.println();  
    date=dtf.format(now);
    return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTransaction() {
	return transaction;
}
public void setTransaction(String s) {
	this.transaction = s;
}


}
