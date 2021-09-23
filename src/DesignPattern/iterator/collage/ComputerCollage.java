package DesignPattern.iterator.collage;

import DesignPattern.iterator.department.Department;
import DesignPattern.iterator.iterator.ComputerCollageIterator;

import java.util.Iterator;

public class ComputerCollage implements Collage {
    Department departments[];
    //当前数组的元素个数
    int position = 0;

    public ComputerCollage() {
        departments = new Department[5];
        addDepartment("java语言");
        addDepartment("PHP语言");
        addDepartment("C#语言");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name) {
        departments[position] = new Department(name);
        position++;

    }

    /**
     * 返回一个迭代器
     * @return
     */
    @Override
    public Iterator iterator() {
        return new ComputerCollageIterator(departments);
    }
}
