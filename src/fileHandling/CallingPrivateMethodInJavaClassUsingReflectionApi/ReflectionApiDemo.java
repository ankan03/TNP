package fileHandling.CallingPrivateMethodInJavaClassUsingReflectionApi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApiDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
//        Test test = new Test();
//        test.show();
        Class c = Class.forName("fileHandling.CallingPrivateMethodInJavaClassUsingReflectionApi.Test");
        Test test1 = (Test)c.newInstance();

        Method method = c.getDeclaredMethod("show",null);
        method.setAccessible(true);
        method.invoke(test1,null);

    }
}
