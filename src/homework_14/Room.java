package homework_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Room {

    private int number;
    private Sex type;
    private Set<Patient> patients = new TreeSet<>();

    public Room(int number, Sex type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Sex getType() {
        return type;
    }

    public void setType(Sex type) {
        this.type = type;
    }

    public boolean addPatient(Patient patient) {
        if (patient.getSex() != this.type) {
            System.out.println("нужна операция по смене пола)");
            return false;
        }
        if (patients.size() >= 3) {
            System.out.println("в данной палате мест нет");
            return false;
        }
        if (!patients.isEmpty() &&
                !patients.iterator().next().getDiagnosis().equals(patient.getDiagnosis())) {
            System.out.println("неверный диагноз");
            return false;
        }

        return patients.add(patient);
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public String getPatientsInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Палата ").append(number).append("\n");
        for (Patient p : patients) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }




}
