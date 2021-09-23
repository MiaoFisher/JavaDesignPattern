package DesignPattern.iterator;

import DesignPattern.iterator.collage.Collage;
import DesignPattern.iterator.department.Department;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ��������ģʽ��
 * �ṩһ�ֱ�������Ԫ�ص�ͳһ�ӿڣ���һһ�µķ���ȥ��ɱ�������Ԫ�أ�����Ҫ֪������ĵײ��ʾ�����ᱩ¶���ݽṹ���ڲ�
 * Iterator���ṩ����Ԫ�ص�ͳһ�ӿ�
 * ����ʵ�ֵķ�����
 * hasNext()==>�Ƿ�����һ��Ԫ��
 * next()==>������һ��Ԫ��
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
