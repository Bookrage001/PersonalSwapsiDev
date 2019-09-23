
package swapsi.model.Showcase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mongodb.BasicDBObject;
import org.bson.Document;
import swapsi.model.dao.mLabMongoDbConnector;

//import javax.print.Doc;

public class ShowcaseController {

    private List<Document> sc = new ArrayList<Document>();
    private String showcase = "Showcase";
    private mLabMongoDbConnector connection;
    private String user;

    /**
     * Initiates the DB connection.
     */
    public ShowcaseController() {
        connection = new mLabMongoDbConnector(this.showcase);
    } 
    
    public ShowcaseController( String user) {
        connection = new mLabMongoDbConnector(this.showcase);
        this.user = user;
    }
    
    
}
