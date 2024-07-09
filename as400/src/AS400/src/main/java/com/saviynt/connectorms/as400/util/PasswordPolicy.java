package com.saviynt.connectorms.as400.util;

/**
 *
 * @author marcozhang
 */
public class PasswordPolicy {
    private int minLength;
    private int maxLength;
    private int minLowercase;
    private int minUppercase;
    private int minDigits;
    private int minSpecialChars;
    private int maxRepeatedChars;
    private String lowercaseLetters;
    private String uppercaseLetters;
    private String digits;
    private String specialCharacters;
    private boolean allowFirstDigitOrSpecialChar;

    // Constructor with default policy values
    public PasswordPolicy() {
        this.minLength = 8;
        this.maxLength = 16;
        this.minLowercase = 1;
        this.minUppercase = 1;
        this.minDigits = 1;
        this.minSpecialChars = 1;
        this.maxRepeatedChars = 2;
        this.lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        this.uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.digits = "0123456789";
        this.specialCharacters = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        this.allowFirstDigitOrSpecialChar = true;
    }

    // Getter and setter methods for policy values
    // (Getters and setters omitted for brevity)
    // Getter and setter methods for policy values
    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMinLowercase() {
        return minLowercase;
    }

    public void setMinLowercase(int minLowercase) {
        this.minLowercase = minLowercase;
    }

    public int getMinUppercase() {
        return minUppercase;
    }

    public void setMinUppercase(int minUppercase) {
        this.minUppercase = minUppercase;
    }

    public int getMinDigits() {
        return minDigits;
    }

    public void setMinDigits(int minDigits) {
        this.minDigits = minDigits;
    }

    public int getMinSpecialChars() {
        return minSpecialChars;
    }

    public void setMinSpecialChars(int minSpecialChars) {
        this.minSpecialChars = minSpecialChars;
    }

    public int getMaxRepeatedChars() {
        return maxRepeatedChars;
    }

    public void setMaxRepeatedChars(int maxRepeatedChars) {
        this.maxRepeatedChars = maxRepeatedChars;
    }

    public String getLowercaseLetters() {
        return lowercaseLetters;
    }

    public void setLowercaseLetters(String lowercaseLetters) {
        this.lowercaseLetters = lowercaseLetters;
    }

    public String getUppercaseLetters() {
        return uppercaseLetters;
    }

    public void setUppercaseLetters(String uppercaseLetters) {
        this.uppercaseLetters = uppercaseLetters;
    }

    public String getDigits() {
        return digits;
    }

    public void setDigits(String digits) {
        this.digits = digits;
    }

    public String getSpecialCharacters() {
        return specialCharacters;
    }

    public void setSpecialCharacters(String specialCharacters) {
        this.specialCharacters = specialCharacters;
    }

    public boolean isAllowFirstDigitOrSpeicalChar() {
        return allowFirstDigitOrSpecialChar;
    }
    
    public void setAllowFirstDigitOrSpeicalChar(boolean allowFirstDigitOrSpeicalChar) {
        this.allowFirstDigitOrSpecialChar = allowFirstDigitOrSpeicalChar;
    }
}
