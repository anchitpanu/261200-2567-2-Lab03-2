public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;

        if (birthYear < 0) {
            this.birthYear = -birthYear;
            System.out.println("Invalid birthYear");
        }
        if (height < 0) {
            this.height = 0;
        }
        if (weight < 0) {
            this.weight = 0;
        }
    }

    public int getAge(int currentYear) {
        if (currentYear > birthYear) {
            return currentYear - birthYear;
        } else {
            return 0;
        }
    }

    public double getBMI() {
        if (height > 0 && weight >0) {
            return weight / Math.pow((height / 100), 2);
        } else {
            return 0;
        }
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient bloodGroup: " + bloodGroup);
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient BMI: " + getBMI());
        System.out.println("Patient Phone Number: " + phoneNumber + "\n");
    }

}

