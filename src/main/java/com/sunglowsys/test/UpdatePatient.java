package com.sunglowsys.test;

import com.sunglowsys.domain.Patient;
import com.sunglowsys.service.PatientService;
import com.sunglowsys.service.PatientServiceImpl;

public class UpdatePatient {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setFirstName("patient");
        new PatientServiceImpl().updatePatient(patient,1L);
    }
}
