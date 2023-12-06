import java.util.ArrayList;
import java.util.List;


public class ThreadClass implements Runnable{
    public List<Integer> dividedList1;
    public List<Integer> dividedList2;
    public List<Integer> dividedList3;
    public List<Integer> dividedList4;

    public static ArrayList<Integer> evens = new ArrayList<>();
    public static ArrayList<Integer> odds = new ArrayList<>();

    List<Integer> nums = new ArrayList<>();
    int size = 2500;
    int counter = 0;


    @Override
    public void run() {
        for(int i = 0; i<10000; i++){
            nums.add(i);
        }

        for (int start=0; start<nums.size(); start += size){
            int end = Math.min(start+size, nums.size());
            counter++;
            if(counter == 1){
                dividedList1 =  nums.subList(start,end);
                for(int i =0; i<2500; i++){
                    add(dividedList1.get(i));
                }
            }
            else if(counter == 2){
                dividedList2 =  nums.subList(start,end);
                for(int i =0; i<2500; i++){
                    add(dividedList2.get(i));
                }
            }
            else if(counter == 3){
                dividedList3 =  nums.subList(start,end);
                for(int i =0; i<2500; i++){
                    add(dividedList3.get(i));
                }
            }
            else if(counter == 4){
                dividedList4 =  nums.subList(start,end);
                for(int i =0; i<2500; i++){
                    add(dividedList4.get(i));
                }
            }

        }
    }

       synchronized void add(int number){
            if(number%2 == 0){
                evens.add(number);
            }
            else {
                odds.add(number);
            }
        }

}
