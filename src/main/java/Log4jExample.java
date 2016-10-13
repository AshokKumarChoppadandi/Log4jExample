import org.apache.log4j.Logger;

/**
 * Created by AshokKumarChoppadandi on 10/13/16.
 */
public class Log4jExample {
    final static Logger logger = Logger.getLogger(Log4jExample.class);

    /**
     * @param args - Command Line Arguments
     */
    public static void main(String[] args) {

        Log4jExample example = new Log4jExample();
        example.run("TEST");
    }

    /**
     * @param str - Method takes one argument of type String with the 'str'
     */
    private void run(String str) {
        if(logger.isDebugEnabled()){
            logger.debug("Hello " + str + ", This is a DEBUG Message");
        }
        if(logger.isInfoEnabled()){
            logger.info("Hello " + str + ", This is a INFO Message");
        }
        logger.warn(str + " this is a WARN message");
        logger.error(str + " this is a ERROR message");
        logger.fatal(str + " this is a FATAL message");
        for(int i = 0 ; i < 5 ; i++){
            logger.info("Message :: " + i);
        }
    }
}
