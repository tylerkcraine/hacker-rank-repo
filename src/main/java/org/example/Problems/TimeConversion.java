package org.example.Problems;

public class TimeConversion {
    public static String timeConversion(String s) {
        boolean afternoonFlag = s.contains("PM");

        String strippedDate;
        if (afternoonFlag)
            strippedDate = s.replace("PM", "");
        else
            strippedDate = s.replace("AM", "");

        String hour = strippedDate.split(":")[0];
        if (strippedDate.startsWith("12") && !afternoonFlag) {
            return strippedDate.replaceFirst("12", "00");
        } else if (!strippedDate.startsWith("12") && afternoonFlag) {
            int newHour = Integer.parseInt(hour)+12;
            return strippedDate.replaceFirst(hour, Integer.toString(newHour));
        }   else {
            return strippedDate;
        }
    }
}
