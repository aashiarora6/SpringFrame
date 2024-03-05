package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")

public class Doctor implements  Staff, BeanNameAware {

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

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean method was called");
    }
}
