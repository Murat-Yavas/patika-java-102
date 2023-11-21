public class MyList <T>{
    private int capacity;
    private T[] genericArray;


    public MyList(){
        setCapacity(10);
        setGenericArray(new Object[getCapacity()]);
    }

    public MyList(int capacity) {
        setCapacity(capacity);
        setGenericArray(new Object[getCapacity()]);
    }

    public int size(){
        int counter = 0;
        for (int i = 0; i<this.getCapacity(); i++) {
            if(getGenericArray()[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public void showCapacity() {
        System.out.println("Dizinin kapasites: " + this.getCapacity());
    }

    public void doubleCapacity(){
        this.setCapacity(this.getCapacity() * 2);
        this.setGenericArray(new Object[this.getCapacity()]);
    }

    public void add(T data){
        if(this.getCapacity() >= this.size()){
            this.getGenericArray()[size()] = data;
        }
        else {
            this.doubleCapacity();
        }
    }

    //Getter&setter
    public int getCapacity() {
        return this.capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] getGenericArray(){
        return this.genericArray;
    }

    private void setGenericArray(Object[] array){
        this.genericArray = (T[]) array;
    }
}
