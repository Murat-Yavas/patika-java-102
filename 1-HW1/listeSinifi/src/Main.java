public class Main {
    public static void main(String[] args) {
        MyList<Integer> m1 = new MyList<>(2);
        m1.add(5);
        m1.add(15);
        m1.add(1);

        System.out.println("dizideki eleman sayısı: " + m1.size());
        m1.showCapacity();
    }
}
