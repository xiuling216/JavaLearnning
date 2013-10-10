package JavaIO;
/**
 * lxl_pro
 */


import java.io.File;
/**
 * 使用listFiles列出指定目录的全部文件
 * listFiles输出的是完整路径
 */
public class hello8 {
	public static void main(String[] args) {
		File f=new File("D:"+File.separator);
		File[] str=f.listFiles();
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
}
