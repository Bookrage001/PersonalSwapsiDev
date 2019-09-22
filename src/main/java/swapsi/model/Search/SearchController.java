/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapsi.model.Search;

/**
 *
 * @author Hayley
 */
public class SearchController {
    
    /**
     * Finds searched post
     * @return 
     */

    public Iterator searchViewPost() {
        Document query = new Document();
        Iterator it = connection.view(query).iterator();
        return it;
    }

}
