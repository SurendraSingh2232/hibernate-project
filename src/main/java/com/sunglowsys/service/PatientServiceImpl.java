package com.sunglowsys.service;

import com.sunglowsys.domain.Patient;
import com.sunglowsys.repository.PatientRepository;
import com.sunglowsys.repository.PatientRepositoryImpl;

import java.util.List;

public class PatientServiceImpl implements PatientService{

    private PatientRepository patientRepository = new PatientRepositoryImpl();


    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.createPatient(patient);
    }

    @Override
    public Patient updatePatient(Patient patient ,Long id) {

        return patientRepository.updatePatient(patient,id);
    }

    @Override
    public List<Patient> findAllPatient() {
        List<Patient> patientList = patientRepository.findAllPatient();
        return patientList;
    }

    @Override
    public Patient deletePatient(Long id) {

        patientRepository.deletePatient(id);
        return null;
    }

    @Override
    public Patient patientFindById(Long id) {
        Patient patient = patientRepository.patientFindById(id);
        return patient;
    }
}

