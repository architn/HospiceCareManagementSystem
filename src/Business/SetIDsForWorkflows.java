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
public class SetIDsForWorkflows {
    private final String codeForDonation = "DON";
    
    private final int min = 1000;
    private final int max = 9999;
    
    public String SetIDForDonation()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForHospice = codeForDonation + String.valueOf(random_int);
        return idForHospice;
    }
}
