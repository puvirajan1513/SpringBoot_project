package org.tnsif.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dept.xml");

        Employee emp = (Employee) context.getBean("employeeBean");
        System.out.println(emp);
    }
}

