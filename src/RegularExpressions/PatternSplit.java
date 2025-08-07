/// split(CharSequence int) method of a Pattern class is used to split the given char sequence
/// passed as a parameter to the method around matches of this pattern
/// The array returned contains each substring of the input subsequence created by this method
/// The substrings in the array are in the order in which they occur in the input
/// If this pattern does not match any subsequence of the input then the resulting array has just one element
/// namely the input sequence in the String form
/// The limit parameter passed as int helps to calculate the number of times the pattern is applied
/// and affects the length of the resulting array
/// If the limit n is greater than 0,then the pattern will be applied at most n -1 time
/// If n is non-positive or Zero the pattern will be applied as many times as possible
///
/// Syntax; public String[] split?(CharSequence input, int limit)
/// Parameters: This method accepts two parameters one input which represents the char sequence
/// to be split and the limit which represents the result Threshold
/// Return value: This method returns the array of Strings computed by splitting the input around matches
/// of this pattern

package RegularExpressions;

import java.util.regex.*;

public class PatternSplit {
    public static void main(String[] args) {
        // Create a REGEX pattern
        String REGEX = "regex";
        // Create the string where the search happens
        String actualString = "Welcome to regex for regex";
        // Compile the REGEX into a Pattern
        Pattern pattern = Pattern.compile(REGEX);
        // Set limit to 2, so the pattern is applied at most (limit - 1) times
        int limit = 2;
        // Split the string using the compiled pattern and the given limit
        String[] array = pattern.split(actualString, limit);
        // Print the resulting substrings
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
