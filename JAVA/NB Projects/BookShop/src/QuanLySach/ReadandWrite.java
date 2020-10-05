package QuanLySach;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ReadandWrite 
{
public ReadandWrite() {};	
public ArrayList<book> Read() throws IOException, ClassNotFoundException
{	ArrayList<book> o= new ArrayList<>();
	try {   
		FileInputStream f = new FileInputStream("D:\\datas.txt");
		ObjectInputStream oStream= new ObjectInputStream(f);
		o=(ArrayList<book>) oStream.readObject();
		oStream.close();
		f.close();
		return o;
	} catch (FileNotFoundException e) {
	}
	return o;	
}
public void Write(ArrayList<book> list) throws IOException, ClassNotFoundException
{
	try {
		FileOutputStream f = new FileOutputStream("D:\\datas.txt");
		ObjectOutputStream oStream= new ObjectOutputStream(f);
		oStream.writeObject(list);
		oStream.close();
		f.close();
	} catch (FileNotFoundException e) {
	}	
}
}
