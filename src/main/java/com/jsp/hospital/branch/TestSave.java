package com.jsp.hospital.branch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pallavi");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hospital hospital=new Hospital();
		hospital.setGst_number("12345");
		hospital.setName("Apollo");
		
		Branch branch1=new Branch();
		branch1.setLocation("vashi");
		branch1.setName("apollo1");
		
		Branch branch2=new Branch();
		branch2.setLocation("thane");
		branch2.setName("apollo2");
		
		Branch branch3=new Branch();
		branch3.setLocation("panvel");
		branch3.setName("apollo3");
		
		List<Branch>branchs=new ArrayList<Branch>();
		branchs.add(branch1);
		branchs.add(branch2);
		branchs.add(branch3);
		
		hospital.setBranches(branchs);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}}
