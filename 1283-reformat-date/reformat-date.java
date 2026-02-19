import java.util.*;

class Solution {
    public String reformatDate(String date) {

        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");

        String[] arr = date.split(" ");

        String day = arr[0].substring(0, arr[0].length() - 2);
        if (day.length() == 1) {
            day = "0" + day;
        }

        String month = map.get(arr[1]);
        String year = arr[2];

        return year + "-" + month + "-" + day;
    }
}
