package Interfaces;
interface ParentB {
    interface Test{
        void show();
    }
}


class ChildB implements ParentB.Test {
    public void show(){
        System.out.println("Show method of interface");
    }
}

class NestedInterface{
    public static void main(String[]args){
        ChildB object;
        ChildB o = new ChildB();
        object = o;
        object.show();
    }
}
//When an interface is put inside another interface, it is automatically public and static and if we try to make it private or protected
//the compiler will return errors