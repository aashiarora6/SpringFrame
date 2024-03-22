package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor d1 = context.getBean(Doctor.class);
        d1.assist();
        d1.setQualification("MBBS");
    }
}