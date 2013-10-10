package JavaIO;
/**
 * lxl_pro
 */


import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

public class hello12 {
	public static void main(String[] args) throws IOException {
		File file1 = new File("d:" + File.separator + "hello1.txt");
		File file2 = new File("d:" + File.separator + "hello2.txt");
		File file3 = new File("d:" + File.separator + "hello.txt");
		InputStream input1 = new FileInputStream(file1);
		InputStream input2 = new FileInputStream(file2);
		OutputStream output = new FileOutputStream(file3);
		// ºÏ²¢Á÷
		SequenceInputStream sis = new SequenceInputStream(input1, input2);
		int temp = 0;
		while ((temp = sis.read()) != (-1)) {
			output.write(temp);
		}
		input1.close();
		input2.close();
		sis.close();
		output.close();
	}
}
