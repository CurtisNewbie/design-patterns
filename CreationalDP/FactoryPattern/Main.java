public class Main {

    public static void main(String[] args) {
        PlanFactory.getPlan(PlanType.COMMERCIAL_PLAN).commit();
        PlanFactory.getPlan(PlanType.DEMOSTIC_PLAN).commit();
        PlanFactory.getPlan(PlanType.INSTITUTIONAL_PLAN).commit();
    }
}
