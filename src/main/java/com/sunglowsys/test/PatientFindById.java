package com.sunglowsys.test;

import com.sunglowsys.domain.Patient;
import com.sunglowsys.repository.PatientRepository;
import com.sunglowsys.service.PatientServiceImpl;

public class PatientFindById {
    public static void main(String[] args) {
        Patient patient = new PatientServiceImpl().patientFindById(3L);
        System.out.println(patient);
    }
}
