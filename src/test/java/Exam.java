public class Exam extends Grades{
    public void registGradeToSubject(String subject, String grade){
        for (String[] grad:grades){
            if(grad[0] == subject){
                grad[1] = grade;
            }
        }
    }
}
