package ua.com.codespace;

public class DogFactory {

    public static Dog createDog(String name, int age) {
        Dog dog = new Dog();
        dog.setAge(age);
        dog.setName(name);
        return dog;
    }

}
