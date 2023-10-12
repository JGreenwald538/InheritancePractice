class Teacher extends SchoolPerson {
    int numberOfClasses;
    public Teacher(int age, String name, int code, int numberOfClasses) {
        super(age, name, code);
        this.numberOfClasses = numberOfClasses;
    }
    public void speak() {
        System.out.println("That's not in my contract.");
    }
    public void grade() {
        System.out.println("You get an A and you get an A! Everybody gets an A!");
    }
}