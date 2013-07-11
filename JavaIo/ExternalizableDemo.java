import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���л��뷴���л��Ĳ���
 */
public class ExternalizableDemo {
	public static void main(String[] args) throws Exception {
		ser();// ���л�
		dser();// �����л�
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
