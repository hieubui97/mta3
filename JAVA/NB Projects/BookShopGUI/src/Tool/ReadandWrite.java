package Tool;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import sach.book;

public class ReadandWrite 
{
public ReadandWrite() {};	
public ArrayList<book> Read() throws IOException, ClassNotFoundException
{	ArrayList<book> o= new ArrayList<>();
	try {   
    try (FileInputStream f = new FileInputStream("D:\\datas11.dat"); ObjectInputStream oStream = new ObjectInputStream(f)) {
        o=(ArrayList<book>) oStream.readObject();
    }
		return o;
	} catch (FileNotFoundException e) {
	}
	return o;	
}
public void Write(ArrayList<book> list) throws IOException, ClassNotFoundException
{
	try {
            try (FileOutputStream f = new FileOutputStream("D:\\datas11.dat"); ObjectOutputStream oStream = new ObjectOutputStream(f)) {
                oStream.writeObject(list);
            }
	} catch (FileNotFoundException e) {
	}	
}

   

    public void Write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
