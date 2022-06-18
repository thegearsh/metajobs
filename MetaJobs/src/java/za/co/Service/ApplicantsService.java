/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.Service;

import za.co.jobs.Applicant;

/**
 *
 * @author Lungh
 */
public interface ApplicantsService {
    public boolean addApplicant(Applicant applicant);
    public boolean updateAge(int age);
    public boolean updateSurname(String surname);
    public Applicant getApplicant( int jobId);
    
    
}
