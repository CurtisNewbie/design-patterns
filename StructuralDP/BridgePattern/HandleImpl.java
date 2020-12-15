/** Implementer can vary independently from the AbstractHandler */
public interface HandleImpl {

    void init();

    void prepare(Task task);

    void handle(Task task);
}
