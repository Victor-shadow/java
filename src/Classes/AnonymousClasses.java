package Classes;

interface Language{
    //Define variables and methods
    String x = "Java";
    void getLanguage();
}
//Class 1
//Helper class implementing methods of Age Interface
class myClass implements Language{
    //Overriding getAge() method
    @Override
    public void getLanguage(){
        System.out.println("String is: " + x);
    }
}

//Class 2
//Main Class
//Anonymous demonstration
class AnonymousClasses{
    //Main Method
    public static void main(String[]args){
       //Anonymous class implementing Language Interface
        Language object =  new Language() { //anonymous class starts here
            @Override
            public void getLanguage() {
                System.out.println("String is: " + x);
            }
        };
        object.getLanguage();


    }
}
