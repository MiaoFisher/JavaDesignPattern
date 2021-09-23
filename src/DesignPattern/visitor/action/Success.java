package DesignPattern.visitor.action;

import DesignPattern.visitor.Person.Man;
import DesignPattern.visitor.Person.Woman;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人:" + man.getName() + "认为他很棒");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人:" + woman.getName() + "认为他很棒");

    }
}
