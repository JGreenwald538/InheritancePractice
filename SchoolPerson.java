class SchoolPerson extends Person {
    int code;
    public SchoolPerson(int age, String name, int code) {
        super(age, name);
        this.code = code;
    }
    public void location() {
        System.out.println("I go to a school every day.");
    }
    public void speak() {
        System.out.println("Speak");
    }
}