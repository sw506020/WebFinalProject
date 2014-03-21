package org.wws.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.wws.service.TestHibernate;

import java.util.Arrays;

@org.springframework.context.annotation.Configuration
@EnableAutoConfiguration
@ComponentScan("org.wws")
public class Application {



    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");
        
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }


        TestHibernate test = new TestHibernate();
        //test.run();

    }




//    public static void run() {
//
//        SessionFactory factory;
//        try {
//            factory = new Configuration().configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            System.err.println("Failed to create sessionFactory object." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//
//        Session session = factory.openSession();
//        Transaction tx = null;
//        try {
//            tx = session.beginTransaction();
//            //begin create objects
//            Address address = new Address("11 overlook ridge dr", "revere", "ma", "02151");
//            Department department = new Department("Eco System");
//            Employee employee = new Employee("weiwei", "su", 150000, department, address);
//            tx.commit();
//        } catch(HibernateException e) {
//            if(tx!=null) tx.rollback();
//        } finally {
//            session.close();
//        }
//
//
//
//
//    }




//    public Integer addEmployee(String fname, String lname, int salary){
//        Session session = factory.openSession();
//        Transaction tx = null;
//        Integer employeeID = null;
//        try{
//            tx = session.beginTransaction();
//            Employee employee = new Employee(fname, lname, salary);
//            employeeID = (Integer) session.save(employee);
//            tx.commit();
//        }catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
//            e.printStackTrace();
//        }finally {
//            session.close();
//        }
//        return employeeID;
//    }


}
