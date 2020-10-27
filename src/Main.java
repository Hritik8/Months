/*   Created by IntelliJ IDEA.
 *   Author: Hritik Ranjan (191500352)
 *   Date: 27-10-2020
 *   Time: 20:53
 *   File: Main.java
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

class Main {
    public static void main(String[] args) {
        int date = new GregorianCalendar().get(Calendar.DATE);
        int month = new GregorianCalendar().get(Calendar.MONTH);
        Months[] months = Months.values();
        Months currentMonth = months[month];
        switch (currentMonth) {
            case JANUARY:
                System.out.println(Months.JANUARY.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.JANUARY.getNumberOfDaysInMonth() - date) + " Days left in January!");
                break;
            case FEBRUARY:
                System.out.println(Months.FEBRUARY.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.FEBRUARY.getNumberOfDaysInMonth() - date) + " Days left in February!");
                break;
            case MARCH:
                System.out.println(Months.MARCH.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.MARCH.getNumberOfDaysInMonth() - date) + " Days left in March!");
                break;
            case APRIL:
                System.out.println(Months.APRIL.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.APRIL.getNumberOfDaysInMonth() - date) + " Days left in April!");
                break;
            case MAY:
                System.out.println(Months.MAY.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.MAY.getNumberOfDaysInMonth() - date) + " Days left in May!");
                break;
            case JUNE:
                System.out.println(Months.JUNE.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.JUNE.getNumberOfDaysInMonth() - date) + " Days left in June!");
                break;
            case JULY:
                System.out.println(Months.JULY.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.JULY.getNumberOfDaysInMonth() - date) + " Days left in July!");
                break;
            case AUGUST:
                System.out.println(Months.AUGUST.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.AUGUST.getNumberOfDaysInMonth() - date) + " Days left in August!");
                break;
            case SEPTEMBER:
                System.out.println(Months.SEPTEMBER.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.SEPTEMBER.getNumberOfDaysInMonth() - date) + " Days left in September!");
                break;
            case OCTOBER:
                System.out.println(Months.OCTOBER.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.OCTOBER.getNumberOfDaysInMonth() - date) + " Days left in October!");
                break;
            case NOVEMBER:
                System.out.println(Months.NOVEMBER.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.NOVEMBER.getNumberOfDaysInMonth() - date) + " Days left in November!");
                break;
            case DECEMBER:
                System.out.println(Months.DECEMBER.getNumberOfDaysInMonth() + " - " + date + " = " + (Months.DECEMBER.getNumberOfDaysInMonth() - date) + " Days left in December!");
                break;
        }
    }
}
