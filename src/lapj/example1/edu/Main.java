package lapj.example1.edu;

public class Main {

    /**
     * Java old days demostration
     */
    public void doItInTheOldWay() {
        MyFunctionalInterface objImplementation = new MyFunctionalInterface() {
            @Override
            public void doSomething(String txt) {
                System.out.println(txt);
            }
        };
        objImplementation.doSomething("Hello in the old way");
    }

    /**Java 8 demostration
     *
     */
    public void doItWithLambdas() {
        // Nehaviour(implementation) definition
        MyFunctionalInterface objImplementation = (String x) -> System.out.println(x);
        objImplementation.doSomething("Hello from lambda fashion");
        // short syntax
        MyFunctionalInterface objImplementationTwo = x -> System.out.println(x);
        objImplementationTwo.doSomething("Hello from short syntax");
        // complex syntax
        MyFunctionalInterface objInterfaceThree = x -> {
          System.out.println("Hello from complex syntax");
          System.out.println(x);
          System.out.println("By from complex syntax");
        };
        objInterfaceThree.doSomething("Regular code in complex syntaxr");

        // reusing the third behavior
        doSomethingHighOrder(objImplementationTwo);
    }

    public void doSomethingHighOrder(MyFunctionalInterface behaviour) {
        behaviour.doSomething("in high order way");
    }



    public static void main(String[] args) {
	// write your code here
        Main mainInstance = new Main();
        // Calling the old implementation
        mainInstance.doItInTheOldWay();
        mainInstance.doItWithLambdas();
    }
}
