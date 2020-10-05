package QuanLySach;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Tool {

	Tool(){};
	Scanner sc= new Scanner(System.in);
void show() throws ClassNotFoundException, IOException
	{
		ReadandWrite s=new ReadandWrite();
		ArrayList<book> list = (ArrayList<book>) s.Read();
		System.out.println("Ket qua:");
		xuat(list);
	}
void add() throws ClassNotFoundException, IOException
	{
		ReadandWrite s = new ReadandWrite();
		ArrayList<book> list = null;
		list=(ArrayList<book>) s.Read();
		int n = 69;
		while(n!=0)
		{	
			book s1 = new book();
			s1.nhap();
			list.add(s1);
			System.out.print("Press 1 to continue and 0 to exit: ");
			n=sc.nextInt();		
		}
		s.Write(list);
		System.out.println("Done");
	}
void delete() throws ClassNotFoundException, IOException
	{
		ReadandWrite s=new ReadandWrite();
		ArrayList<book> list = (ArrayList<book>) s.Read();
		int n;
		System.out.println("Danh sach hien tai:");
		xuat(list);
		System.out.println("Nhap vi tri quyen sach can xoa: "); n=sc.nextInt();
		list.remove(n-1);
		System.out.println("Done");
		s.Write(list);
	}
void search() throws ClassNotFoundException, IOException
	{
		ReadandWrite s=new ReadandWrite();
		ArrayList<book> list = (ArrayList<book>) s.Read();
		int c=33;
		System.out.println("Press");
		System.out.println("1 de Tim theo ten sach");
		System.out.println("2 de Tim theo tac gia");
		System.out.println("3 de Tim theo the loai");
		System.out.println("4 de Tim theo gia(VND)");
		c=sc.nextInt(); sc=new Scanner(System.in);
		switch (c)
		{
		case 1:
		 {
			System.out.println("Nhap ten Sach: ");
			String t=sc.nextLine();
			System.out.println("Ket qua tim kiem:");
			for(book s2:list)
			{	if(t.equals(s2.getNameBook()))
				{
				s2.xuat();
				System.out.println("");
				}
			}
			break;
		 }
		case 2:
		 {
			System.out.println("Nhap ten tac gia: ");
			String t=sc.nextLine();
			System.out.println("Ket qua tim kiem:");
			for(book s2:list)
			{	if(t.equals(s2.getNameAuthor()))
				{
				s2.xuat();
				System.out.println("");
				}
			}
			break;
		 }
		case 3:
		 {
			System.out.println("Nhap ten the loai: ");
			String t=sc.nextLine();
			System.out.println("Ket qua tim kiem:");
			for(book s2:list)
			{	if(t.equals(s2.getType()))
				{
				s2.xuat();
				System.out.println("");
				}
			}
			break;
		 }
		case 4:
		 {
		   System.out.print("from ");
		   int t=sc.nextInt();
		   System.out.print("to ");
		   int t1=sc.nextInt();
		   System.out.println("Ket qua tim kiem:");
		   for(book s2:list)
			{	if(t<=s2.getCost()&&s2.getCost()<=t1)
				{
				s2.xuat();
				System.out.println("");
				}
			}
		   break;
		 }
		 default: break;
	 	}
	System.out.println("Done");
	}	
void fix() throws ClassNotFoundException, IOException
	{
		ReadandWrite s=new ReadandWrite();
		ArrayList<book> list = (ArrayList<book>) s.Read();
		int i=1,n;
		System.out.println("Danh sach hien tai:");
		xuat(list);
		System.out.println("Nhap vi tri quyen sach can sua: "); n=sc.nextInt();
		for(book b:list)
		{
			if(i==n) {bookfix b1=new bookfix(); b1.nhap(); list.set(i-1,b1); break;}
			else i++;
		}
		s.Write(list);
		System.out.println("Done");
	}
void sort() throws ClassNotFoundException, IOException
	{
		ReadandWrite s=new ReadandWrite();
		ArrayList<book> list = (ArrayList<book>) s.Read();
		int c=33;
		System.out.println("Press");
		System.out.println("1 sap xep theo ten sach");
		System.out.println("2 sap xep tac gia");
		System.out.println("3 sap xep theo the loai");
		System.out.println("4 sap xep theo gia(VND)");
		c=sc.nextInt(); sc=new Scanner(System.in);
		switch (c)
		{
		case 1:
		{
		Collections.sort(list, new Comparator<Object>()
		    {
			@Override
			public int compare(Object o1, Object o2)
			{
				book b1=(book) o1;
				book b2=(book) o2;
				return b1.getNameBook().compareTo(b2.getNameBook());
			}
		    }
			);
		System.out.println("Danh sach sau sap xep:");
		xuat(list);
		break;
		}
		case 2:
		{
			Collections.sort(list, new Comparator<Object>()
			    {
				@Override
				public int compare(Object o1, Object o2)
				{
					book b1=(book) o1;
					book b2=(book) o2;
					return b1.getNameAuthor().compareTo(b2.getNameAuthor());
				}
			    }
				);
			System.out.println("Danh sach sau sap xep:");
			xuat(list);
			break;
		}		
		case 3:
		{
			Collections.sort(list, new Comparator<Object>()
			    {
				@Override
				public int compare(Object o1, Object o2)
				{
					book b1=(book) o1;
					book b2=(book) o2;
					return b1.getType().compareTo(b2.getType());
				}
			    }
				);
			System.out.println("Danh sach sau sap xep:");
			xuat(list);
			break;
		}
		case 4:
		{
			Collections.sort(list, new Comparator<Object>()
		    {
			@Override
			public int compare(Object o1, Object o2)
			{
				book b1=(book) o1;
				book b2=(book) o2;
				if (b1.getCost()<b2.getCost()) return -1;
				else if(b1.getCost()>b2.getCost()) return 1;
				else return 0;
			}
		    }
			);
		System.out.println("Danh sach sau sap xep:");
		xuat(list);
		break;	
		}	
	    }
	}
void xuat(ArrayList<book> list)
{
	int i=1;
	for(book b:list)
	{
		System.out.print(i+".");
		b.xuat();
		i++;
	}
}
}
