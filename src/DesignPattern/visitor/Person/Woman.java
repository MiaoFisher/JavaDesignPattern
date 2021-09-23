package DesignPattern.visitor.Person;

import DesignPattern.visitor.action.Action;

public class Woman extends Person{
    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
