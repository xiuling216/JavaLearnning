package JavaReflect;
/*
 * 通过一个对象获得完整的包名和类名
 */
class Demo{
	
}
public class hello1 {

	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println(demo.getClass().getName());
	}

}
