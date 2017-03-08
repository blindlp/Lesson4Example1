package lapj.example1.edu;

/**
 * Created by luispo on 3/7/17.
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    /**
     * the actual functional contract
     * @param txt
     */
    abstract void doSomething(String txt);
}
