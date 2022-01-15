package com.sunglowsys.repository;


import com.sunglowsys.domain.Patient;
import com.sunglowsys.util.HibernateConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class PatientRepositoryImpl implements PatientRepository {

    private SessionFactory sessionFactory = HibernateConnection.getSessionFactory();

    @Override
    public Patient createPatient(Patient patient){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(patient);
        session.getTransaction().commit();
        Patient result = session.get(Patient.class,id);
        return result;
    }

    @Override
    public Patient updatePatient(Patient patient,Long id) {

        Session session  = sessionFactory.openSession();
         Transaction transaction = session.beginTransaction();
        Patient patient1  = session.get(Patient.class,id);
        patient1.setFirstName(patient.getFirstName());
         session.update(patient1);
         session.getTransaction().commit();
         session.close();
        System.out.println("updated");
        return null;
    }

    @Override
    public List<Patient> findAllPatient(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Patient");
        List<Patient> patientList = query.list();
        session.getTransaction().commit();
        session.close();
        return patientList;

    }


    @Override
    public Patient deletePatient(Long id) {
        Session session  = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Patient patient = session.get(Patient.class,id);

        session.delete(patient);
        session.getTransaction().commit();
        session.close();
        System.out.println("deleted");
        return patient;
    }

    @Override
    public Patient patientFindById(Long id) {

        Session session = sessionFactory.openSession();

        Patient patient = session.get(Patient.class,id);

        return patient;
    }
}
