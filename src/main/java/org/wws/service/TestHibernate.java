package org.wws.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.util.ClassLoaderHelper;
import org.springframework.stereotype.Service;
import org.wws.entity.department.Department;
import org.wws.entity.employee.Employee;
import org.wws.entity.user.Address;

import java.io.FileOutputStream;

/**
 * Created by weiweisu on 3/20/14.
 */
@Service
public class TestHibernate {

    public void run() {

        SessionFactory factory;

        try {
            ClassLoader classLoader = ClassLoaderHelper.getContextClassLoader();
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/webapp/test.txt");
            factory = new Configuration().configure("src/main/webapp/hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            //begin create objects
            Address address = new Address("11 overlook ridge dr", "revere", "ma", "02151");
            Department department = new Department("Eco System");
            Employee employee = new Employee("weiwei", "su", 150000, department, address);
            tx.commit();
        } catch(HibernateException e) {
            if(tx!=null) tx.rollback();
        } finally {
            session.close();
        }
//
//
//
//
   }

}
