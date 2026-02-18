public class Student {

    private String name;
    private int age;
    private String studentID;

    public Student(String name, int age,String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public void printInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        if (studentID != null) {
            System.out.println("ID: " + studentID);
        }
    }

    public String toString() {
        return "Name : " + name + "\n" +
                "Age : " + age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getStudent(){
        return studentID;
    }


}
