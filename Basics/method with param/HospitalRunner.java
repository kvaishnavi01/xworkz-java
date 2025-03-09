//3. HospitalRunner.main---> Hospital.checkup(patientname,age,mobile,email,sicknes)--->Doctor.treatment(patientname,age)-->Nurse.assist(customername)

class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("Main method running");
        Hospital.checkup("Alice", 30, "9876543210", "alice@example.com", "Fever");
    }
}

class Hospital {
    public static void checkup(String patientName, int age, String mobile, String email, String sickness) {
        System.out.println("checking" + patientName + " with sickness: " + sickness);
        Doctor.treatment(patientName, age);
    }
}

class Doctor {
    public static void treatment(String patientName, int age) {
        System.out.println("Doctor treating " + patientName + ", Age: " + age);
        Nurse.assist(patientName);
    }
}

class Nurse {
    public static void assist(String patientName) {
        System.out.println("Nurse assisting " + patientName);
    }
}
