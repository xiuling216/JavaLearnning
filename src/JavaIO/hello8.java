package JavaIO;
/**
 * lxl_pro
 */


import java.io.File;
/**
 * ʹ��listFiles�г�ָ��Ŀ¼��ȫ���ļ�
 * listFiles�����������·��
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
