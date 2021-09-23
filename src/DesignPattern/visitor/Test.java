package DesignPattern.visitor;

import DesignPattern.visitor.Person.Man;
import DesignPattern.visitor.Person.Woman;
import DesignPattern.visitor.action.Success;
import DesignPattern.visitor.structure.Persons;

public class Test {
    public static void main(String[] args) {
        Persons persons = new Persons();
        persons.attach(new Woman("������"));
        persons.attach(new Man("����ʢ"));
        persons.display(new Success());
    }
}
