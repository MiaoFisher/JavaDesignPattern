package DesignPattern.iterator.collage;

import DesignPattern.iterator.department.Department;
import DesignPattern.iterator.iterator.InfoCollageIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InfoCollage implements Collage{
    LinkedList<Department> departments;
    public InfoCollage(){
        departments = new LinkedList<>();
        addDepartment("��Ϣ��ȫѧԺ");
        addDepartment("��·��ȫѧԺ");
    }
    @Override
    public String getName() {
        return "��Ϣ����ѧԺ";
    }

    @Override
    public void addDepartment(String name) {
        departments.add(new Department(name));
    }

    @Override
    public Iterator iterator() {
        return new InfoCollageIterator(departments);
    }
}
