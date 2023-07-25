public class Passenger {
    private static int passengerCount = 0;
    private String name;
    private String email;
    private int id;




    public Passenger(){
        this.name = "";
        this.email= "";
        this.id = ++passengerCount;

    }

    public static int getPassengerCount() {
        return passengerCount;
    }

    public static void setPassengerCount(int passengerCount) {
        Passenger.passengerCount = passengerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

}
