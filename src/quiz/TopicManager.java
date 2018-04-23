/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;

/**
 *
 * @author tasty_000
 */
public class TopicManager {

    public ArrayList<String> CSVStrings = new ArrayList<String>(); 


    public void addString(String newString){
        CSVStrings.add(newString);
    }

    public ArrayList<String> getArray(){
        return CSVStrings;
    }

}

