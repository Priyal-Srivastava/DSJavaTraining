package OOPS;

public class StudentUsingEncap {
    public static void main(String[] args) {
        Students student = new Students();
        student.setName("Priyal Srivastava");
        student.setMail("xyz@gamail.com");
        student.setRollno(48);
        student.setTechnology("JAVA");

        System.out.println(student.getName()+" "+student.getRollno()+" "+student.getMail()+" "+student.getTechnology());
    }

}

class Students{
    private String name;
    private int rollno;
    private String mail;
    private String technology;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

}
