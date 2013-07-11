package JavaReflect;

import java.lang.reflect.*;

public class Hello17 {
	public static void main(String[] args){
	Class<?> demo=null;
	try {
		demo=Class.forName("JavaReflect.PersonB");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
    Constructor[] methods = demo.getConstructors();
        for (int i = 0; i < methods.length; i++) { 
            System.out.println("构造方法：  "+methods[i]); 
        } 
    }
}
