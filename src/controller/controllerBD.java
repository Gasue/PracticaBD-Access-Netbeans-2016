
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import  model.connectBD;
/**
 *
 * @author Gasue
 */
public class controllerBD {
    private final connectBD con;
    
    public controllerBD(){
        this.con = new connectBD();
    }
    
public void CrearConexion() throws SQLException{
    this.con.EstablecerConexion();
}

public ResultSet mandarSQL(String sql) throws SQLException{
    ResultSet aux_result=this.con.EjecutarSentencia(sql);
    return aux_result;
}

}
