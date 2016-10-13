import org.apache.log4j.Logger;

/**
 * Created by cloudwick on 10/13/16.
 */
public class Log4jExample {
    final static Logger logger = Logger.getLogger(Log4jExample.class);
    public static void main(String[] args) {

        Log4jExample example = new Log4jExample();
        example.run("Ashok");
        //logger.debug("Hello This is a Debug Message");
        //logger.info("Hello This is an Info Message");
    }

    private void run(String ashok) {
        if(logger.isDebugEnabled()){
            logger.debug("Hello " + ashok + ", This is a DEBUG Message");
        }
        if(logger.isInfoEnabled()){
            logger.info("Hello " + ashok + ", This is a INFO Message");
        }

        logger.warn(ashok + " this is a WARN message");
        logger.error(ashok + " this is a ERROR message");
        logger.fatal(ashok + " this is a FATAL message");

        for(int i = 0 ; i < 5 ; i++){
            logger.info("Message :: " + i);
        }
    }
}
