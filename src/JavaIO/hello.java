package JavaIO;


import java.io.File;

public class hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f=new File("D:\\hello.txt");
		try{ 
            f.createNewFile(); //�����ļ�
        }catch (Exception e) { 
            e.printStackTrace(); 
        }
	}

}
