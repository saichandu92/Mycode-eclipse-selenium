package Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnection {
	
	public void conn() {
		
	      try
          {
              //Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
	    	  ClassLoader.getSystemClassLoader();
	    	  ClassLoader.getPlatformClassLoader();
	    	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	  

              String userName = "sa";
              String password = "jtindia@99";
              String url = "jdbc:microsoft:sqlserver://thefatone"+";databaseName=LIMSDNA_dev";
              Connection con = DriverManager.getConnection(url, userName, password);
              Statement s1 = con.createStatement();
              ResultSet rs = s1.executeQuery("SELECT  TOP 1 * FROM DNA.sampleassambly");
              String[] result = new String[20];
              if(rs!=null){
                  while (rs.next()){
                      for(int i = 0; i <result.length ;i++)
                      {
                          for(int j = 0; j <result.length;j++)
                          {
                              result[j]=rs.getString(i);
                          System.out.println(result[j]);
                      }
                      }
                  }
              }

              //String result = new result[20];

          } catch (Exception e)
          {
              e.printStackTrace();
          }
  }
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBconnection db = new DBconnection();
		db.conn();

	}

}
