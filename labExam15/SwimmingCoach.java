public class SwimmingCoach extends Coach
{
    private float bonus;

    public SwimmingCoach(String name, float hourlyRate, float bonus)
    {
        super(name, hourlyRate);
        setBonus(bonus);
    }

    public float getBonus(){ return bonus; }
    public void setBonus(float bonus)
    {
        this.bonus = bonus;
    }

    public float calculateSalary()
    {
        return ( (this.getHourlyRate() * this.getNormalNumOfHours() ) + ((this.getHourlyRate() * 1.5f) * 10f ) );

    }
    public void display()
    {
        System.out.println("Name: " + this.getName() + " Salary: " + this.calculateSalary());
    }
}

