package bai4;

public class test {
    public static void main(String[] args) {
        MyList<Integer> test = new MyList<Integer>();
        test.add(5);
        test.add(9);
        test.add(2,5);
        test.print();
        test.remove(3);
        test.print();
        test.indexOf(5);
    }
}
