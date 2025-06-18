package Classes;

class HideObjectAbstraction {
    private int l; //private field to store length
    private int w; //private field to store width
    HideObjectAbstraction(int l, int w){
        this.l = l;
        this.w = w;
    }
    //Abstract method
    public  void  getArea(){
        int getArea = l * w;
        System.out.println("The Area is: " + getArea);
    }
}

public class EncapsulationAbstraction{
    public static void main(String[]args){
        HideObjectAbstraction area = new HideObjectAbstraction(100, 200);
        area.getArea();
    }
}
