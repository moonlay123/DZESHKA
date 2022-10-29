import java.util.Scanner;

public class Lyceum {
    protected String Name;
    protected int Hp=100;
    protected int Knowledge=100;
    protected int MaxHp=100;
    private int Speed=5;
    private int Damage=60;
    protected int SleepLevel=100;
    public void SetName(){
        Name=(new Scanner(System.in)).next();
    }
    public void Sleep(){
        System.out.println("*Sleep sounds*");
        Hp=MaxHp;
        SleepLevel=100;
    }
    public void Coffee(){
        System.out.println(Name+" used 1 cup of Coffee");
        Hp-=10;
        DyesFromCringe();
        SleepLevel+=50;
    }
    public void DyesFromCringe(){
        if(Hp<=0) {
            System.out.println("that's it, I can't do it anymore, *dies from cringe*");
        }
    }
}
