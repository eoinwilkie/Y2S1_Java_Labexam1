public final class PersonalTrainer extends Coach implements FetacSportsCertification
{
    private int numHolidays;

    //constructor
    public PersonalTrainer(int id, String name, float hourlyRate, int numHolidays)
    {
        super(id, name, hourlyRate);
        setNumHoliday(numHolidays);
    }

    //set/get
    public int getNumHolidays(){ return numHolidays; }
    public void setNumHoliday(int numHolidays)
    {
        this.numHolidays = numHolidays;
    }

    //abstract methods
    @Override
    public float calculateSalary()
    {
        return this.getHourlyRate() * this.getNormalNumOfHours();
    }
    @Override
    public void display()
    {
        System.out.println("ID: " + this.getId() + " Name: " + this.getName() + " NumHolidays: " + this.getNumHolidays() + " Salary: " + this.calculateSalary());
    }

    public void payExamFee()
    {
        float examFee = getHourlyRate() * .05f;
        System.out.println(this.getName() + " pays exam fee of: " + examFee);
    }
}
