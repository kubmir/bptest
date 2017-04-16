package cz.muni.fi.DebugDbAnalyzerApp.Utils;

import cz.muni.fi.DebugDbAnalyzerApp.ApplicationUtils.TextAreaLoggerHandler;

/**
 * Interface for working with path to database and size of database.
 * @author Miroslav Kubus
 */
public interface FileWorker {

    /**
     * Method which return number of logs around errors and criticals
     * group. If database is bigger then less logs are writen to XML.
     * @param path represents path to database
     * @return number of logs around errors and criticals
     */
    public int getNumberOfLogsAroundErrors(String path);
    
    /**
     * This method change file path to url path - WINDOWS: replace \ with /
     * @param stringToModify represents path to .db file
     * @return string where all \ are replaced with /
     */
    public String modifySlashes(String stringToModify);
    
    /**
     * Method which calculate database folder.
     * @param pathToDB represents absolute path to database file
     * @return absolute path to folder in which database is stored
     */
    public String getDatabaseFolder(String pathToDB);
    
    public void ExportResource(String resourceName) throws ServiceFailureException; 
    
    public String createDataDirectory() throws ServiceFailureException;
}
