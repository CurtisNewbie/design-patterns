/** A thread safe singleton implementation */
public enum Singleton {

    INSTANCE("I ame a singleton", "yongjie");

    private String slogan;
    private String createdBy;

    Singleton(String slogan, String createdBy) {
        this.slogan = slogan;
        this.createdBy = createdBy;
    }

    public String getSlogan() {
        return slogan;
    }

    public String getCreatedBy() {
        return createdBy;
    }

}
