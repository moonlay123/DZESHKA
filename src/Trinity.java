import java.util.Comparator;

public class Trinity<T extends Comparable>{
    private T first;
    private T second;
    private T third;
    public Trinity(T first,T second, T third){
        this.first=first;
        this.second=second;
        this.third=third;
        sort();
    }
    public void sort(){
        T temp;
        if(first.compareTo(second)<0){
            temp = second;
            second=first;
            first=temp;
        }
        if(first.compareTo(third)<0){
            temp = third;
            third=first;
            first=temp;
        }
        if(second.compareTo(third)<0){
            temp=third;
            third=second;
            second=temp;
        }
    }
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public void setFirst(T first) {
        this.first = first;
        sort();
    }

    public void setSecond(T second) {
        this.second = second;
        sort();
    }

    public void setThird(T third) {
        this.third = third;
        sort();
    }

    @Override
    public String toString() {
        return "This Trinity is: "+first+", "+second+", "+third ;
    }
}
