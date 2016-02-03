package org.zhudro.fiftyone;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * Created by mikalai on 02.02.16.
 */
public class PasswordUtil {
    public static final String HASH_ALGO = "SHA-256";

    public static String createPasswordHash(String password){
        byte[] passBytes= password.getBytes();
        try {
            MessageDigest md = MessageDigest.getInstance(HASH_ALGO);
            md.update(passBytes);
            byte[] hash = md.digest();
            String passwordHash = Base64.getEncoder().encodeToString(hash);
            return passwordHash;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
