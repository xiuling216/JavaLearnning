package JavaIO;


import java.io.File;
/**
 * ����һ���ļ���
 */
public class hello5 {
	public static void main(String[] args) {
		File f=new File("D:"+File.separator+"hello");
		f.mkdir();
	}
}
