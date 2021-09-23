package DesignPattern.iterator;

import DesignPattern.iterator.collage.Collage;
import DesignPattern.iterator.collage.ComputerCollage;
import DesignPattern.iterator.collage.InfoCollage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ComputerCollage computerCollage = new ComputerCollage();
        InfoCollage infoCollage = new InfoCollage();
        LinkedList<Collage> collages = new LinkedList<>();
        collages.add(computerCollage);
        collages.add(infoCollage);
        OutputImpl output = new OutputImpl(collages);
        output.printCollage();
        

    }
}
