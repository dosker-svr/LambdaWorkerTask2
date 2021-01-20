package LambdaWorkerTask2;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i < 101; i++) {
            if (i == 33) {
                errorCallback.onError("Ошибочка, номер " + i + " не может быть выполнен!");
            } else callback.onDone("Задача номер " + i + " выполнена");
        }
    }
}
