package za.co.ideal.joblist.restapi.java.metajobs;

import java.util.ArrayList;

public class ApplicantsModel {
      private String appEmail;
      private String cvLink;
      private Boolean gotDocs;
      private ArrayList<Integer> fileVersions;
  
      public String getAppEmail(){
        return appEmail;
      }
  
      public void setAppEmail(String appEmail){
        this.appEmail = appEmail;
      }
      public String getCVLink(){
        return cvLink;
      }
      public void setCVLink(String cvLink){
        this.cvLink = cvLink;
      }
      public Boolean getGotDocs(){
        return gotDocs;
      }
      public void setGotDocs(Boolean gotDocs){
         this.gotDocs = gotDocs;
      }
      public  ArrayList<Integer> getFileVersions(){
        return fileVersions;
      }
      public void setFileVersions(ArrayList<Integer> fileVersions){
        this.fileVersions = fileVersions;
      }
}
