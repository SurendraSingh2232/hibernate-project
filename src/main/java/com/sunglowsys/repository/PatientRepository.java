package com.sunglowsys.repository;

import com.sunglowsys.domain.Patient;

import java.util.List;

public interface PatientRepository {

    Patient createPatient(Patient patient);

    Patient updatePatient(Patient patient,Long id);

    List<Patient> findAllPatient();

    Patient deletePatient(Long id);

    Patient patientFindById(Long id);
}
