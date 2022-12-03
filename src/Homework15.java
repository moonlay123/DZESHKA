import java.util.ArrayList;

public class Homework15 {
    public static void main(String[] args) {
        Trinity<String> StringTrinity = new Trinity<>("abc","abd","aaa");
        Trinity<Integer> IntegerTrinity = new Trinity<>(15,11,23);
        Trinity<Double> DoubleTrinity = new Trinity<>(151.346,12.523,531.312);
        System.out.println(StringTrinity);
        System.out.println(IntegerTrinity);
        System.out.println(DoubleTrinity);
    }
}
