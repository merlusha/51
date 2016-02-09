package org.zhudro.fiftyone;

/**
 * Created by mikalai on 08.02.16.
 */
import static org.zhudro.fiftyone.PasswordStrength.*;
public class PasswordStrenthIndicator {
    public static PasswordStrength calculatePasswordStrentgh(String pass) {

        if(pass == null){
            return VERY_WEAK;}

        int length = pass.length();
        int digitsCount = 0;
        int lettersCount = 0;
        int specialCharactersCount = 0;


        for(char c :pass.toCharArray()){
            if(Character.isDigit(c)){
                digitsCount++;
            }else if(Character.isLetter(c)){
                lettersCount++;
            }else{
                specialCharactersCount++;
            }
        }

        if(digitsCount==length & length<8){
            return VERY_WEAK;
        }
        if(lettersCount==length & length<8){
            return WEAK;
        }

        if(digitsCount>=1 & lettersCount>=1 & length>=8){
            return STRONG;
        }

        if(digitsCount>=1 & lettersCount>=1 & specialCharactersCount>=1 & length>=8){
            return VERY_STRONG;
        }

        return PasswordStrength.VERY_WEAK;
    }

}
