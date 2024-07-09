package com.saviynt.connectorms.as400.util;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPasswordGenerator {

    public static String generatePassword(PasswordPolicy policy) {

        if (policy.getMinLength() > policy.getMaxLength()) {
            throw new IllegalArgumentException("Maximum length must be greater than or equal to minimum length!");
        }
        if ((policy.getMinLowercase() + policy.getMinUppercase() + policy.getMinDigits() + policy.getMinSpecialChars()) > policy.getMinLength()) {
            throw new IllegalArgumentException("Sum of (minLowercase, minUppercase, minDigits, minSpecialChars) length must not be greater than minimum length!");
        }

        SecureRandom random = new SecureRandom();
        int length = random.nextInt(policy.getMaxLength() - policy.getMinLength() + 1) + policy.getMinLength(); // Random length between minLength and maxLength

        StringBuilder password = new StringBuilder();
        List<Character> chars = new ArrayList<>();

        // Add required number of lowercase letters
        addCharacters(password, chars, policy.getLowercaseLetters(), policy.getMinLowercase(), random);

        // Add required number of uppercase letters
        addCharacters(password, chars, policy.getUppercaseLetters(), policy.getMinUppercase(), random);

        // Add required number of digits
        addCharacters(password, chars, policy.getDigits(), policy.getMinDigits(), random);

        // Add required number of special characters
        addCharacters(password, chars, policy.getSpecialCharacters(), policy.getMinSpecialChars(), random);

        // Add remaining random characters
        int remainingLength = length - (policy.getMinLowercase() + policy.getMinUppercase() + policy.getMinDigits() + policy.getMinSpecialChars());
        for (int i = 0; i < remainingLength; i++) {
            String characterSet = policy.getLowercaseLetters() + policy.getUppercaseLetters() + policy.getDigits() + policy.getSpecialCharacters();
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            if (!hasReachedMaxRepeat(password, randomChar, policy.getMaxRepeatedChars())) {
                password.append(randomChar);
                chars.add(randomChar);
            } else {
                i--; // Re-try to add another random character
            }
        }

        // Shuffle the password to ensure randomness
        return shuffleString(password.toString(), policy.isAllowFirstDigitOrSpeicalChar());
    }

    // Helper method to add required characters to the password
    private static void addCharacters(StringBuilder password, List<Character> chars, String charSet, int requiredCount, Random random) {
        for (int i = 0; i < requiredCount; i++) {
            char randomChar = charSet.charAt(random.nextInt(charSet.length()));
            password.append(randomChar);
            chars.add(randomChar);
        }
    }

    // Helper method to check if a character has reached the maximum repetition limit
    private static boolean hasReachedMaxRepeat(StringBuilder password, char character, int maxRepeatedChars) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == character) {
                count++;
                if (count >= maxRepeatedChars) {
                    return true;
                }
            }
        }
        return false;
    }

    // Helper method to shuffle the characters in a string
    private static String shuffleString(String string, Boolean allowFirstDigitOrSpeicalChar) {
        char[] characters = string.toCharArray();
        SecureRandom random = new SecureRandom();

        if (allowFirstDigitOrSpeicalChar) {
            for (int i = 0; i < characters.length; i++) {
                int randomIndex = random.nextInt(characters.length);
                char temp = characters[i];
                characters[i] = characters[randomIndex];
                characters[randomIndex] = temp;
            }
        } else {
            // Find the first lowercase or uppercase character in the original string
            char firstChar = '\0'; // Initialize with null character
            for (char c : characters) {
                if (Character.isLowerCase(c) || Character.isUpperCase(c)) {
                    firstChar = c;
                    break;
                }
            }

            // if the original string doesn't have letter at all, swap the first character with a randomly chosen lowercase or uppercase character
            if (firstChar == '\0') {
                characters[0] = getRandomLetterOrDigit(random);
            }

            // Shuffle the rest of the characters
            for (int i = 1; i < characters.length; i++) {
                int randomIndex = random.nextInt(characters.length - 1) + 1; // Exclude the first character
                char temp = characters[i];
                characters[i] = characters[randomIndex];
                characters[randomIndex] = temp;
            }
        }

        return new String(characters);
    }

    // Helper method to get a random letter or digit
    private static char getRandomLetterOrDigit(SecureRandom random) {
        String lettersAndDigits = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return lettersAndDigits.charAt(random.nextInt(lettersAndDigits.length()));
    }
}
/*
class PasswordPolicy {

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

}*/
