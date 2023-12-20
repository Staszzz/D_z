package animals.birds;

import animals.Animal;

public class Duck extends Animal implements IFly{

    public void say(){
    System.out.println("Крряяя");
}

    public void fly(){
    System.out.println("я лечу");
    }
}
