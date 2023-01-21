package reflection.e4;

import java.lang.reflect.Method;

public class B {
	public static void main(String[] args) throws Exception {

		Class c = A.class;
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("message", null);
		m.setAccessible(true);
		m.invoke(o, null);
	}
}
