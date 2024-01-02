package org.example;

public class Hotels {
    String hotelName;
    int WeekDayRegCustomer;

    public Hotels(String hotelName, int WeekDayRegCustomer) {
        this.hotelName = hotelName;
        this.WeekDayRegCustomer = WeekDayRegCustomer;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayRegCustomer() {
        return WeekDayRegCustomer;
    }

    public void setWeekDayRegCustomer(int weekDayRegCustomer) {
        this.WeekDayRegCustomer = weekDayRegCustomer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelWeekDayRegularCustomer=" + WeekDayRegCustomer +
                '}';
    }

    public int rateCalculation(String day) {
        if (day.equals("MONDAY") || day.equals("TUESDAY") || day.equals("WEDNESDAY") || day.equals("THURSDAY") || day.equals("FRIDAY")) {
            return WeekDayRegCustomer;
        } else {
            return 0;
        }
    }
}
