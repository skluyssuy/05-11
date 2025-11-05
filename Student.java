public class Student extends Person {
  protected String ID;

  public Student(String fullName, String ID, String email) {
    super(fullName, email);
    this.ID = ID;
  }

  public String getID() {
    return ID;
  }
}
