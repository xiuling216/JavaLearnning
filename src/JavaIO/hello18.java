package JavaIO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/**
 * ȡ�ñ��ص�Ĭ�ϱ��� 
 */
public class hello18 {
	public static void main(String[] args) throws IOException{
		File file=new File("d:"+File.separator+"hello.txt");
		OutputStream out=new FileOutputStream(file);
		byte[] bytes="���".getBytes("ISO8859-1");
		out.write(bytes);
		out.close();
	}
}
