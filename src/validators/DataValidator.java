package validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {

    public boolean isValidate(String commandStr, Enum[] commandsData){
        boolean isCommandExist = false;
        for (Enum command : commandsData) {
            if (command.name().equals(commandStr)) {
                return true;

            }
        }
        return false;
    }
    public static boolean isDataByRegExp(String numberStr, Pattern pattern){
        Matcher matcher = pattern.matcher(numberStr);
        return matcher.find();
    }
}

