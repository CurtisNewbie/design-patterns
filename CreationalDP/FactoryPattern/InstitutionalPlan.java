public class InstitutionalPlan implements Plan {

    @Override
    public void commit() {
        System.out.println("Following " + this.getClass().getName());
    }

}
