import java.util.Scanner;

public class Teacher extends Lyceum{
    private String FunnyPhrase;
    public void CreatePhrase(){
        FunnyPhrase=(new Scanner(System.in)).next();
    }
    private String LessonType="Usual";
    public void NewLessonType(){
        LessonType=(new Scanner(System.in)).next();
    }
    @Override
    public void Sleep() {
        System.out.println("I NEVER SLEEP");
    }
    public void StartLesson() {
        System.out.println(LessonType+" lesson starts");
    }
    public void PhraseMoment(){
        System.out.println(FunnyPhrase);
    }
    public void EndLesson(){
        System.out.println(LessonType+" lesson ends");
    }
    public void TestVerification(){
        DyesFromCringe();
    }
}
