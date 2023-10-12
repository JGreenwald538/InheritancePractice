class Main {
  public static void main(String[] args) {
    System.out.println("Bob:");
    Person Bob = new Person(14, "Bob");
    Bob.live();
    System.out.println("Jack:");
    SchoolPerson Jack = new SchoolPerson(14, "Jack", 123);
    Jack.speak();
    Jack.live();
    Jack.location();
    System.out.println("Arav:");
    Person Arav = new SchoolPerson(17, "Arav", 543);
    Arav.live();
    // Arav.speak(); Does not work
    // Arav.location(); Does not work
    System.out.println("Logan:");
    SchoolPerson Logan = new Student(18, "Logan", 987, "A");
    Logan.speak();
    Logan.live();
    Logan.location();
    // Logan.study(); Does not work
    System.out.println("Caleb:");
    Student Caleb = new Student(16, "Caleb", 629, "A");
    Caleb.speak();
    Caleb.live();
    Caleb.location();
    Caleb.study();
    System.out.println("George:");
    Maintenance George = new Maintenance(43, "George", 234, "AIT");
    George.speak();
    George.live();
    George.location();
    George.clean();
    System.out.println("Noah:");
    Teacher Noah = new Teacher(25, "Noah", 1, 6);
    Noah.speak();
    Noah.live();
    Noah.location();
    Noah.grade();
    System.out.println("Eduardo:");
    Administrator Eduardo = new Administrator(35, "Eduardo", 3, "AIT");
    Eduardo.speak();
    Eduardo.live();
    Eduardo.location();
    Eduardo.manage();
  }
}