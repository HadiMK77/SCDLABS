package Lab10t1;

public class StudentMain {
 public static void main(String[] args) {
     FailedStudent failedStudent = new FailedStudent(101, "MATH101", "Mathematics");
     System.out.println("Failed Student Details:");
     System.out.println("Roll Number: " + failedStudent.getRollNumber());
     System.out.println("Subject Code: " + failedStudent.getSubjectCode());
     System.out.println("Subject Name: " + failedStudent.getSubjectName());

     PromotedStudent promotedStudent = new PromotedStudent(102, "CS101", "Computer Science");
     System.out.println("\nPromoted Student Details (Before Update):");
     System.out.println("Roll Number: " + promotedStudent.getRollNumber());
     System.out.println("Subject Code: " + promotedStudent.getSubjectCode());
     System.out.println("Subject Name: " + promotedStudent.getSubjectName());

     promotedStudent.setRollNumber(103);
     promotedStudent.setSubjectCode("CS102");
     promotedStudent.setSubjectName("Data Structures");

     System.out.println("\nPromoted Student Details (After Update):");
     System.out.println("Roll Number: " + promotedStudent.getRollNumber());
     System.out.println("Subject Code: " + promotedStudent.getSubjectCode());
     System.out.println("Subject Name: " + promotedStudent.getSubjectName());
 }
}
