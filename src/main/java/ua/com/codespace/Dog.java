package ua.com.codespace;

public class Dog {

    private String name;
    private int age;

    public Dog() {
        System.out.println("Constructor");
    }

    public void init2() {
        System.out.println("init method");
    }

    public void destroy() {
        System.out.println("destroy method");
    }

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

    public void say() {
        System.out.println("Гав-гав");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
