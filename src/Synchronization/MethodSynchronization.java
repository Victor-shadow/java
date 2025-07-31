package Synchronization;
//Multiple threads execute the same method in a synchronized way
class Line{
    //synchronized method ensures that only one thread
    //can execute this method at a time on the same object
    synchronized public void getLine(){
        for (int i = 0; i < 20; i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class Train extends Thread{
    //Reference variable
    Line line;

    Train(Line line){
        this.line = line;
    }
    @Override
    public void run(){
        line.getLine();
    }
}
public class MethodSynchronization {
  public static void main(String[]args){
      //object of Line class shared among threads
      Line obj = new Line();
      //create threads that share the same obj
      Train t1 = new Train(obj);
      Train t2 = new Train(obj);

      t1.start();
      t2.start();
  }

}
//the getLine() method is declared as synchronized, which ensures that only one thread
//can execute it at a time  on the same line object
//When t1 is running, t2 must wait for it to finish before accessing the method