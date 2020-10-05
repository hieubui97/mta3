package QuanLySach;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Runn {
private static Scanner sc;

//private static ArrayList<book> list;

public static void main(String[] args) throws ClassNotFoundException, IOException 
{	File file = new File("D:\\datas.txt");       	
	sc = new Scanner(System.in);
	int a=33;
	while(a!=0)
	{
	System.out.println("Press...");
        System.out.println("1 to Add");
	System.out.println("2 to Show");
	System.out.println("3 to Delete");
	System.out.println("4 to Search");
	System.out.println("5 to Fix");
	System.out.println("6 to Sort");
	System.out.println("0 to exit");
        System.out.println("--------------");
	a=sc.nextInt();
	switch (a)
	 {
	case 0: {System.out.println("Tks for using"); break;}
	case 1:
	  {
		Tool t= new Tool();
		t.add();
		break;
	  }
	case 2:
	  {
		Tool t= new Tool();
		t.show();
		break;
	  }
	case 3:
	  {
		Tool t= new Tool();
		t.delete();
		break;
	  }
	case 4:
	  {
		Tool t= new Tool();
		t.search();
		break;	
	  }
	case 5:
	  {
		Tool t= new Tool();
		t.fix();
		break;	
	  }
	case 6:
	  {
		Tool t= new Tool();
		t.sort();
		break;	
	  }
	 }
	}

}
}




