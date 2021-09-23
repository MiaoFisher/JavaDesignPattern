package DesignPattern.iterator.iterator;

import DesignPattern.iterator.department.Department;

import java.util.Iterator;

/**
 * @author mxs
 */
public class ComputerCollageIterator implements Iterator {
    //这里先不考虑数组膨胀的问题
    Department departments[];
    int position = 0;

    public ComputerCollageIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position > departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }
}
