public class AbstractHandler implements Handler {

    private HandleImpl handlerImpl;

    public AbstractHandler(HandleImpl implementer) {
        this.handlerImpl = implementer;
        this.handlerImpl.init();
    }

    @Override
    public void handle(Task task) {
        handlerImpl.prepare(task);
        handlerImpl.handle(task);
    }
}
