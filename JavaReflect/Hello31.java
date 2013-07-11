package JavaReflect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 操作属性文件类
 */
class init {
	public static Properties getPro() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		File f = new File(".\\pro\\fruit.properties");//压制Java语言的访问控制检查 
		if (f.exists()) {
			pro.load(new FileInputStream(f));
		} else {
			pro.setProperty("apple", "JavaReflect.Apple");
			pro.setProperty("orange", "JavaReflect.Orange");
			pro.store(new FileOutputStream(f), "FRUIT CLASS");
		}
		return pro;
	}
}

public class Hello31 {
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		Properties pro = init.getPro();
		fruit f = FactoryReflect.getInstance(pro.getProperty("apple"));
		if (f != null) {
			f.eat();
		}
	}

}
