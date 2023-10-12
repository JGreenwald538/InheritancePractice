class Administrator extends SchoolPerson {
    String title;
    public Administrator(int age, String name, int code, String title) {
        super(age, name, code);
        this.title = title;
    }
    public void speak() {
        System.out.println("Let me just check with the BOE for I do that.");
    }
    public void manage() {
        System.out.println("Hey guys just checking making sure you did everything I asked of you to a very detailed degree.");
    }
}