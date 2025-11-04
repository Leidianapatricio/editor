

import java.io.File;
import java.util.logging.Logger;

public class LogOpenListener implements EventListener {

    private static final Logger logger = Logger.getLogger(LogOpenListener.class.getName());
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        logger.info("Save to log " + log + ": Someone has performed " 
            + eventType + " operation with the following file: " + file.getName());
    }
}

