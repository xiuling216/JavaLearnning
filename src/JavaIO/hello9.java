package JavaIO;
/**
 * lxl_pro
 */


import java.io.File;
/**
 * ʹ��isDirectory�ж�һ��ָ����·���Ƿ�ΪĿ¼
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
