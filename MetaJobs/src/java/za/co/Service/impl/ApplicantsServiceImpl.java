/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.Service.impl;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import za.co.Service.ApplicantsService;
import za.co.jobs.Applicant;

/**
 *
 * @author Lungh
 */
public class ApplicantsServiceImpl implements ApplicantsService {
     BasicDataSource dbm= new  BasicDataSource();

    @Override
    public boolean addApplicant(Applicant applicant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateAge(int age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateSurname(String surname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Applicant getApplicant(int jobId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}