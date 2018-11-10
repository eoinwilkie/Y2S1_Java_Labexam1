public class BookingAgent extends Musician
{
    //vars
    float bonus, salary;

    //const
    public BookingAgent(String name, float hourlyRate, float bonus)
    {
        super(name, hourlyRate);
        this.setBonus(bonus);
        this.calculateSalary();
    }

    //methods
    public void setBonus(float bonus)
    {
        this.bonus = bonus;
    }
    public float getBonus()
    {
        return bonus;
    }

    public void calculateSalary()
    {
        //where else do I get this information?
        int overtime = 12;
        
        this.salary = super.getHourlyRate() * super.getNormalNumOfHours();
        this.salary += ( ( super.getHourlyRate() * 1.5 ) * overtime );
    }
    public void display()
    {
        System.out.println("Name: " + super.getName() + " salary:" + this.salary + " bonus: " + this.bonus);
    }
    
}