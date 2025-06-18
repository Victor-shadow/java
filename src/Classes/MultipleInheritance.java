package Classes;
//Interface 1
interface Coder{
    void writeCode();
}
interface Tester{
    void testCode();
}
//Class Implements both interfaces
class DevopsEngineer implements Coder, Tester{
    @Override
    public void writeCode(){
        System.out.println("Devops Engineers write automation scripts:");
    }
    @Override
    public void testCode(){
        System.out.println("Devops engineers test deployment pipelines");
    }
    //Additional methods
    public void deploy(){
        System.out.println("DevOps engineers deploy written code to the cloud.");
    }
}
public class MultipleInheritance {
    public static void main(String[]args){
        DevopsEngineer devOps = new DevopsEngineer();
        devOps.writeCode();
        devOps.deploy();
        devOps.testCode();
    }

}
