public abstract class Coach
{
    //vars
    private int id;
    private String name;
    private float hourlyRate;
    private float normalNumOfHours = 37.5f;
    static float medicalCover;

    //constructor
    public Coach(){ }
    public Coach(String name, float hourlyRate)
    {
        setName(name);
        setHourlyRate(hourlyRate);
    }
    public Coach(int id, String name, float hourlyRate)
    {
        setId(id);
        setName(name);
        setHourlyRate(hourlyRate);
    }

    //set/get
    public  int getId(){ return id; }
    public void setId(int id){
        this.id = id; 
    }
    public String getName(){ return name; }
    public void setName(String name){
        this.name = name;
    }
    public float getHourlyRate(){ return hourlyRate; }
    public void setHourlyRate(float hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public float getNormalNumOfHours(){ return normalNumOfHours; }
    public void setNormalNumOfHours(float normalNumOfHours){
        this.normalNumOfHours = normalNumOfHours;
    }


    //methods: abstract
    abstract float calculateSalary();
    abstract void display();
    //methods: static
    public static void setMedicalCover(float amount)
    {
        medicalCover = amount;
    }
    public static float getMedicalCover()
    {
        return medicalCover;
    }
    public boolean equals(Coach compare)
    {
        if (this.id == compare.id)
        {
            if(this.name.equals(compare.name))
            {
                return true;
            }
        }
        return false;
    }
    
}