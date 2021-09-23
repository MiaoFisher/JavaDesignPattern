package DesignPattern.iterator.iterator;

import DesignPattern.iterator.department.Department;

import java.util.Iterator;
import java.util.List;

public class InfoCollageIterator implements Iterator {
    List<Department> departments;
    int position = 0;

    public InfoCollageIterator(List departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.size()) {
            return false;
        }

        return true;
    }

    @Override
    public Object next() {
        Department department = departments.get(position);
        position++;
        return department;
    }
}
