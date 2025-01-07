package Lab10t1;

class PromotedStudent {
 private int rollNumber;
 private String subjectCode;
 private String subjectName;

 public PromotedStudent(int rollNumber, String subjectCode, String subjectName) {
     this.rollNumber = rollNumber;
     this.subjectCode = subjectCode;
     this.subjectName = subjectName;
 }

 public int getRollNumber() {
     return rollNumber;
 }

 public String getSubjectCode() {
     return subjectCode;
 }

 public String getSubjectName() {
     return subjectName;
 }

 public void setRollNumber(int rollNumber) {
     this.rollNumber = rollNumber;
 }

 public void setSubjectCode(String subjectCode) {
     this.subjectCode = subjectCode;
 }

 public void setSubjectName(String subjectName) {
     this.subjectName = subjectName;
 }
}

