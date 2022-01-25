package week1;
/**
 * Aleks Bechard
 */
public class partTimeStudent extends student
{

   private int numCourses;

   public int getNumCourses ()
   {
      return numCourses;
   }

   public void setNumCourses (int numCourses)
   {
      this.numCourses = numCourses;
   }

   public partTimeStudent (String studentId, String studentName)
   {
      super(studentId, studentName);
   }



}
