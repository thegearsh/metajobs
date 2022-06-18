/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jobs;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Lungh
 */
public class Jobs {
   private String jobTitle;
   private int jobId;
  private double salaryEst;
  private Date closingDate;
  private String industry;

    public Jobs(String jobTitle, int jobId, double salaryEst, Date closingDate, String industry) {
        this.jobTitle = jobTitle;
        this.jobId = jobId;
        this.salaryEst = salaryEst;
        this.closingDate = closingDate;
        this.industry = industry;
    }

    public Jobs() {
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return the jobId
     */
    public int getJobId() {
        return jobId;
    }

    /**
     * @param jobId the jobId to set
     */
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    /**
     * @return the salaryEst
     */
    public double getSalaryEst() {
        return salaryEst;
    }

    /**
     * @param salaryEst the salaryEst to set
     */
    public void setSalaryEst(double salaryEst) {
        this.salaryEst = salaryEst;
    }

    /**
     * @return the closingDate
     */
    public Date getClosingDate() {
        return closingDate;
    }

    /**
     * @param closingDate the closingDate to set
     */
    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    /**
     * @return the industry
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * @param industry the industry to set
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "Jobs{" + "jobTitle=" + jobTitle + ", jobId=" + jobId + ", salaryEst=" + salaryEst + ", closingDate=" + closingDate + ", industry=" + industry + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.jobId;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.salaryEst) ^ (Double.doubleToLongBits(this.salaryEst) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jobs other = (Jobs) obj;
        if (Double.doubleToLongBits(this.salaryEst) != Double.doubleToLongBits(other.salaryEst)) {
            return false;
        }
        if (!Objects.equals(this.jobTitle, other.jobTitle)) {
            return false;
        }
        return true;
    }
  
  
    
}
