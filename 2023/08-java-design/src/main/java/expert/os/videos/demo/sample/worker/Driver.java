package expert.os.videos.demo.sample.worker;

public interface Driver extends Worker {
    /**
     * It works only with a Driver
     * @return
     * @throws UnsupportedOperationException if you are not a driver
     */
    DriverLicense license();
}
