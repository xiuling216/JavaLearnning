package JavaIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化一组对象
 */
public class serDemoB {
	public static void main(String[] args) throws Exception {
		PersonC[] per = { new PersonC("echo", 20), new PersonC("snow", 30),
				new PersonC("sunny", 40) };
		ser(per);// 序列化
		Object[] obj = dser();// 反序列化
		for (int i = 0; i < obj.length; i++) {
			PersonC p = (PersonC) obj[i];
			System.out.println(p);
		}
	}

	public static void ser(Object[] obj) throws Exception {
		File file = new File("d:" + File.separator + "hello.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				file));
		oos.writeObject(obj);
		oos.close();
	}

	public static Object[] dser() throws Exception {
		File file = new File("d:" + File.separator + "hello.txt");
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(
				file));
		Object[] obj = (Object[]) input.readObject();
		input.close();
		return obj;
	}
}
