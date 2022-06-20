package za.co.ideal.joblist.restapi.java.metajobs;
import java.util.ArrayList;
import javax.ws.rs.*;

public class Applicants {

  @GET
  @Path("/applicants")
  @Produces("application/json")
  public ArrayList<ApplicantsModel> GetApplicants(@QueryParam("position")String position) throws Exception {
    return DBLibrary.GetApplicants(position);
  }
  
  @POST
  @Path("/applicants/apply")
  @Produces("text/plain")
  public String Apply(
    @QueryParam("listing")int listing,
    @QueryParam("email")String email,
    @QueryParam("cvUrl")String cvUrl) throws Exception {
          if(listing == 0) {
            return "Please provide listing ID";
          }
          if(email == null || email.length() == 0) {
            return "Please provide email address";
          }
          DBLibrary.ApplyForListing(listing, email, cvUrl);
          return "Successfully applied";
  } 
  @GET
  @Path("applicants/GetCvBase64")
  @Produces("text/plain")
  public String GetCvBase64(@QueryParam("contact")String contact, @QueryParam("version")int version) throws Exception {
          return DBLibrary.GetFileBase64(contact, version);
  }
}
