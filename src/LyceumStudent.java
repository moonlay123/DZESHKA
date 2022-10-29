import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LyceumStudent extends Lyceum{
    private int Knowledge;
    public void SetKnowledge(){
        Knowledge=(new Scanner(System.in)).nextInt();
    }
    public void DoPKR() {
        if (Knowledge < 30) {
            System.out.println("You haven't passed(");
        } else if (Knowledge < 50) {
            System.out.println("Not Bad");
        } else if (Knowledge < 75) {
            System.out.println("Good");
        } else {
            System.out.println("WOW");
        }
        Hp -= 70;
        MaxHp -= 5;
            DyesFromCringe();
    }
    public void BoringLesson(){
        System.out.println("This lesson is sooooo boring, i want to sleep");
        Sleep();
    }
    public void InterestingLesson(){
        System.out.println("Wow, this lesson is funny!");
        SleepLevel+=10;
        Hp+=10;
    }
    public void DoHomework(int times){
        for(int i=0;i<times;i++){
            SleepLevel-=40;
            Hp-=20;
            Knowledge+=5;
        }
        DyesFromCringe();
    }
}
