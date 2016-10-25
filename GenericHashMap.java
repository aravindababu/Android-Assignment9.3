/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generichashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author user2
 */
public class GenericHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creating EmpCode as Key and Storing Values which are EmpName
        Map<String, List<String>> EmpCode = new HashMap<String, List <String>>();
        
        //Creating List of Employee Names and Storing Values
        List<String> EmpName = new ArrayList<String>();
        EmpName.add("Brad");
        EmpName.add("Natalie");
        EmpName.add("Jeniffer");
        EmpName.add("Zack");
        
        //Put Values into map
        EmpCode.put("A",EmpName);
        
        //Getting All the set of keys
        Set<String> keys = EmpCode.keySet();
        
        //Iterate Through the keys and displaying employee names
        for(String key : keys){
            
            //System.out.println("Key : " +EmpCode);
            //To display key use the above line
            
            //Printing Employee Names
            System.out.println("Employee Names : " +EmpCode.get(key) + "n");
        }
    }
    
}
