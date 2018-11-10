public interface BusinessMusicCertification
{
    //vars
    int EXAM_FEE = 1000;
    float DISCOUNT_FACTOR = 0.9f;
    float MEDICAL_COVER = 50;

    //methods: abstract
    void payExamFee();
    //methods: default
    default void displayExamFee(){}
    //methods: static
    static void setMedicalCover(float amount){
        //MEDICAL_COVER = amount;
    }

}//BusinessMusicCertification