package com.techpalle.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.techpalle.model.Employee;

public class MyProgram {

	public static void main(String[] args) {
		//Step 1: Load Configuration xml(Session factory)
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		//Step 2: Open Session
		Session s =sf.openSession();
		
		//Step 3: Begin Transation
		Transaction t = s.beginTransaction();
		
		//Step 4: Create objects for Employee table
		Employee e1 = new Employee(1, "Akarsh", "Developer", 40000);
		/*Employee e2 = new Employee(2, "Sudeep", "Developer", 50000);
		Employee e3 = new Employee(3, "Bill", "HR", 100000);*/
		
		//Step 5: Save objects to Session
		s.save(e1);
		/*s.save(e2);
		s.save(e3);*/
		
		//Step 6: Save entire Transaction
		//t.commit();
		
		//Step 7: close session
		//s.close();
		
		//Step 8: close Session Factory
		//sf.close();
		
		
		//How to read rows from the table
			Employee first = s.get(Employee.class, 1);
			System.out.println(first.getEno());
			System.out.println(first.getEname());
			System.out.println(first.getEdesignation());
			System.out.println(first.getEsalary());
		 
		
		//get Employee detais whose eno is 3
			Employee third = s.get(Employee.class, 3);
			System.out.println(third.getEno());
			System.out.println(third.getEname());
		    System.out.println(third.getEdesignation());
			System.out.println(third.getEsalary());
			 
			
			 
		//Update row in a Employee table
			//Transaction tr = s.beginTransaction();
			Employee x = s.get(Employee.class, 3);
			x.setEname("Bill Gates");
			s.update(x);
			//tr.commit();
			
			
			
		//Delete a row from the table
			//Transaction tn = s.beginTransaction();
			Employee dl = s.get(Employee.class, 1);
			s.delete(dl);
			//tn.commit();
			
			t.commit();
			s.close();
			sf.close();
			
		}

}
