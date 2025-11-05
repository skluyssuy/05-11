public class Teacher extends Person {
  protected String ID;
  protected String title;

  public Teacher(String fullName, String ID, String email, String title) {
    super(fullName, email);
    this.ID = ID;
    this.title = title;
  }

  public String getID() {
    return ID;
  }

  public String getTitle() {
    return title;
  }
}
