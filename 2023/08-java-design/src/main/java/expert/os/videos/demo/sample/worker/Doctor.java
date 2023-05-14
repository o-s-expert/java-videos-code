package expert.os.videos.demo.sample.worker;

public interface Doctor extends Worker{

    /**
     * it works only with a Doctor
     * @param person
     * @throws UnsupportedOperationException if you are not a doctor
     */
    void care(Person person);
}
