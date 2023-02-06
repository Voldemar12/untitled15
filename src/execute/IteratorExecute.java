package execute;

public class IteratorExecute {
    public static void main(String[] args) {

    }
    static void performIterationsWithCallback(int numberOfiterations, LoopCallback callback) {
        for (int i = 0; i < numberOfiterations; i++) {
            callback.onNewIteration(i);
        }
    }
    

    static void startiterations(int numberOfiterations) {

    }
}
