

import java.io.File;
/**
 * ɾ��һ���ļ���
 */
public class hello6 {
	public static void main(String[] args) {
		File f=new File("D:"+File.separator+"hello");
		if(f.exists()){
			f.delete();
		}else{
			System.out.println("�ļ��в�����"); 
		}
	}
}
