package DesignPattern.visitor.Person;

import DesignPattern.visitor.action.Action;

public abstract class Person {
    private String name;

   Person(String name){
       this.name = name;
   }

    public String getName() {
        return name;
    }

    public abstract void accept(Action action);
}
