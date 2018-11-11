public class SpinningInstructor extends Coach
{
    private int numHolidays;

    //const
    public SpinningInstructor()
    {
        this(0, "Invalid", 0f, 0);
    }
    public SpinningInstructor(int id, String name, float hourlyRate, int numHolidays)
    {
        super(id, name, hourlyRate);
        setNumHoliday(numHolidays);
    }
    //set/get
    public  int getNumHolidays(){ return numHolidays; }
    public void setNumHoliday(int numHolidays)
    {
        this.numHolidays = numHolidays;
    }

    public float calculateSalary()
    {
        return this.getHourlyRate() * this.getNormalNumOfHours();
    }
    public void display()
    {
        System.out.print("ID: " + this.getId() + " Name: " + this.getName() + " NumHolidays: " + this.getNumHolidays() );
        //not sure hot to get > normal working hours, no mention of work hours
        System.out.print(" Salary: " + this.calculateSalary() + "\n");
    }
}

