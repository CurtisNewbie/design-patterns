public class AsyncHandleImpl implements HandleImpl {

    @Override
    public void init() {
        System.out.println("Init AsyncHandleImpl");
    }

    @Override
    public void prepare(Task task) {
        System.out.println("AsyncHandleImpl prepare task handling");
    }

    @Override
    public void handle(Task task) {
        System.out.println("AsyncHandleImpl handling task");
        task.commit();
    }

}
