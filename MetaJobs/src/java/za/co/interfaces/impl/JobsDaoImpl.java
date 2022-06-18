/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.interfaces.impl;

import java.sql.Date;
import za.co.interfaces.JobsDao;
import za.co.jobs.Jobs;

/**
 *
 * @author Lungh
 */
public class JobsDaoImpl  implements JobsDao{

    @Override
    public boolean addJobs(Jobs job) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Jobs getJobs(boolean isAvailable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateJobCdate(Date closingDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateJobSalary(double salaryEst) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
