/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.Service;

import java.sql.Date;
import za.co.jobs.Jobs;

/**
 *
 * @author Lungh
 */
public interface JobService {
      public boolean addJobs(Jobs job);
   public Jobs getJobs(boolean isAvailable);
   public boolean updateJobCdate(Date closingDate);
   public boolean updateJobSalary(double salaryEst);
    
}
