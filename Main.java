public class Main {

    public static void main(String[] args) {
        int currentYear = 2024;
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "A", "0123456789");
        patient.displayDetails(currentYear);
        Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0, "B", "0987654321");
        invalidPatient.displayDetails(currentYear);
    }

}
