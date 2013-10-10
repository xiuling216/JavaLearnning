

import java.io.File;
/**
 * 删除一个文件夹
 */
public class hello6 {
	public static void main(String[] args) {
		File f=new File("D:"+File.separator+"hello");
		if(f.exists()){
			f.delete();
		}else{
			System.out.println("文件夹不存在"); 
		}
	}
}
