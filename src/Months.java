/*   Created by IntelliJ IDEA.
 *   Author: Hritik Ranjan (191500352)
 *   Date: 27-10-2020
 *   Time: 20:54
 *   File: Months.java
 */

public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    int numberOfDaysInMonth;

    Months(int numberOfDaysInMonth) {

        this.numberOfDaysInMonth = numberOfDaysInMonth;
    }

    public int getNumberOfDaysInMonth() {
        return numberOfDaysInMonth;
    }
}