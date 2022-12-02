public class StepTracker {
    private int requirement;
    private int activeDays;
    private int days;
    private int steps;

    public StepTracker(int requirement)
    {
        this.requirement = requirement;
    }

    public void addDailySteps(int steps)
    {
        if (steps>= requirement)
        {
            activeDays++;
        }
        days++;
        this.steps+=steps;
    }

    public int activeDays()
    {
        return activeDays;
    }

    public double averageSteps()
    {
        return ((double)steps/days);
    }
}
