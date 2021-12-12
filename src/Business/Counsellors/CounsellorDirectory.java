/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Counsellors;

import Business.Hospice.Hospice;
import Business.Patients.Patient;
import Business.Providers.Provider;
import Business.SetIDsForEnterprises;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class CounsellorDirectory {
    private ArrayList<Counsellor> listOfCounsellors;
    private ArrayList<Patient> patientsAssignedToCounsellor;
    
    public CounsellorDirectory()
    {
        listOfCounsellors = new ArrayList<Counsellor>();
        patientsAssignedToCounsellor = new ArrayList<Patient>();
    }

    public ArrayList<Counsellor> getListOfCounsellors() {
        return listOfCounsellors;
    }

    public void setListOfCounsellors(ArrayList<Counsellor> listOfCounsellors) {
        this.listOfCounsellors = listOfCounsellors;
    }
    
    public Counsellor createNewCounsellor(String counsellorID, String counsellorName, String counsellorAddress, 
            String counsellorCity, String counsellorState, String counsellorCountry, String counsellorZipCode, 
            String counsellorContactNo, String counsellorEmailID, Hospice operatingHospice)
    {
        Counsellor newCounsellor = new Counsellor();
        newCounsellor.setCounsellorID(counsellorID);
        newCounsellor.setCounsellorName(counsellorName);
        newCounsellor.setCounsellorAddress(counsellorAddress);
        newCounsellor.setCounsellorCity(counsellorCity);
        newCounsellor.setCounsellorState(counsellorState);
        newCounsellor.setCounsellorZipCode(counsellorZipCode);
        newCounsellor.setCounsellorEmailID(counsellorEmailID);
        newCounsellor.setCounsellorContactNo(counsellorContactNo);
        newCounsellor.setPatientsAssignedToCounsellor(patientsAssignedToCounsellor);
        newCounsellor.setOperatingHospice(operatingHospice);
        listOfCounsellors.add(newCounsellor);
        return newCounsellor;
    }
    
    public Counsellor updateCounsellor(Counsellor selectedCounsellor)
    {
        listOfCounsellors.set(listOfCounsellors.indexOf(selectedCounsellor), selectedCounsellor);
        return selectedCounsellor;
    }
    
    public void deleteCounsellor(int indexOfSelectedRecord)
    {
        listOfCounsellors.remove(indexOfSelectedRecord);
    }
    
    public Counsellor findCounsellorByID(String counsellorID, ArrayList<Counsellor> listOfCounsellorSystem)
    {
        for(Counsellor counsellor: listOfCounsellorSystem)
        {
            if(counsellor.getCounsellorID().equals(counsellorID))
            {
                return counsellor;
            }
        }
        return null;
    }
    
    public Counsellor findCounsellorByEmailID(String counsellorEmailID, ArrayList<Counsellor> listOfCounsellorSystem)
    {
        for(Counsellor counsellor: listOfCounsellorSystem)
        {
            System.out.println(counsellorEmailID);
            System.out.println(counsellor.getCounsellorEmailID());
            if(counsellor.getCounsellorEmailID().equals(counsellorEmailID))
            {
                return counsellor;
            }
        }
        return null;
    }
    
    public Counsellor findCounsellorByName(String counsellorName, ArrayList<Counsellor> listOfCounsellorSystem)
    {
        for(Counsellor counsellor: listOfCounsellorSystem)
        {
            if(counsellor.getCounsellorName().equals(counsellorName))
            {
                return counsellor;
            }
        }
        return null;
    }
}
