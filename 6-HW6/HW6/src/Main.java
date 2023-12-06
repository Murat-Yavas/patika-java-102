public class Main {
    public static void main(String[] args) throws InterruptedException{
         ThreadClass tClass = new ThreadClass();


        for(int i=1; i<=4; i++){
            Thread t = new Thread(tClass);
            t.start();
            t.join();
        }

        System.out.println("ODDS: " + ThreadClass.odds.size());
        System.out.println("EVENS: " + ThreadClass.evens.size());
    }
}
