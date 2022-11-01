public class Homework_8 {
    public static void main(String[] args) {
        Fraction fraction1=new Fraction(6.9);
        Fraction fraction2=new Fraction(fraction1);
        Fraction fraction3=new Fraction(11.56);
        fraction1.GetFraction();
        fraction2.GetFraction();
        fraction3.GetFraction();
        fraction3.mult(fraction1);
        fraction1.sum(fraction2);
        fraction1.GetFraction();
        fraction2.GetFraction();
        fraction3.GetFraction();
    }
}
