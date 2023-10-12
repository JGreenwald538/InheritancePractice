class Student extends SchoolPerson{
    String grade;
    public Student(int age, String name, int code, String grade){
        super(age, name, code);
        this.grade = grade;
    }
    public void speak() {
        System.out.println("I'll speak when I want to.");
    }
    public void study() {
        System.out.println("I'll start studying in 5 minutes.");
    }
}