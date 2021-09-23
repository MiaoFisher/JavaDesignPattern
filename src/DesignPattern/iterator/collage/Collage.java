package DesignPattern.iterator.collage;

import java.util.Iterator;

public interface Collage {
    /**
     * ����ѧԺ������
     * @return
     */
    public String getName();

    /**
     * ���רҵ
     * @param name
     */
    public void addDepartment(String name);

    /**
     * ����һ��������
     * @return
     */
    public Iterator iterator();
}
