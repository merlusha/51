package org.zhudro.fiftyone;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mikalai on 02.02.16.
 */
public class PasswordMap {
    private Map<String,String> userPaswordMap = new HashMap<>();

    public void addNotEncryptedUserPasswordPair(String user,String password){
        userPaswordMap.put(user,password);
    }

    public void addEncryptedUserPasswordPair(String user,String password){
        userPaswordMap.put(user,PasswordUtil.createPasswordHash(password));
    }

    public boolean checkPassword(String user,String password){
        String savedPassword=userPaswordMap.get(user);
        if(savedPassword==null || savedPassword.isEmpty()){
            throw new IllegalArgumentException("User "+user+" does not known by underlying authentication system");
        }
        else{
            return savedPassword.equals(PasswordUtil.createPasswordHash(password));
        }
    }
}
