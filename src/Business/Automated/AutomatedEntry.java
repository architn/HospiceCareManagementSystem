/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Automated;

import Business.Counsellors.Counsellor;
import Business.Diagnosis.Diagnosis;
import Business.Donors.Donor;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Nurses.Nurse;
import Business.Organization;
import Business.Patients.Patient;
import Business.Payers.Payer;
import Business.Providers.Provider;
import Business.Role.CounsellorRole;
import Business.Role.DonorRole;
import Business.Role.NurseRole;
import Business.Role.PatientRole;
import Business.Role.PayerRole;
import Business.Role.ProviderRole;
import Business.Role.VolunteerRole;
import Business.Services.Service;
import Business.UserAccount.UserAccount;
import Business.Volunteers.Volunteer;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author architnigam
 */
public class AutomatedEntry {
    private Provider provider;
    private Payer payer;
    private Patient patient;
    private Nurse nurse;
    private Donor donor;
    private Volunteer volunteer;
    private Counsellor counsellor;
    private Service service;
    private Diagnosis diagnosis;
    private JPanel userProcessContainer;
    Organization organization;
    private UserAccount userAccount;
    EcoSystem system;
    
    public AutomatedEntry(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system)
    {
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
    }
    
    public boolean AutomatedCreationOfProviders()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File providersXMLFile = new File(projectPath + "/src/Business/Automated/Providers.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(providersXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("provider");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                    String providerNPI = (eElement.getElementsByTagName("npi")
                                        .item(0).getTextContent());
                   String providerName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   String providerAddress = eElement.getElementsByTagName("address")
                                        .item(0).getTextContent();
                   String providerCity = eElement.getElementsByTagName("city")
                                        .item(0).getTextContent();
                    String providerState = eElement.getElementsByTagName("state")
                                        .item(0).getTextContent();                            
 
                   String providerZipCode = eElement.getElementsByTagName("zipcode")
                                        .item(0).getTextContent();
                   String providerContactNumber = eElement.getElementsByTagName("contactno")
                                        .item(0).getTextContent();
                   String providerEmailID = eElement.getElementsByTagName("emailID")
                                        .item(0).getTextContent();
                   String providerPassword = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();
                   
                   provider = system.getProviderDirectory().createProvider(providerNPI, providerName, 
                           providerAddress, providerCity, providerState, 
                           providerZipCode, providerCity, providerContactNumber, providerEmailID);
                   Employee emp = system.getEmployeeDirectory().createEmployee(providerName);
                    system.getUserAccountDirectory().createUserAccount(providerEmailID, providerPassword, emp, new ProviderRole());
                }
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }
       
    
    public boolean AutomatedCreationOfPayer()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File payersXMLFile = new File(projectPath + "/src/Business/Automated/Payers.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(payersXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("payer");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                    
                   String payerID = (eElement.getElementsByTagName("payerID")
                                        .item(0).getTextContent());

                   String payerName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   
                   String payerBillingAddress = eElement.getElementsByTagName("address")
                                        .item(0).getTextContent();
                   
                   String payerEmailID = eElement.getElementsByTagName("emailID")
                                        .item(0).getTextContent();
                   
                   String password = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();
                   

                    payer = system.getPayerDirectory().createPayer(payerID, payerName, payerBillingAddress, 
                            payerEmailID);
                   Employee emp = system.getEmployeeDirectory().createEmployee(payerName);
                    system.getUserAccountDirectory().createUserAccount(payerEmailID, password, emp, new PayerRole());
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }
    
    
    public boolean AutomatedCreationOfPatients()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File patientXMLFile = new File(projectPath + "/src/Business/Automated/Patients.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(patientXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("patient");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                    
                   String patientMRN = (eElement.getElementsByTagName("mrn")
                                        .item(0).getTextContent());

                   String patientName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   
                   String patientAddress = eElement.getElementsByTagName("address")
                                        .item(0).getTextContent();
                   
                   String patientCity = eElement.getElementsByTagName("city")
                                        .item(0).getTextContent();
                    String patientState = eElement.getElementsByTagName("state")
                                        .item(0).getTextContent();                            
 
                   String patientZipCode = eElement.getElementsByTagName("zipcode")
                                        .item(0).getTextContent();
                   
                   String patientCountry = eElement.getElementsByTagName("country")
                                        .item(0).getTextContent();
                   
                   String patientContactNumber = eElement.getElementsByTagName("contactno")
                                        .item(0).getTextContent();
                   
                   String patientEmailID = eElement.getElementsByTagName("emailID")
                                        .item(0).getTextContent();
                   
                   String registeredProviderNPI = eElement.getElementsByTagName("providerNPI")
                                        .item(0).getTextContent();
                   
                   String dateOfBirthInString = eElement.getElementsByTagName("dateofbirth")
                                        .item(0).getTextContent();
                   
                   String terminallIllness = eElement.getElementsByTagName("terminalillness")
                                        .item(0).getTextContent();
                   
                   Date dateOfBirth =new SimpleDateFormat("MM/dd/yyyy").parse(dateOfBirthInString);
                   
                   Provider registeredProviderForPatient = system.getProviderDirectory().findProviderByNPI(registeredProviderNPI,
                                                    system.getProviderDirectory().getProviderList());
                   
                   String registeredPayerID = eElement.getElementsByTagName("payerID")
                                        .item(0).getTextContent();
                   
                   Payer registeredPayer =  system.getPayerDirectory().findPayerByID(registeredPayerID,
                                            system.getPayerDirectory().getListOfPayers());
                   
                   String password = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent(); 
                   
                   boolean isPatientAnInPatient = Boolean.parseBoolean(eElement.getElementsByTagName("isPatientAnInPatient")
                                        .item(0).getTextContent());
                   
                    patient = system.getPatientDirectory().createPatient(patientMRN, patientName, 
                            patientAddress, patientCity, patientState, patientZipCode, patientCountry, 
                            patientContactNumber, patientEmailID, registeredProviderForPatient, 
                            registeredPayer, terminallIllness, dateOfBirth, isPatientAnInPatient);
                   
                    Employee emp = system.getEmployeeDirectory().createEmployee(patientName);
                    system.getUserAccountDirectory().createUserAccount(patientEmailID, password, emp, new PatientRole());
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
            return true;
    }
    
    
    public boolean AutomatedCreationOfNurses()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File nursesXMLFile = new File(projectPath + "/src/Business/Automated/Nurses.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(nursesXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("nurse");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                    
                   String nurseID =  (eElement.getElementsByTagName("nurseID")
                                        .item(0).getTextContent());
                   
                   String nurseName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   
                   String nurseCity = eElement.getElementsByTagName("city")
                                        .item(0).getTextContent();
                   
                   String nurseState = eElement.getElementsByTagName("state")
                                        .item(0).getTextContent();                            
 
                   String nurseZipCode = eElement.getElementsByTagName("zipcode")
                                        .item(0).getTextContent();
                   
                   String nurseCountry = eElement.getElementsByTagName("country")
                                        .item(0).getTextContent();
                   
                   String nurseContactNumber = eElement.getElementsByTagName("contactno")
                                        .item(0).getTextContent();
                   
                   String nurseEmailID = eElement.getElementsByTagName("emailID")
                                        .item(0).getTextContent();
                   
                   String registeredProviderNPI = eElement.getElementsByTagName("providerNPI")
                                        .item(0).getTextContent();
                   
                   String dateOfBirthInString = eElement.getElementsByTagName("dateofbirth")
                                        .item(0).getTextContent();
                   String password = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();      
                   Date dateOfBirth =new SimpleDateFormat("MM/dd/yyyy").parse(dateOfBirthInString);
                   
                   Provider registeredProviderForPatient = system.getProviderDirectory().findProviderByNPI(registeredProviderNPI,
                                                    system.getProviderDirectory().getProviderList());
                   
                nurse = system.getNurseDirectory().createNurse(nurseID, nurseName, nurseState, 
                        nurseCity, nurseState, nurseZipCode, nurseCountry, nurseContactNumber, nurseEmailID, 
                        registeredProviderForPatient,dateOfBirth);
                Employee emp = system.getEmployeeDirectory().createEmployee(nurseName);
                    system.getUserAccountDirectory().createUserAccount(nurseEmailID, password, emp, new NurseRole());
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
            return true;
    }
    
    
    public boolean AutomatedCreationOfCounsellors()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File counsellorsXMLFile = new File(projectPath + "/src/Business/Automated/Counsellors.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(counsellorsXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("counsellor");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                    
                   String counsellorID =  (eElement.getElementsByTagName("counsellorID")
                                        .item(0).getTextContent());
                   
                   String counsellorName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   
                   String counsellorCity = eElement.getElementsByTagName("city")
                                        .item(0).getTextContent();
                   
                   String counsellorState = eElement.getElementsByTagName("state")
                                        .item(0).getTextContent();                            
 
                   String counsellorZipCode = eElement.getElementsByTagName("zipcode")
                                        .item(0).getTextContent();
                   
                   String counsellorCountry = eElement.getElementsByTagName("country")
                                        .item(0).getTextContent();
                   
                   String counsellorContactNumber = eElement.getElementsByTagName("contactno")
                                        .item(0).getTextContent();
                   
                   String counsellorEmailID = eElement.getElementsByTagName("emailID")
                                        .item(0).getTextContent();
                   
                   String password = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();      
                   
                   
                counsellor = system.getCounsellorDirectory().createNewCounsellor(counsellorID, counsellorName, 
                        counsellorState, counsellorCity, counsellorState, counsellorCountry, counsellorZipCode, 
                        counsellorEmailID, counsellorContactNumber);
                Employee emp = system.getEmployeeDirectory().createEmployee(counsellorName);
                    system.getUserAccountDirectory().createUserAccount(counsellorEmailID, password, emp, new CounsellorRole());
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }
    
    
    public boolean AutomatedCreationOfDonors()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File donorsXMLFile = new File(projectPath + "/src/Business/Automated/Donors.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(donorsXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("donor");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                    
                   String donorID =  (eElement.getElementsByTagName("donorID")
                                        .item(0).getTextContent());
                   
                   String donorName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   
                   String donorEmailID = eElement.getElementsByTagName("emailID")
                                        .item(0).getTextContent();
                   
                   String password = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();      
                   
                   
                donor = system.getDonorDirectory().createNewDonor(donorID, donorName, 
                        donorEmailID);
                Employee emp = system.getEmployeeDirectory().createEmployee(donorName);
                    system.getUserAccountDirectory().createUserAccount(donorEmailID, password, emp, new DonorRole());
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }
    
    
    public boolean AutomatedCreationOfVolunteers()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File donorsXMLFile = new File(projectPath + "/src/Business/Automated/Volunteers.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(donorsXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("volunteer");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                    
                   String volunteerID =  (eElement.getElementsByTagName("volunteerID")
                                        .item(0).getTextContent());
                   
                   String volunteerName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   
                   String volunteerAddress = eElement.getElementsByTagName("address")
                                        .item(0).getTextContent();
                   
                   String volunteerEmailID = eElement.getElementsByTagName("emailID")
                                        .item(0).getTextContent();
                   
                   String volunteerContactNo = eElement.getElementsByTagName("contactno")
                                        .item(0).getTextContent();
                   
                   String password = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();      
                   
                   
                volunteer = system.getVolunteerDirectory().createVolunteer(volunteerID, volunteerName, 
                        volunteerAddress, volunteerEmailID, volunteerContactNo);
                Employee emp = system.getEmployeeDirectory().createEmployee(volunteerName);
                system.getUserAccountDirectory().createUserAccount(volunteerEmailID, password, emp, new VolunteerRole());
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }
    
    
    public boolean AutomatedCreationOfServices()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File patientXMLFile = new File(projectPath + "/src/Business/Automated/Services.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(patientXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("service");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                    
                   String serviceCode = (eElement.getElementsByTagName("servicecode")
                                        .item(0).getTextContent());

                   String serviceDescription = (eElement.getElementsByTagName("description")
                                        .item(0).getTextContent());
                   
                   String cost = eElement.getElementsByTagName("cost")
                                        .item(0).getTextContent();
                   
                   String registeredProviderNPI = eElement.getElementsByTagName("providerNPI")
                                        .item(0).getTextContent();
                    
                   Provider registeredProviderForPatient = system.getProviderDirectory().findProviderByNPI(registeredProviderNPI,
                                                    system.getProviderDirectory().getProviderList());
                    
                   service = system.getServiceDirectory().createService(serviceCode, serviceDescription, 
                           Double.parseDouble(cost), provider);
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }
    
    
    public boolean AutomatedCreationOfDiagnosis()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File patientXMLFile = new File(projectPath + "/src/Business/Automated/Diagnosis.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(patientXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("diagnosis");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                    
                   String diagnosisCode = (eElement.getElementsByTagName("code")
                                        .item(0).getTextContent());

                   String diagnosisDescription = (eElement.getElementsByTagName("description")
                                        .item(0).getTextContent());
                   
                   String ICDCode = eElement.getElementsByTagName("icdcode")
                                        .item(0).getTextContent();

                    diagnosis = system.getDiagnosisDirectory().createNewDiagnosis(diagnosisCode, 
                            diagnosisDescription, ICDCode);
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }
    
    public boolean AutomatedLoggingOfVitalSigns()
    {
        return true;
    }
}
