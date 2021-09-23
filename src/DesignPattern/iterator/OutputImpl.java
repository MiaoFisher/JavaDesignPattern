package DesignPattern.iterator;

import DesignPattern.iterator.collage.Collage;
import DesignPattern.iterator.department.Department;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 【迭代器模式】
 * 提供一种遍历集合元素的统一接口，用一一致的方法去完成遍历集合元素，不需要知道对象的底层表示，不会暴露数据结构的内部
 * Iterator是提供遍历元素的统一接口
 * 必须实现的方法是
 * hasNext()==>是否有下一个元素
 * next()==>返回下一个元素
 * @author mxs
 */
public class OutputImpl {
    List<Collage> collages;
    public OutputImpl(List collages){
        this.collages = collages;
        
    }
    public void printCollage(){
        Iterator<Collage> iterator = collages.iterator();
        while (iterator.hasNext()){
            Collage collage = iterator.next();
            System.out.println("==============="+collage.getName()+"==============");
            printDepartment(collage.iterator());
        }
    }
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
