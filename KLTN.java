public class KLTN<T extends Student, V extends Person> implements Comparable<KLTN<T, V>>{
  private T student;
  private V supervisor;
  private String topic;

  public KLTN(T student, V supervisor, String topic) {
      this.student = student;
      this.supervisor = supervisor;
      this.topic = topic;
  }

  public T getStudent() {
      return student;
  }

  public void setStudent(T student) {
      this.student = student;
  }

  public V getSupervisor() {
      return supervisor;
  }

  public void setSupervisor(V supervisor) {
      this.supervisor = supervisor;
  }

  public String getTopic() {
      return topic;
  }

  public void setTopic(String topic) {
      this.topic = topic;
  }

  @Override
  public int compareTo(KLTN<T, V> other) {
      return this.topic.compareToIgnoreCase(other.topic);
  }
}
