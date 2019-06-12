/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author Puru
 */
import java.sql.* ;
public class db extends login{
  Connection con ;
  Statement stmt;  
    public db(){      //x
    try  // 
    {
    Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost/bank";
         con = DriverManager.getConnection(url, "root", "root") ;
        stmt = con.createStatement();
    }
     catch(Exception e){
     System.out.println(e);
}
}
   // String qry = "select * from admin where aname = 'puru' and apass = 'puru';" ;
    
    /*public static void main(String args[])throws Exception{
        db obj = new db();
       // obj.set();
        obj.view("select * from admin where aname = 'puru' and apass = 'puru' ;");
    }*/
    
    public ResultSet view(String qry)throws Exception{
      //db obj = new db();
        ResultSet rs  = stmt.executeQuery(qry) ; 
      //System.out.println(qry);
         return  rs;  
    }
    public void execute(String qry)throws Exception{
    stmt.executeUpdate(qry) ;
    }
    
   }
    

