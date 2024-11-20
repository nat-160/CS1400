import java.text.DecimalFormat;

public class Student {
  private String name, bID;
  private double grade;

  public Student(String fName, String lName, String bID, double grade) {
    name = fName + " " + lName;
    this.bID = bID;
    this.grade = grade;
  }

  public String getFullName() {
    return name;
  }

  public String getBroncoId() {
    return bID;
  }

  public String getGrade() {
    DecimalFormat formatter = new DecimalFormat("#0.00");
    return formatter.format(grade);
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  public String toString() {
    return "Student: " + name + ", Bronco ID: " + bID + ", Grade: " + getGrade();
  }
}
