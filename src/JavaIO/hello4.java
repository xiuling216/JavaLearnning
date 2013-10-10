package JavaIO;


import java.io.File;
/**
 * 删除文件
 */
public class hello4 {

	public static void main(String[] args) {
		String path="D:"+File.separator+"hello.txt";
		File f=new File(path);
		if(f.exists()){
			f.delete();
		}else{
			System.out.println("文件不存在"); 
		}
	}

}
