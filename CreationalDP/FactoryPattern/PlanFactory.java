public final class PlanFactory {

    public static Plan getPlan(PlanType type) {
        if (type.equals(PlanType.COMMERCIAL_PLAN))
            return new CommercialPlan();
        else if (type.equals(PlanType.INSTITUTIONAL_PLAN))
            return new InstitutionalPlan();
        else if (type.equals(PlanType.DEMOSTIC_PLAN))
            return new DemosticPlan();
        else
            throw new UnsupportedOperationException(String.format("Plan: %s not supported", type.name()));
    }
}