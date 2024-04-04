package heritage;

public class Animal {
    public void makeSound(){

    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}

class Chien extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Wouf");
    }
}
