package com.sunglowsys.service;

import com.sunglowsys.domain.Patient;

import java.util.List;

public interface PatientService {

    Patient createPatient(Patient patient);

    Patient updatePatient(Patient patient,Long id);

    List<Patient> findAllPatient();

    Patient deletePatient(Long id);

    Patient patientFindById(Long id);

}
