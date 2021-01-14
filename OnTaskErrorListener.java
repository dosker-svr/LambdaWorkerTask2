package LambdaWorkerTask2;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}
