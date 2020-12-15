public class Main {

    public static void main(String[] args) {
        Handler asyncAbstractHandler = AbstractHandlerFactory.getHandler(HandlerType.ASYNC);
        asyncAbstractHandler.handle(() -> {
            System.out.println("Async Task handled");
        });

        Handler syncAbstractHandler = AbstractHandlerFactory.getHandler(HandlerType.SYNC);
        syncAbstractHandler.handle(() -> {
            System.out.println("Sync Task handled");
        });
    }
}
