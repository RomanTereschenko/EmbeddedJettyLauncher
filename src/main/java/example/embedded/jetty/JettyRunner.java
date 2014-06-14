/**
 * Created by home on 6/12/14.
 */
package example.embedded.jetty;


import org.eclipse.jetty.server.Server;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JettyRunner {

    public String concatenate(String one, String two){
        return one + two;
    }

    static final Logger logger = LogManager.getLogger(JettyRunner.class.getName());



    public static void main(String[] args) throws Exception {

        //log4j2 logging levels All, TRACE, DEBUG, INFO, WARN, ERROR, FATAL, OFF  !!

        logger.error("Error");
        logger.warn("Warn");
        logger.info("Info");
        logger.debug("Debug");
        logger.trace("Trace");

    /*    //read system property
        String war_file_path = System.getProperty("war_file","..");

        //setting a Jetty Server
        Server jettyServer = new Server(9090);

        // start server
        logger.info("Server is launching!");

        jettyServer.start();
        jettyServer.join();
     */

    }
}
