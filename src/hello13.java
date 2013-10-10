import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class hello13 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:" + File.separator + "hello.txt");
        File zipFile = new File("d:" + File.separator + "hello.zip");
        InputStream input = new FileInputStream(file);
        ZipOutputStream zipout = new ZipOutputStream(new FileOutputStream(
                zipFile));
        zipout.putNextEntry(new ZipEntry(file.getName()));
        zipout.setComment("hello");
        int temp=0;
        while((temp=input.read())!=(-1)){
            zipout.write(temp);
        }
        input.close();
        zipout.close();
    }
}