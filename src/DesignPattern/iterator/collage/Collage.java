package DesignPattern.iterator.collage;

import java.util.Iterator;

public interface Collage {
    /**
     * 返回学院的名字
     * @return
     */
    public String getName();

    /**
     * 添加专业
     * @param name
     */
    public void addDepartment(String name);

    /**
     * 返回一个迭代器
     * @return
     */
    public Iterator iterator();
}
