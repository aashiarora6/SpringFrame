package org.example;

import org.springframework.stereotype.Component;


public class Doctor implements  Staff {

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
         '}';
    }
    private String qualification;
    public void assist(){
        System.out.println("Doctor is Assisting");
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getQualification() {
        return qualification;
    }
}
