package DesignPattern.visitor.structure;

import DesignPattern.visitor.Person.Person;
import DesignPattern.visitor.action.Action;

import java.util.LinkedList;
import java.util.List;

/**
 * 【访问者模式】
 * 用于封装某些数据结构对各项元素的操作，他可以在不改变数据结构的前提下定义这些元素的操作
 * 【实现方法】通过新建一个类，将数据结构（如链表，栈等封装在里面）
 * 通过自己操作数据结构实现自己的操作（类似于Service对Dao的操作）
 * 便于对数据的自定义操作管理
 */
public class Persons {
    private List<Person> persons = new LinkedList<>();

    public void attach(Person person) {
        persons.add(person);
    }

    public void detach(Person person) {
        persons.remove(person);
    }

    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }

    }
}
