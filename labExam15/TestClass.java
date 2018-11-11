public class TestClass
{
    public static void main(String[] args)
    {
        PersonalTrainer pt = new PersonalTrainer(003, "JohnKelly", 60f, 25);
        pt.display();
        pt.payExamFee();
        SwimmingCoach sc = new SwimmingCoach("sandraSmith", 75f, 1000);
        sc.display();
        SpinningInstructor si = new SpinningInstructor(005, "isobelDeHaan", 50f, 5);
        si.display();

        //polymorphism
        Coach coach1 = new SwimmingCoach("CarlFlaherty", 80f, 1000);
        coach1.display();

        //medicalCover
        si.setMedicalCover(2000);
        System.out.println(si.getMedicalCover());
        System.out.println(pt.getMedicalCover());
        System.out.println(sc.getMedicalCover());
        
        SpinningInstructor si2 = new SpinningInstructor(005, "isobelDeHaan", 50f, 5);
        System.out.println(si.equals(si2));
        si2.setName("NewName");
        System.out.println(si.equals(si2));

    }//main
}