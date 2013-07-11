import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
/**
 * ��ѹ��һ��ѹ���ļ��а�������ļ������ 
 */
public class hello15 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:" + File.separator + "temp.zip");
        File outFile = null;
        ZipFile zipFile=new ZipFile(file);
        ZipInputStream zipInput=new ZipInputStream(new FileInputStream(file));
        ZipEntry entry=null;
        InputStream input=null;
        OutputStream output=null;
        while((entry=zipInput.getNextEntry())!=null){
        	System.out.println("��ѹ����"+entry.getName()+"�ļ�");
        	outFile=new File("d:"+File.separator+"temp"+File.separator+entry.getName());
        	if(!outFile.getParentFile().exists()){
        		outFile.getParentFile().mkdir();
        	}
        	if(!outFile.exists()){
        		outFile.createNewFile();
        	}
        	input=zipFile.getInputStream(entry);
        	output=new FileOutputStream(outFile);
        	int temp=0;
        	while((temp=input.read())!=(-1)){
        		output.write(temp);
        	}
        	input.close();
        	output.close();
        }
    }
}