package hackerrank.algorithms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
//    public static String timeConversion(String s) throws ParseException {
//        // Write your code here
//        SimpleDateFormat simpleDateFormat12 = new SimpleDateFormat("hh:mm:ssa");
//        Date date = simpleDateFormat12.parse(s);
//
//        SimpleDateFormat simpleDateFormat24 = new SimpleDateFormat("HH:mm:ss");
//        String date1 = simpleDateFormat24.format(date);
//        return date1;
//    }

    public static String timeConversion(String s) {
        // Write your code here
        String substring = s.substring(8,10);

        if (substring.equals("AM")){
            String hss = "";
            String hhs = s.substring(0,2);
            int hh = Integer.valueOf(hhs);
            if (hh>11){
                hh-=12;
                hss = "0"+String.valueOf(hh);
                s = s.replace(s.subSequence(0,2),hss);
            }
            s = s.replace(substring,"");
        }else if(substring.equals("PM")){
            String hhs = s.substring(0,2);
            int hh = Integer.valueOf(hhs);
            if (hh<12){
                hh+=12;
                s = s.replace(s.subSequence(0,2),String.valueOf(hh));
            }
            s = s.replace(substring,"");
        }


        return s;
    }

    public static void main(String[] args) throws ParseException {
        String s = timeConversion("11:59:59PM");
        System.out.println(s);
    }
}
