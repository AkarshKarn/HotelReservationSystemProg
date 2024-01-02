import org.example.Hotels;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {

    static List<Hotels> list = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");

            HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        Hotels hotel1 = new Hotels("Lakewood", 130,80,2);
        Hotels hotel2 = new Hotels("Bridgewood", 170,90,5);
        Hotels hotel3 = new Hotels("Ridgewood", 240,130,4);

        //   Adding the Hotels to Hotel Reservation Class
        list.add(hotel1);
        list.add(hotel2);
        list.add(hotel3);
        System.out.println(list);
        findCheapestHotel();
        cheapestBestRatedHotel();
        bestRatedHotel();

    }

    public static void findCheapestHotel() {

        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate date1 = LocalDate.of(2020, Month.SEPTEMBER, 11);
        DayOfWeek localDate1 = date.getDayOfWeek();
        DayOfWeek localDate2 = date1.getDayOfWeek();
        String day1 = String.valueOf(localDate1);
        String day2 = String.valueOf(localDate2);
        System.out.println(day2);
        System.out.println(day1);
        int sum1 = list.get(0).rateCalculation(day1) + list.get(0).rateCalculation(day2);
        int sum2 = list.get(1).rateCalculation(day1) + list.get(1).rateCalculation(day2);
        int sum3 = list.get(2).rateCalculation(day1) + list.get(2).rateCalculation(day2);


        if (sum1 < sum2 && sum1 < sum3) {
            System.out.println("This Rate for Hotel Lakewood");
            System.out.println("Minimum Rates For The Hotel :- " + sum1 + "$");

        } else if (sum2 < sum1 && sum2 < sum3) {
            System.out.println("This Rate for Hotel Bridgewood");
            System.out.println("Cheapest Rates For The Hotel is :- " + sum2 + "$");

        } else {
            System.out.println("This Rate  for Hotel Ridgewood");
            System.out.println("Cheapest Rates For The Hotel :- " + sum3 + "$");

        }
    }

    public static void cheapestBestRatedHotel(){
        int rating=Integer.MAX_VALUE;
        for (Hotels hotel:list){
            if (hotel.getRating()<rating){
                rating=hotel.getRating();
            }
        }
        int bestRating=rating;
        list.stream().filter(i->i.getRating()==bestRating).forEach(System.out::println);
    }

    public static void bestRatedHotel() {
        int rating1 = list.get(0).getRating();
        int rating2 = list.get(1).getRating();
        int rating3 = list.get(2).getRating();
        if (rating1 > rating2 && rating1 > rating3) {
            System.out.println("Best Rated Hotel is " + rating1);
        } else if (rating2 > rating1 && rating2 > rating3) {
            System.out.println("Best Rated Hotel is " + rating2);
        } else {
            System.out.println("Best Rated Hotel is " + rating3);

        }
    }
}
