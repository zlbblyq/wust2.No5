package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Admin;
import beans.User;


public class UserDao {
	  public static final String DRIVER="org.gjt.mm.mysql.Driver";
	    public static final String DBURL="jdbc:mysql://localhost:3306/user";
	    public static final String DBUSER="root";
	    public static final String DBPASS="";	
	    private Connection conn=null;
	    private PreparedStatement pStat=null;
	    private ResultSet rs=null;  	
	    public Connection getConnectionn(){
	        try{
		       Class.forName(DRIVER).newInstance(); 
	    	   return DriverManager.getConnection(DBURL,DBUSER,DBPASS);
	           }catch(Exception e){
		       return null;
	        }
	    }
	    //end Connection
	    public void close(){
	         try{
	 	      if( rs!=null )
	 	    	  rs.close();
	 	      if( pStat!=null ) 
	 	    	  pStat.close();
	 	      if( conn!=null ) 
	 	    	  conn.close();
	         }catch(Exception e){	e.printStackTrace();        }
	      }  //end close

	     public boolean findname(User user) {
	         conn=getConnectionn();
	         try {
	 	       pStat =conn.prepareStatement("select * from users where username=?");  
	 	       pStat.setString(1, user.getUsername());
	 	       rs=pStat.executeQuery();
	 	       if( rs.next() )  
	 	    	   return true;
	 	      else    
	 	    	  return false;
	             }catch (Exception e) {    return false;      }
	             finally{    close();      }			
	      } //end check
	     
	     public boolean add(User user) {   
	         conn=getConnectionn();
	         try {	       	 
	 	            pStat=conn.prepareStatement("insert into users values(null,?,?)");  	
	            	pStat.setString(1, user.getUsername());
	 	            pStat.setString(2, user.getPassword());
	 	            int cnt=pStat.executeUpdate();
	 	            if(cnt>0)	     return true;
	             	else     return false;
	 	            }
	 	            catch (Exception e) {     return false;	}
	 	            finally{
	                      close();
	 	            }			
	      }  //end add
	     
	     
	     public boolean check(User user) {
	         conn=getConnectionn();
	         try {
	 	       pStat =conn.prepareStatement("select * from users where username=? and password=?");  
	 	       pStat.setString(1, user.getUsername());
	 	       pStat.setString(2, user.getPassword());
	 	       rs=pStat.executeQuery();
	 	       if( rs.next() )  
	 	    	   return true;
	 	      else    
	 	    	  return false;
	             }catch (Exception e) {    return false;      }
	             finally{    close();      }			
	      } //end check
	     
	     public boolean checkname(User user) {
	         conn=getConnectionn();
	         
	         try {
	           pStat =conn.prepareStatement("select * from users where username=? ");  
	 	       pStat.setString(1, user.getUsername()); 	    
	 	       rs=pStat.executeQuery();
	 	       if( rs.next() )  
	 	    	   return true;
	 	       else    
	 	    	  return false;
	             }catch (Exception e) {    return false;      }
	             finally{    close();      }			
	      } //end check
	     
	     public boolean admin(Admin admin) {
	         conn=getConnectionn();
	         try {
	 	       pStat =conn.prepareStatement("select * from admin where adminname=? and pwd=?");  
	 	       pStat.setString(1, admin.getAdminname());
	 	       pStat.setString(2, admin.getPwd());
	 	       rs=pStat.executeQuery();
	 	       if( rs.next() )  
	 	    	   return true;
	 	      else    
	 	    	  return false;
	             }catch (Exception e) {    return false;      }
	             finally{    close();      }			
	      } //end admin
	     
	     
	     
	     
		     	   
}
