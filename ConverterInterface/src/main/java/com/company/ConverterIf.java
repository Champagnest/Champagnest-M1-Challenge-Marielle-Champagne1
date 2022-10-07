package com.company;

public class ConverterIf {
    private String month;
    private String day;

    public String converterMonth(int monthNumber) {
        if(monthNumber==1) {
//            month = "january";
            System.out.println("january");
        } else if (monthNumber==2) {
            month = "february";
            System.out.println("february");
        } else if (monthNumber==3) {
            month = "march";
            System.out.println("march");
        } else if (monthNumber==4) {
            month = "april";
            System.out.println("april");
        } else if (monthNumber==5) {
            month = "may";
            System.out.println("may");
        } else if (monthNumber==6) {
            month = "june";
            System.out.println("june");
        } else if (monthNumber==7) {
            month = "july";
            System.out.println("january");
        } else if (monthNumber==8) {
            month = "august";
            System.out.println("august");
        } else if (monthNumber==9) {
            month = "september";
            System.out.println("september");
        } else if (monthNumber==10) {
            month = "october";
            System.out.println("october");
        } else if (monthNumber==11) {
            month = "november";
            System.out.println("november");
        } else if (monthNumber==12) {
            month = "december";
            System.out.println("december");
        }
        return month;
    }

    public String convertDay(int dayNumber) {
        if(dayNumber==1) {
            day = "monday";
        } else if (dayNumber==2) {
            day = "tuesday";
        } else if (dayNumber==3) {
            day = "wednesday";
        } else if (dayNumber==4) {
            day = "thursday";
        } else if (dayNumber==5) {
            day = "friday";
        } else if (dayNumber==6) {
            day = "saturday";
        } else if (dayNumber==7) {
            day = "sunday";
        }
        return day;
    }

}
