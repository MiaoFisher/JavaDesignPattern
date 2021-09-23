package DesignPattern.visitor.action;

import DesignPattern.visitor.Person.Man;
import DesignPattern.visitor.Person.Woman;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("����:" + man.getName() + "��Ϊ���ܰ�");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Ů��:" + woman.getName() + "��Ϊ���ܰ�");

    }
}
