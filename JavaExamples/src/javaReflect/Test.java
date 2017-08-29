package javaReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by luosv on 2017/8/29 0029.
 */
public class Test {

    public static void main(String... args) throws NoSuchMethodException, IllegalAccessException
            , InvocationTargetException, InstantiationException {

        Class<Person> personClass = Person.class;
        Constructor<Person> personConstructor = personClass.getDeclaredConstructor();
        personConstructor.setAccessible(true);
        Person person = personConstructor.newInstance();

        Method method = personClass.getDeclaredMethod("setAge", int.class);
        System.out.println("使用反射获取到的方法名：" + method.getName());
        method.setAccessible(true);
        Method setAge = personClass.getDeclaredMethod("setAge", int.class);
        setAge.setAccessible(true);
        setAge.invoke(person, 16);
        System.out.println("使用反射初始化年龄之后的年龄的值：" + person.getAge());

    }

}
