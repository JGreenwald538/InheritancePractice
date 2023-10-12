class Maintenance extends SchoolPerson {
    String managingArea;
    public Maintenance(int age, String name, int code, String managingArea) {
        super(age, name, code);
        this.managingArea = managingArea;
    }
    public void speak() {
        System.out.println("Nah, I'm good.");
    }
    public void clean() {
        System.out.println("On it.");
    }
}