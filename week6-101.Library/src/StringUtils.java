/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */
public class StringUtils {
    public static boolean included(String word, String searched){
        searched = searched.trim();
        
        if(word.contains(searched)) 
            return true;
        else if(word.contains(searched.toUpperCase()))
            return true;
        else if(word.contains(searched.toLowerCase()))
            return true;
        else if(word.contains(searched.substring(0, 1).toUpperCase() + searched.substring(1).toLowerCase().trim()))
            return true;
        
        return false;
    }
}
