package com.LabInventory.lab;

public class Demo {
    public static void main(String[] args) {

            Computer c1 = new Computer("Ali","New",10,10,false);
            Computer c2 = new Computer("A","New",10,10,false);
            Computer c3 = new Computer("A","New",10,10,false);

            Lab l1 = new Lab("L1", new Computer[]{c1,c2},null,null);
            Lab l2 = new Lab("L1", new Computer[]{c1,c2},null,null);
            University u1 = new University();
            u1.labArray(l1);
            u1.labArray(l2);
            u1.print();
            l1.add(c3);
            l1.print();
            System.out.println(l1.getComputer("Ali"));

            System.out.println(l1);
            l1.changeStatus(LabStatus.OPERATIONAL);
            System.out.println(l1);

            System.out.println(c3);


    }
}
