package javaReflect;

/**
 * Created by luosv on 2017/8/29 0029.
 */
public class Person {

    public String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("公有构造方法被调用");
    }

    private Person() {
        System.out.println("私有构造方法被调用");
    }

}
