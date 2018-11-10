public class EventManager extends Musician
{
    //vars
    int numHolidays;
    float salary;

    //const
    public EventManager()
    {
        this(999, "invalid", 0f, 0);
    }
    public EventManager(int id, String name, float hourlyRate, int numHolidays)
    {
        super(id, name, hourlyRate);
        this.numHolidays = numHolidays;
        //calling calculateSalary in constructor
        calculateSalary();
    }
    
    //methods
    @Override
    void calculateSalary()
    {
        this.salary = super.getHourlyRate() * super.getNormalNumOfHours();
    }
    @Override
    void display()
    {
        System.out.print("ID: " + super.getId() + " Name: " + super.getName() + "  numHolidays: " + this.numHolidays);
        System.out.print(" Salary: " + this.salary + "\n");

        //how to know if she works 5 extra hours? 
    }

}
