package com.LabInventory.lab;

import java.util.Arrays;

public class University {

    Lab[] labs;

    static int index = 0;
  public void labArray(Lab l){
      if(labs == null){
          labs = new Lab[1];
      } else {
          Lab[] newLabs = new Lab[labs.length + 1];

          for(int i = 0; i<labs.length;i++){
              newLabs[i]=labs[i];
          }

          newLabs[labs.length] = l;

          labs = newLabs;
      }
      labs[index] = l;
      index++;
  }

    public void print(){
        for(int i=0;i<labs.length;i++){
            System.out.println(labs[i]);
        }
        System.out.println(labs.length);

    }

    @Override
    public String toString() {
        return "University{" +
                "labs=" + Arrays.toString(labs) +
                '}';
    }
}
