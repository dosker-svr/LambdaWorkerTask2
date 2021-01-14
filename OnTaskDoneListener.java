package LambdaWorkerTask2;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
