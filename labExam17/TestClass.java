public class TestClass
{
    public static void main(String[] args)
    {
        MusicTeacher mt = new MusicTeacher(003, "seanSmiths", 60.00f, 25);
        mt.display();
        mt.payExamFee();
        mt.setMedicalCover(BusinessMusicCertification.MEDICAL_COVER);
        EventManager em = new EventManager(004, "amyLupton", 50.00f, 0);
        em.display();
        BookingAgent ba = new BookingAgent("paulaKelly", 65.00f, 5000);
        ba.display();
        Musician ba2 = new BookingAgent("BobHorgan", 60f, 2000);
        ba2.display();
        MusicTeacher mt2 = new MusicTeacher(003, "seanSmiths", 60.00f, 25);
        EventManager em2 = new EventManager(04, "Eeeee", 65f, 0);
        em2.setMedicalCover(2000);
        System.out.println(mt2.medicalCover);
        System.out.println(mt2.MEDICAL_COVER);
        System.out.println(em2.medicalCover);
        System.out.println(Musician.medicalCover);

        System.out.println(em2.equals(mt2));
        mt2 = new MusicTeacher(04, "Eeeee", 65f, 0);
        System.out.println(em2.equals(mt2));


    }//main
}