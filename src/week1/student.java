package week1;
/**
 * Aleks Bechard
 */
public class student
{
   private String studentId;
   private String studentName;

   public student (String studentId, String studentName)
   {
      this.studentId = studentId;
      this.studentName = studentName;
   }

   public void setStudentId (String studentId)
   {
      this.studentId = studentId;
   }

   public void setStudentName (String studentName)
   {
      this.studentName = studentName;
   }

   public String getStudentId ()
   {
      return studentId;
   }

   public String getStudentName ()
   {
      return studentName;
   }

}
