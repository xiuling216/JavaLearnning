package JavaIO;


import java.io.File;

public class hello3 {

	public static void main(String[] args) {
		String path="D:"+File.separator+"hello.txt";
		File f=new File(path);
		try{ 
            f.createNewFile(); //创建文件
        }catch (Exception e) { 
            e.printStackTrace(); 
        }
	}

}
