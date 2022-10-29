import java.util.Scanner;

public class Homework_7 {
    public static void main(String[] args) {
        LyceumStudent Semen = new LyceumStudent();
        Teacher AVI=new Teacher();
        Semen.SetName();
        Semen.SetKnowledge();
        AVI.SetName();
        Semen.DoPKR();
        AVI.TestVerification();
        Semen.DoHomework(10);
        Semen.DoPKR();
        AVI.TestVerification();
        AVI.Sleep();
        AVI.Coffee();
        AVI.NewLessonType();
        AVI.StartLesson();
        Semen.InterestingLesson();
        AVI.EndLesson();
    }
}
