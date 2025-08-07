package WrapperClass;

class Maximum{
    private int max = 0;
    private int size = 0;
    
    public void insert(int x){
        this.size++;
        if (x < this.max)
            return;
        this.max =x;
    }
    public int top(){
        return this.max;
    }
    public int elementNumber(){
        return this.size;
    }
}
class CustomWrapperClass {
    public static void main(String[]args){
        Maximum maximum = new Maximum();
        maximum.insert(1);
        maximum.insert(2);
        maximum.insert(3);

        System.out.println("Maximum element: " + maximum.top());
        System.out.println("Number of elements inserted: " +maximum.elementNumber());

    }

}
