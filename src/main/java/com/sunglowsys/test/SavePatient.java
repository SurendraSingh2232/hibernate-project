package com.sunglowsys.test;

import com.sunglowsys.domain.Patient;
import com.sunglowsys.service.PatientService;
import com.sunglowsys.service.PatientServiceImpl;

public class SavePatient {
    public static void main(String[] args) {
        Patient patient = new Patient("Dinesh","Kumar","male",24,"9675382845", "Hirdesh","h23","r435");

        PatientService patientService = new PatientServiceImpl();
        Patient result = patientService.createPatient(patient);
        System.out.println(result);
    }
}
