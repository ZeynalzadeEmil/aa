package hospitalmanagementsystem;


import java.util.ArrayList;
import java.util.List;

class Hospital {
    private List<Patient> patients;

    public Hospital() {
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getPatients() {
        return patients;
    }
}