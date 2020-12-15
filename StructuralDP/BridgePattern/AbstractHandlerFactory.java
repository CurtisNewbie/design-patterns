public final class AbstractHandlerFactory {

    public static Handler getHandler(HandlerType handlerType) {
        if (handlerType.equals(HandlerType.ASYNC))
            return new AbstractHandler(new AsyncHandleImpl());
        else
            return new AbstractHandler(new SyncHandleImpl());
    }
}