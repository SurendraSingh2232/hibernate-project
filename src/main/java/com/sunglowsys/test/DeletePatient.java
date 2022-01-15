package com.sunglowsys.test;

import com.sunglowsys.repository.PatientRepositoryImpl;
import com.sunglowsys.service.PatientServiceImpl;

public class DeletePatient {
    public static void main(String[] args) {
        new PatientServiceImpl().deletePatient(4L);
    }
}
