package com.sunglowsys.test;

import com.sunglowsys.domain.Patient;
import com.sunglowsys.service.PatientServiceImpl;

import java.util.List;

public class FindAllPatient {
    public static void main(String[] args) {
        List<Patient> patientList = new PatientServiceImpl().findAllPatient();
        for (Patient patient : patientList) {
            System.out.println(patient);
        }
    }
}