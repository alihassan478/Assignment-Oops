package com.LabInventory.lab;

public class Lab {
    private String labID;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;

    static int index = 0;

    public Lab() {
        this.labID = "Default";
        this.computers = null;
        this.status = null;
        this.labAttendant = null;
    }

    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public void add(Computer c) {
        if (computers == null) {
            computers = new Computer[1];
        } else {
            
            Computer[] newComputers = new Computer[computers.length + 1];

            for (int i = 0; i < computers.length; i++) {
                newComputers[i] = computers[i];
            }

            newComputers[computers.length] = c;

            computers = newComputers;
        }
        computers[index] = c;
        index++;
    }


    public void print(){
        for(int i=0;i<computers.length;i++){
            System.out.println(computers[i]);
        }
        System.out.println(computers.length);

    }


    public Computer getComputer(String s1){
        for(Computer comp : computers){
            if(comp.getComputerNumber().equals(s1)){
                return comp;
            }
        }
        return null;
    }
    public void changeStatus(LabStatus l1){
        this.status = l1;
    }

//    public String toString() {
//        return String.format("%s" , status);
//    }

}
