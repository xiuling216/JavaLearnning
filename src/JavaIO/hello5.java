package JavaIO;


import java.io.File;
/**
 * 创建一个文件夹
 */
public class hello5 {
	public static void main(String[] args) {
		File f=new File("D:"+File.separator+"hello");
		f.mkdir();
	}
}
