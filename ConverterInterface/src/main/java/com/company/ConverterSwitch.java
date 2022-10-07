package com.company;

import java.time.DayOfWeek;

public class ConverterSwitch {
    public String convertMonth(int monthNumber) {
        int month = 12;
        String monthString;

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                monthString = "January";
                break;
            case 2:
                System.out.println("February");
                monthString = "February";
                break;
            case 3:
                System.out.println("March");
                monthString = "March";
                break;
            case 4:
                System.out.println("April");
                monthString = "April";
                break;
            case 5:
                System.out.println("May");
                monthString = "May";
                break;
            case 6:
                System.out.println("June");
                monthString = "June";
                break;
            case 7:
                System.out.println("July");
                monthString = "July";
                break;
            case 8:
                System.out.println("August");
                monthString = "August";
                break;
            case 9:
                System.out.println("September");
                monthString = "September";
                break;
            case 10:
                System.out.println("October");
                monthString = "October";
                break;
            case 11:
                System.out.println("November");
                monthString = "November";
                break;
            case 12:
                System.out.println("December");
                monthString = "December";
                break;
            default:
                return "These are the months";
        }
        return convertMonth(monthNumber);
    }
    public String converterDay(int dayNumber) {
        int day = 7;
        String dayString;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                dayString = "Monday";
                break;
            case 2:
                System.out.println("tuesday");
                dayString = "Tuesday";
                break;
            case 3:
                System.out.println("wednesday");
                dayString = "Wednesday";
                break;
            case 4:
                System.out.println("thursday");
                dayString = "Thursday";
                break;
            case 5:
                System.out.println("friday");
                dayString = "Friday";
                break;
            case 6:
                System.out.println("saturday");
                dayString = "Saturday";
                break;
            case 7:
                System.out.println("sunday");
                dayString ="Sunday";
                break;
            default:
                System.out.println("not a valid day number");
                return "these are the only days";


        } return converterDay(dayNumber);
    }
}
