package day1Assignments;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student ObjStudent = new Student();
      System.out.println("Name of the Student is:"+ObjStudent.studentName);
      System.out.println("CollegeName is :"+ObjStudent.collegeName);
      System.out.println("RollNumber is: "+ObjStudent.rollNo);
      System.out.println("MarksScored by"+ObjStudent.studentName+"is :" +ObjStudent.marksScored);
      System.out.println("Student Percentage is :"+ObjStudent.cgpa);
    ObjStudent.MarksScored();
    
       
	}

}
