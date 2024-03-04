package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Doctor s1 = context.getBean(Doctor.class);
        s1.assist();
        System.out.println(s1.getQualification());


        Doctor d1 = context.getBean(Doctor.class);
        d1.assist();

        Nurse n1 = (Nurse) context.getBean("nurse");
        n1.assist();
    }
}