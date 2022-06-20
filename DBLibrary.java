package za.co.ideal.joblist.restapi.java.metajobs;
import java.sql.*;
import java.util.ArrayList;
import java.util.Base64;

public class DBLibary {

      private static String url ="jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=Jobs";
      private static String user = "";
      private static String password = "";
  
      public static void main(String[] grsh){
     
      }
      public static String[] GetPositions() throws Exception {
            try{
                var list = new ArrayList<String>();
                Connection con = DriverManager.getConnection(url, user, password);
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery("SELECT [Position] FROM [Jobs].[dbo].[v_Positions]");
              
                while(result.next()){
                    list.add(result.getString("Position"));
                }
                statement.close();
                conn.close();
                return (String[]) list.toArray();
            } catch (Exception ex){
                throw ex;
            }
      }
  
  public static ArrayList<JobListingModel> GetActiveListings(String position) throws Exception {
        try{
              String filter = "";
              if(position != null && position.length() > 0){
                  filter = " And Lower(p.Position) = '" + position.toLowerCase() + "'";
              }
              ArrayList<JobListingModel> list = new ArrayList<JobListingModel>();
              Connection conn = DriverManager.getConnection(url, user, password);
              Statement statement = conn.createStatement();
              ResultSet result = statement.executeQuery("SELECT " 
                                                        +"                      p.[Position] As Position "
                                                        +"                      ,joblist.[ID] "
                                                        +"                      ,[Title]  "
                                                        +"                      ,[JobDesc] "
                                                        +"                      ,[ListingDate]  "
                                                        +"                      FROM [Jobs].[dbo].[JobListings](NoLock) joblist  "
                                                        +"                      Inner Join [Jobs].[dbo].[Positions](NoLock) p on p.ID = joblist.Position  "
                                                        +"                      Where Active = 1 " + filter
                                                        +"                      Order By Position, ListingDate Desc");
          while(result.next()){
              JobListingModel model = new JobListingModel();
              model.setListing(result.getInt(""));
              model.setPosition(result.getString(""));
              model.setTitle(result.getString(""));
              model.setListingDate(result.getDate(""));
              list.add(model);
          }
          statement.close();
          conn.close();
          return list;
        } catch(SQLExceptiom ex){
            throw ex;
        }
  
  }
  
  public static String HasAccess(String token) throw Exception {
        try {
              String access = "User does not exist";
              Connection conn = DriverManager.getConnection(url, user, password);
              PreparedStatement statement = conn.prepareStatement("[Jobs].[dbo].[p_Access]");
              statement.setString(1, token);
              ResultSet result = statement.executeQuery();
              if(result.next()){
                  access = result.getString("Result");
              }
          statement.close();
          conn.close();
          return access;
        } catch(SQLException ex){
            throw ex;
        }
  }
  public static int AddJobListing(String position, String title, String jobDesc) throws Exception {
      try{
          Connection conn = DriverManager.getConnection(url, user, password);
          PreparedStatement statement = conn.prepareStatement("[Jobs].[dbo].[p_AddNewListing]");
          statement.setString(1, position);
          statement.setString(2, title);
          statement.setString(3, jobDesc);
          ResultSet result = statement.executeQuery();
          int postId = 0;
          if(result.next()) {
              postId = result.getInt("PostId");
          }
          statement.close();
          conn.close();
        return postId;
      } catch(SQLException ex){
          throw ex;
      }
  }
  
  public static ArrayList<ApplicantsModel> GetApplicants(String position) throws Exception {
  
  }
  public static Boolean ApplyForListing(int listing, String email, String cvUrl) throws Exception {
  
  }
  public static String GetFileBase64(String contact, int version) throws Exception{
  
  }
}
