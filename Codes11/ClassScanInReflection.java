import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

class A
{
	int b;
	private int c;
	static int d;
	A(int b, int c ){
		this.b = b;
		this.c = c;
	}
	private void print(){
		System.out.println("this is print");
	}
	void show(){
		
	}
	
}
public class ClassScanInReflection {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		A obj = new A(10,20);
		Class cls2 = obj.getClass();  // Data + MetaData
		Method method = cls2.getDeclaredMethod("print", null);
		method.setAccessible(true);
		method.invoke(obj, null);
		Class cls = A.class;
		Field fields[] = cls.getDeclaredFields();
		Method methods [] = cls.getDeclaredMethods();
		for(Method m: methods){
			TypeVariable t [] = m.getTypeParameters();
			Class c = t.getClass();
			Method methodA = cls.getDeclaredMethod(m.getName(),c);
			methodA.invoke(obj, 10,20);
		}
		for(Field field :fields){
			if(!Modifier.isPrivate(field.getModifiers())){
				System.out.println("these fields are not private "+field.getName());
			}
		}
		System.out.println(fields.length);
		System.out.println(methods.length);
	}

}




