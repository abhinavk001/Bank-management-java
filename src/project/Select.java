package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class Select {
    public static ResultSet getData(String Query){
        Connection con=null;
        ResultSet rs=null;
        Statement st=null;
        try{
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            rs=st.executeQuery(Query);
            return rs;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    } 
    
}
