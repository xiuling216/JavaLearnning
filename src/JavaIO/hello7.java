package JavaIO;


import java.io.File;
/**
 * ʹ��list�г�ָ��Ŀ¼��ȫ���ļ�
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
