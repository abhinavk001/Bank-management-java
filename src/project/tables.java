/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author abhin
 */
public class tables {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try{
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("create table employees(username varchar(20), email varchar(200), password varchar(32), status int)");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                con.close();
                st.close();
            }
            catch(Exception e){
            }
        }
    }
}
