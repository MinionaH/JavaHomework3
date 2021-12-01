import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        try{
            RandomCollection.randomCollection();
            System.out.println("\n\n\n Collection names =>");
            CollectionNames.Letsgo();
            logger.trace("Success");
        }catch (Exception ex){
            logger.trace("Error",ex);
        }
    }
}