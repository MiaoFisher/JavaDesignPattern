package DesignPattern.visitor.Person;

import DesignPattern.visitor.action.Action;

public class Man extends Person {

    public Man(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
