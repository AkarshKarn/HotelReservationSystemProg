package org.example;

public class Hotels {
    String hotelName;
    int WeekDayRegCust;
    int WeekendRegCust;
    int rating;

    public Hotels(String hotelName, int WeekDayRegCust, int WeekendRegCust, int rating) {
        this.hotelName = hotelName;
        this.WeekDayRegCust = WeekDayRegCust;
        this.WeekendRegCust = WeekendRegCust;
        this.rating = rating;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelWeekDayRegularCustomer=" + WeekDayRegCust +
                ", hotelWeekendRegularCustomer=" + WeekendRegCust +
                ", rating=" + rating +
                '}';
    }

    public int rateCalculation(String day) {
        if (day.equals("MONDAY") || day.equals("TUESDAY") || day.equals("WEDNESDAY") || day.equals("THURSDAY") || day.equals("FRIDAY")) {
            return getWeekDayRegCust();
        } else {
            return getWeekendRegCust();
        }
    }
}
