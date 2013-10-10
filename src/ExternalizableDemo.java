import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化与反序列化的操作
 */
public class ExternalizableDemo {
	public static void main(String[] args) throws Exception {
		ser();// 序列化
		dser();// 反序列化
	}

	public static void ser() throws Exception {
		File file = new File("d:" + File.separator + "hello.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				file));
		oos.writeObject(new PersonB("echo", 20));
		oos.close();
	}

	public static void dser() throws Exception {
		File file = new File("d:" + File.separator + "hello.txt");
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(
				file));
		Object obj = input.readObject();
		input.close();
		System.out.println(obj);
	}
}
