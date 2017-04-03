package Core;

/**
 * Classes implementing interface Reportable can interact with the report
 * generating classes by exporting data in various formats. The primary export
 * and import format is XML for the Core classes
 * @author odin
 */


public interface Reportable {

    /**
     *
     * @return
     */
    public String exportAsCSV();

    /**
     *
     * @return
     */
    public String exportAsXML();
    
}
