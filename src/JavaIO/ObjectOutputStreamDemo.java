package JavaIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 * Ê¾·¶ObjectOutputStream 
 */
public class ObjectOutputStreamDemo{
	public static void main(String[] agrs) throws FileNotFoundException, IOException{
		File file=new File("d:"+File.separator+"hello.txt");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(new Person("echo",20));
		oos.close();
	}
}