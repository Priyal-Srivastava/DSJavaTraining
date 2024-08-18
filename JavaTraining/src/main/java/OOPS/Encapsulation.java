package OOPS;

// it is data binding using methods
public class Encapsulation {
    public static void main(String[] args) {

        // to print the trainer profile
        Trainers trainers = new Trainers();

        //1. data add using objects and references
        trainers.name = "Pawan";
        trainers.email = "xyz@gmail.com";
        trainers.technology = "JAVA";
        System.out.println(trainers.name + " " + trainers.email + " " +trainers.technology);

        //2. data add using objects and methods
        trainers.printProfile("Pawan", "xyz@gmail.com", "JAVA");

        //3. add the data using getter and setter
        trainers.setName("Pawan");
        trainers.setEmail("xyz@gmail.com");
        trainers.setTechnology("JAVA");

        System.out.println(trainers.getName() + " " + trainers.getEmail() + " " + trainers.getTechnology());
    }
}

class Trainers{
    String name;
    String email;
    String technology;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void printProfile(String pawan, String mail, String java) {
        System.out.println(pawan + " " + mail + " " + java);
    }
}