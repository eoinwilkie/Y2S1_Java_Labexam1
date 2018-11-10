public final class MusicTeacher extends Musician implements BusinessMusicCertification
{
    //vars
    int numHolidays;
    float salary;

    //const
    public MusicTeacher(int id, String name, float hourlyRate, int numHolidays)
    {
        super(id, name, numHolidays);
        this.numHolidays = numHolidays;
        //calling calculateSalary in constructor
        calculateSalary();
    }

    //methods
    @Override
    public void calculateSalary()
    {
        this.salary = super.getHourlyRate() * super.getNormalNumOfHours();
    }
    @Override
    void display()
    {
        //call calculateSalary here
        //calculateSalary();
        System.out.println("ID: " + super.getId() + " Name: " + super.getName() + "  NumHolidays: " + this.numHolidays + " Salary: " + this.salary);
    }
    @Override
    public void payExamFee()
    {
        float examFee = (BusinessMusicCertification.DISCOUNT_FACTOR * BusinessMusicCertification.EXAM_FEE);

        System.out.println(super.getName() + ": exam fee of " + examFee);
    }
    @Override
    public void setMedicalCover(float amount)
    {
        //?What to do here
        //super.setMedicalCover(amount);
    }

}