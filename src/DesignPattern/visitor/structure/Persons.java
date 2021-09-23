package DesignPattern.visitor.structure;

import DesignPattern.visitor.Person.Person;
import DesignPattern.visitor.action.Action;

import java.util.LinkedList;
import java.util.List;

/**
 * ��������ģʽ��
 * ���ڷ�װĳЩ���ݽṹ�Ը���Ԫ�صĲ������������ڲ��ı����ݽṹ��ǰ���¶�����ЩԪ�صĲ���
 * ��ʵ�ַ�����ͨ���½�һ���࣬�����ݽṹ��������ջ�ȷ�װ�����棩
 * ͨ���Լ��������ݽṹʵ���Լ��Ĳ�����������Service��Dao�Ĳ�����
 * ���ڶ����ݵ��Զ����������
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
