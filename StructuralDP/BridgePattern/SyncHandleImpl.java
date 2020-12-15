public class SyncHandleImpl implements HandleImpl {

    @Override
    public void init() {
        System.out.println("Init SyncHandleImpl");
    }

    @Override
    public void prepare(Task task) {
        System.out.println("SyncHandleImpl prepare task handling");
    }

    @Override
    public void handle(Task task) {
        System.out.println("SyncHandleImpl handling task");
        task.commit();
    }

}
