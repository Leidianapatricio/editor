
import java.io.File;
import java.util.logging.Logger;

public class EmailNotificationListener implements EventListener {

    private static final Logger logger = Logger.getLogger(EmailNotificationListener.class.getName());
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        logger.info("Email to " + email + ": Someone has performed " 
            + eventType + " operation with the following file: " + file.getName());
    }
}

