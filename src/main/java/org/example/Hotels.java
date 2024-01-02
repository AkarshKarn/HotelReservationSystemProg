package org.example;

public class Hotels {
    String hotelName;
    int WeekDayRegCust;
    int WeekendRegCust;

    public Hotels(String hotelName, int WeekDayRegCust, int WeekendRegCust) {
        this.hotelName = hotelName;
        this.WeekDayRegCust = WeekDayRegCust;
        this.WeekendRegCust = WeekendRegCust;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayRegCust() {
        return WeekDayRegCust;
    }

    public void setWeekDayRegCust(int weekDayRegCust) {
        this.WeekDayRegCust = weekDayRegCust;
    }

    public int getWeekendRegCust() {
        return WeekendRegCust;
    }

    public void setWeekendRegCust(int weekendRegCust) {
        this.WeekendRegCust = weekendRegCust;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelWeekDayRegularCustomer=" + WeekDayRegCust +
                ", hotelWeekendRegularCustomer=" + WeekendRegCust +
                '}';
    }

    public int rateCalculation(String day) {
        if (day.equals("MONDAY") || day.equals("TUESDAY") || day.equals("WEDNESDAY") || day.equals("THURSDAY") || day.equals("FRIDAY")) {
            return WeekDayRegCust;
        } else {
            return 0;
        }
    }
}
