package BR;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Bus {
    public static void main(String[]) args){
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<booking> bookings = new ArrayList<booking>();
        buses.add(newBus(1, true 2));
        buses.add(newBus(2, false 50));
        buses.add(newBus(3, true 48));
    
    int userOpt = 1;
    Scanner Scanner = new Scanner(System.in);
    for (Bus b: buses){
        b.display BusInfo();
    }
    while (userOpt == 1){
        System.out.println("Enter 1 to book");
    }
    userOpt = scanner.nextInt();
    if (userOpt == 1){
        Booking booking = new Booking();
    if (booking.isAvailable (bookings,buses)){
    bookings.add(booking);
    System.out.println("Your booking confirmed");
    }
    else
    System.out.println("Booking full. Try another date");
}

}
}

