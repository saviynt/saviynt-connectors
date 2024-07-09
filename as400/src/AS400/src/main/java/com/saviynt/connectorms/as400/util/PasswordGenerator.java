package com.saviynt.connectorms.as400.util;

import java.security.SecureRandom;

/**
 *
 * @author marcozhang
 */
public class PasswordGenerator {

    private final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    private final String NUM = "0123456789";
    private String SPL_CHARS = "!@#$%^&*_=+-/";

    public void setSPLCHARS(String str) {
        SPL_CHARS = str;
    }
    
    public char[] generatePswd(int minLen, int maxLen, int minLowercaseChars, int minUppercaseChars, int minNumeric, int minSpecialChars) {
        
        String All = ALPHA_CAPS + ALPHA + NUM + SPL_CHARS;
        
        if (minLen > maxLen) {
            throw new IllegalArgumentException("Maximum length must be greater than or equal to minimum length!");
        }
        if ((minLowercaseChars + minUppercaseChars + minNumeric + minSpecialChars) > minLen) {
            throw new IllegalArgumentException("Sum of (LOWER, CAPS, DIGITS, SPL CHARS) Length must not be greater than minimum length!");
        }
        SecureRandom rnd = new SecureRandom();
        int len = rnd.nextInt(maxLen - minLen + 1) + minLen;
        char[] pswd = new char[len];
        for (int i = 0; i < minLowercaseChars; i++) {
            int index = getNextIndex(rnd, len, pswd);
            pswd[index] = ALPHA.charAt(rnd.nextInt(ALPHA.length()));
        }
        for (int i = 0; i < minUppercaseChars; i++) {
            int index = getNextIndex(rnd, len, pswd);
            pswd[index] = ALPHA_CAPS.charAt(rnd.nextInt(ALPHA_CAPS.length()));
        }
        for (int i = 0; i < minNumeric; i++) {
            int index = getNextIndex(rnd, len, pswd);
            pswd[index] = NUM.charAt(rnd.nextInt(NUM.length()));
        }
        for (int i = 0; i < minSpecialChars; i++) {
            int index = getNextIndex(rnd, len, pswd);
            pswd[index] = SPL_CHARS.charAt(rnd.nextInt(SPL_CHARS.length()));
        }
        for (int i = 0; i < len; i++) {
            if (pswd[i] == 0) {
                pswd[i] = All.charAt(rnd.nextInt(All.length()));
            }
        }
        return pswd;
    }
    
    public String generatePassword(int minLen, int maxLen, int minLowercaseChars, int minUppercaseChars, int minNumeric, int minSpecialChars) {
        return new String(generatePswd(minLen, maxLen, minLowercaseChars, minUppercaseChars, minNumeric, minSpecialChars));
    }

    private int getNextIndex(SecureRandom rnd, int len, char[] pswd) {
        int index = rnd.nextInt(len);
        //while (pswd[index = rnd.nextInt(len)] != 0);
        while (pswd[index] != 0) {
            index = rnd.nextInt(len);
        }
        return index;
    }
}
