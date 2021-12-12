/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author architnigam
 */
public class LookUpMapping {
    
    
    public String mapAlertLevel(int alertLevel)
    {
        String alertLevelValue = "";
        switch(alertLevel)
        {
            case 0:
                alertLevelValue = "Low";
                break;
            case 1: 
                alertLevelValue = "Moderate";
                break;
            case 2: 
                alertLevelValue = "Critical";
                break;
        }
        return alertLevelValue;
    }
    
    public String mapAlertStatus(int alertStatus)
    {
        String alertLevelValue = "";
        switch(alertStatus)
        {
            case 0:
                alertLevelValue = "Open";
                break;
            case 1: 
                alertLevelValue = "Closed";
                break;
        }
        return alertLevelValue;
    }
    
    public String mapClaimStatus(int claimStatus)
    {
        String claimStatusValue = "";
        switch(claimStatus)
        {
            case 0:
                claimStatusValue = "Created";
                break;
            case 1: 
                claimStatusValue = "Processing ";
                break;
             case 2: 
                claimStatusValue = "Approved ";
                break;
             case 3: 
                claimStatusValue = "Rejected ";
                break;
             case 4: 
                claimStatusValue = "Paid ";
                break;
             case 5: 
                claimStatusValue = "Voided ";
                break;
        }
        return claimStatusValue;
    }
    
    public String mapAppointmentStatus(int appointmentStatus)
    {
        String appointmentStatusValue = "";
        switch(appointmentStatus)
        {
            case 0:
                appointmentStatusValue = "Scheduled";
                break;
            case 1: 
                appointmentStatusValue = "Completed ";
                break;
             case 2: 
                appointmentStatusValue = "Canceled ";
                break;
        }
        return appointmentStatusValue;
    }
    
    public int mapSymptoms(String symptom)
    {
        int symptomValue = 0;
        switch(symptom)
        {
            case "Headache":
                symptomValue = 0;
                break;
             case "Body Pain":
                symptomValue = 1;
                break;
             case "Fever":
                symptomValue = 2;
                break;
            case "Cold":
                symptomValue = 3;
                break;
             case "Cough":
                symptomValue = 4;
                break;
             case "Abnormal Heart Rate":
                symptomValue = 5;
                break;
             case "Breathlessness":
                symptomValue = 6;
                break;
             case "Loss of taste":
                symptomValue = 7;
                break;
             case "Loss of smell":
                symptomValue = 8;
                break;
        }
        return symptomValue;
    }
    
    public String MapTransactionCodes(String transactionTypeCode)
    {
        String transactionTypeValue = "";
        switch(transactionTypeCode)
        {
            case "C":
                transactionTypeValue = "Claim Creation";
                break;
            case "A":
                transactionTypeValue = "Claim Adjudication";
                break;
            case "D":
                transactionTypeValue = "External Donation";
                break;
            case "P":
                transactionTypeValue = "Patient Registration";
                break; 
        }
        return transactionTypeValue;
    }
    
    public String MapCOVIDTestStatus(int covidTestStatus)
    {
        String covidTestStatusValue = "";
        switch(covidTestStatus)
        {
            case 0:
                covidTestStatusValue = "Scheduled";
                break;
            case 1:
                covidTestStatusValue = "Results awaiting";
                break;
            case 2:
                covidTestStatusValue = "COVID-19 Test Positive";
                break;
            case 3:
                covidTestStatusValue = "COVID-19 Test Negative";
                break; 
        }
        return covidTestStatusValue;
    }
}
