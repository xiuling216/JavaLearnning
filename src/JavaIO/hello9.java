package JavaIO;
/**
 * lxl_pro
 */


import java.io.File;
/**
 * 使用isDirectory判断一个指定的路径是否为目录
 */
public class hello9 {
	public static void main(String[] args) {
		File f=new File("D:"+File.separator);
		if(f.isDirectory()){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
