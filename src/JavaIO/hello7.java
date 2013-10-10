package JavaIO;


import java.io.File;
/**
 * 使用list列出指定目录的全部文件
 */
public class hello7 {
	public static void main(String[] args) {
		File f=new File("D:"+File.separator);
		String[] str=f.list();
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
}
