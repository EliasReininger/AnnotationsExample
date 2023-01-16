import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        for (Method method: MyClass.class.getDeclaredMethods()) {
            if(method.isAnnotationPresent(Repeat.class)){

                Repeat r = method.getAnnotation(Repeat.class);

                for (int i = 0; i < r.repeats(); i++) {
                    method.invoke(method);
                }
            }
        }
    }
}