package Variables;

public class ParameterScope {
    public void output(String parameterOne, float parameterTwo){
        System.out.println("Use of parameter One: " + parameterOne);
        System.out.println("Use of parameter Two: " + parameterTwo);
    }
    public static void main(String[] args){
        ParameterScope objectReference = new ParameterScope();
        objectReference.output("An Array of Characters in a Parameter Scope", 10f);

        //System.out.println(parameterOne) //// Causes an error, parameter is out of scope
    }
}
