package QuanLySach;
import java.util.Scanner;
@SuppressWarnings("serial")
public class bookfix extends book {
bookfix(){};
@Override
protected void nhap()
{
	nhap1=new Scanner(System.in);
	System.out.println("Nhap ten moi: "); setNameBook(nhap1.nextLine());
	System.out.println("Nhap ten tac gia moi: "); setNameAuthor(nhap1.nextLine());
	System.out.println("Nhap the loai moi : ");	setType(nhap1.nextLine());
	System.out.println("Nhap gia(VND) moi: "); setCost(nhap1.nextInt());		
}
}