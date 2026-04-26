public class Student {
    private String name;
    private int id;
    private int age;
    private String grade;

    public Student(String name, int id, int age, String grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }

    public void displayStudent() {
        System.out.println("ID: " + id + " | Name: " + name + 
                           " | Age: " + age + " | Grade: " + grade);
    }
}
