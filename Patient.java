public class Patient {
    String Patientname;
    double height;
    double weight;
    Patient(String name, double height, double weight) {
        this.Patientname = name;
        this.height = height;
        this.weight = weight;
    }
    double computeBMI(){
        return height * weight;
    }
    public static void main(String [] args){
        Patient patient = new Patient("John Doe", 45, 0.8);
       System.out.println("patient:" + patient.Patientname);
        System.out.println(patient.computeBMI());
    }
}
