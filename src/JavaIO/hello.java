package JavaIO;


import java.io.File;

public class hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f=new File("D:\\hello.txt");
		try{ 
            f.createNewFile(); //创建文件
        }catch (Exception e) { 
            e.printStackTrace(); 
        }
	}

}
