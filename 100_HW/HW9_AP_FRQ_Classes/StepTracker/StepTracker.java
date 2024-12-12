public class StepTracker {
    int numSteps;
    int totalSteps;
    int days;
    int activeDays;
    
    public StepTracker(int numSteps) {
        this.numSteps = numSteps;
    }
    
    public int activeDays() {
        //return number of days with 10,000+ steps
        return activeDays;
    }
    
    public double averageSteps() {
        //averages number of steps per day
        //each addDailySteps is one day
        return (double) (totalSteps / days);
    }
    
    public void addDailySteps(int steps) {
        numSteps = steps;
        totalSteps += numSteps;
        days++;
        if (steps >= numSteps) {
            activeDays++;
        }
    }
}