package DesignPattern.iterator.collage;

import DesignPattern.iterator.department.Department;
import DesignPattern.iterator.iterator.ComputerCollageIterator;

import java.util.Iterator;

public class ComputerCollage implements Collage {
    Department departments[];
    //��ǰ�����Ԫ�ظ���
    int position = 0;

    public ComputerCollage() {
        departments = new Department[5];
        addDepartment("java����");
        addDepartment("PHP����");
        addDepartment("C#����");
    }

    @Override
    public String getName() {
        return "�����ѧԺ";
    }

    @Override
    public void addDepartment(String name) {
        departments[position] = new Department(name);
        position++;

    }

    /**
     * ����һ��������
     * @return
     */
    @Override
    public Iterator iterator() {
        return new ComputerCollageIterator(departments);
    }
}
