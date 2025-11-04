

import java.io.File;
import java.util.logging.Logger;

public class SmsNotificationListener implements EventListener {

    private static final Logger logger = Logger.getLogger(SmsNotificationListener.class.getName());
    private String phoneNumber;

    public SmsNotificationListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        logger.info("SMS to " + phoneNumber + ": Someone has performed " 
            + eventType + " operation with the following file: " + file.getName());
    }
}
