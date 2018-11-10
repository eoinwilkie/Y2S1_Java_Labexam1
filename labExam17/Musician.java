public abstract class Musician
{
    //vars
    int id;
    String name;
    float hourlyRate;
    float normalNumOfHours = 37.5f;
    static float medicalCover;

    public Musician(String name, float hourlyRate)
    {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }
    public Musician(int id, String name, float hourlyRate)
    {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
    }
    //set/get - add later
    public int getId(){ return id; }
    public String getName() { return name; }
    public float getHourlyRate(){ return hourlyRate; }
    public float getNormalNumOfHours() { return normalNumOfHours; }

    //methods: abstract
    abstract void calculateSalary();
    abstract void display();

    //methods: non-abstract
    public static void setMedicalCover(float amount){
        medicalCover = amount;
    }

    public boolean equals(Musician musician2)
    {
        if (this.id == musician2.id)
        {
            if(this.name.equals(musician2.name))
            {
                return true;
            }
        }
        return false;
    }

}