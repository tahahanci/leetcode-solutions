package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateInString {

    public String containsDuplicate(String input) {
        Set<Character> characterSet = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!characterSet.add(c) && result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ContainsDuplicateInString containsDuplicateInString = new ContainsDuplicateInString();
        String duplicatedValues = containsDuplicateInString.containsDuplicate("insufficient");
        System.out.println(duplicatedValues);
    }
}
