import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/**
 * 一次压缩多个文件
 */
public class hello14 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:" + File.separator + "temp");
        File zipFile = new File("d:" + File.separator + "temp.zip");
        InputStream input = null;
        ZipOutputStream zipout = new ZipOutputStream(new FileOutputStream(
                zipFile));
        if(file.isDirectory()){
            File[] fileList=file.listFiles();
            for(int i=0;i<fileList.length;i++){
                input=new FileInputStream(fileList[i]);
                zipout.putNextEntry(new ZipEntry(fileList[i].getName()));
                int temp=0;
                while((temp=input.read())!=(-1)){
                    zipout.write(temp);
                }
                input.close();
            }
        }
        zipout.close();
    }
}