package sach;
import java.io.*;
import java.util.Scanner;
public class book implements Serializable, Comparable<Object> {
	private String nameBook;
	private String nameAuthor;
	private int Cost;
	private String type;
        private int amount;	

  
public book() {};
public void setAmount(int amount) {
        this.amount = amount;
}
 public int getAmount() {
        return amount;
}
public String getNameBook() {
	return nameBook;
}
public void setNameBook(String nameBook) {
	this.nameBook = nameBook;
}
public String getNameAuthor() {
	return nameAuthor;
}
public void setNameAuthor(String nameAuthor) {
	this.nameAuthor = nameAuthor;
}
public int getCost() {
	return Cost;
}
public void setCost(int cost) {
	Cost = cost;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
    public void getCost(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
