package com.example.uas;

import java.io.Serializable;
import java.util.ArrayList;

public class Employees implements Serializable {
    ArrayList<Dataset> employees;

    public ArrayList<Dataset> getEmployees(){
        return employees;
    }

    public void setEmployees(ArrayList<Dataset>employees){
        this.employees = employees;
    }


}
