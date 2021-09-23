package DesignPattern.visitor.action;

import DesignPattern.visitor.Person.Man;
import DesignPattern.visitor.Person.Woman;

public abstract class Action {
    public abstract void getManResult(Man man);
    public abstract void getWomanResult(Woman woman);
}
