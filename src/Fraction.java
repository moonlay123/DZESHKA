public class Fraction {
    private int numerator;
    private int denominator;
    Fraction(Fraction fraction){
        this.numerator=fraction.numerator;
        this.denominator=fraction.denominator;
    }
    Fraction(double fraction){
        int denominator=1;
        while((int)fraction!=fraction){
            fraction*=10;
            denominator*=10;
        }
        int gcd=gcd((int)fraction,denominator);
        this.numerator=(int)fraction/gcd;
        this.denominator=denominator/gcd;
    }
    public void sum(Fraction fraction){
        int temp=denominator*fraction.denominator;
        numerator=numerator*fraction.denominator+denominator*fraction.numerator;
        denominator=temp;
        int gcd=gcd(numerator,denominator);
        numerator/=gcd;
        denominator/=gcd;
    }
    public void mult(Fraction fraction){
        numerator*=fraction.numerator;
        denominator*=fraction.denominator;
        int gcd=gcd(numerator,denominator);
        numerator/=gcd;
        denominator/=gcd;
    }
    int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a%=b;
            }
            else{
                b%=a;
            }
        }
        return a+b;
    }
    public void GetFraction(){
        System.out.println(numerator+"/"+denominator);
    }
}
