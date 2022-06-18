package za.co.idealsolutions.jobsapp;

import javax.enterprise.inject.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author thegearsh
 */
@Path("jobs")
public class Jobs {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getJob(){
        return "Software Developer!";
    }
    
}
