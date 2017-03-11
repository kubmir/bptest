package cz.muni.fi.bakalarka1.Demo;

import cz.muni.fi.bakalarka1.Database.SqlDb;
import cz.muni.fi.bakalarka1.Utils.ServiceFailureException;
import cz.muni.fi.bakalarka1.Utils.Visualizer;
import java.sql.SQLException;

/**
 * Class which serve for demonstration of functions.
 * @author Miroslav Kubus
 */
public class Main {

    public static void main(String[] args) throws ServiceFailureException, SQLException {
        String pathToDB = "C:\\Users\\Miroslav Kubus\\Desktop\\Nepodporovany port v emailovem klientu\\Debug.db";
        //String pathToDB = "C:\\Users\\Miroslav Kubus\\Desktop\\Debug.db";
        SqlDb test = new SqlDb(pathToDB);
        test.testAccessDB();
        Visualizer vis = new Visualizer();
        vis.toWeb();
        System.out.println("Done!");
    }
    
    public static void main1(String[] args) throws ServiceFailureException, SQLException {
        Visualizer vis = new Visualizer();
        vis.toWeb();
    }    
}
