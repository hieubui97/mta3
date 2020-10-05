package QuanLySach;
import java.io.*;
import java.util.Scanner;
@SuppressWarnings("serial")
public class book implements Serializable, Comparable<Object> {
	private String nameBook;
	private String nameAuthor;
	private int Cost;
	private String type;
transient Scanner nhap1= new Scanner(System.in);	
protected book() {};
protected book(String tensach,String tentacgia,String theloai,int gia) {
	this.nameBook=tensach;
	this.nameAuthor=tentacgia;
	this.type=theloai;
	this.Cost=gia;
};
protected String getNameBook() {
	return nameBook;
}
protected void setNameBook(String nameBook) {
	this.nameBook = nameBook;
}
protected String getNameAuthor() {
	return nameAuthor;
}
protected void setNameAuthor(String nameAuthor) {
	this.nameAuthor = nameAuthor;
}
protected int getCost() {
	return Cost;
}
protected void setCost(int cost) {
	Cost = cost;
}
protected String getType() {
	return type;
}
protected void setType(String type) {
	this.type = type;
}

protected void nhap()
{	nhap1=new Scanner(System.in);
	System.out.println("Nhap ten sach: "); setNameBook(nhap1.nextLine());
	System.out.println("Nhap ten tac gia: "); setNameAuthor(nhap1.nextLine());
	System.out.println("The loai: ");	setType(nhap1.nextLine());
	System.out.println("Gia(VND): "); setCost(nhap1.nextInt());	
}
protected void xuat()
{
	System.out.print("Ten Sach:"+ nameBook+"\t");
	System.out.print("Tac gia: "+ nameAuthor+"\t");
	System.out.print("The loai: "+ type+"\t");
	System.out.println("Gia: "+ Cost+"VND");
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
}
