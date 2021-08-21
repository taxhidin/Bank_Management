/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 * @author Taxhidin
 */

import java.sql.*;
import javax.swing.JOptionPane;

class javaconnect {

    Connection conn = null;

    public static Connection ConnecrDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("C:\\Users\\Taxhidin\\Downloads\\mysql-connector-java-8.0.26\\mysql-connector-java-8.0.26");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return null;


    }

}
