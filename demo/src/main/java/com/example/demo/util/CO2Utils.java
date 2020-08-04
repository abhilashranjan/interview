package com.example.demo.util;

import java.text.DecimalFormat;

public class CO2Utils {
    public static String getTransportModeData(String transportMedium){
        String transportMode=null;
        if(transportMedium.contains("-")){
            String[] split = transportMedium.split("-");
            if(split.length>0){
                transportMode=split[0].toUpperCase();
            }
        }else{
            transportMode=transportMedium.toUpperCase();
        }
        return transportMode;
    }

    public static String printTwoDecimal(Double decimalNumber){
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return df.format(decimalNumber);
    }

    public static Integer gramVal(String gram){
        if(gram.contains("g")) {
            return Integer.valueOf(gram.substring(0, gram.length() - 1));
        }
        return null;
    }
}
