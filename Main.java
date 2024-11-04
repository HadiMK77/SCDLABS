import java.util.Scanner;
interface CommonFunctions {
    void searchTicket();
    void bookTicket();
    void cancelTicket();
    void makePayment();
    void fillDetails();
}
class Customer implements CommonFunctions {
    private int customerId;
    private String name;
    private String address;
    private String phoneNo;
    private int age;
    public Customer(int customerId, String name, String address, String phoneNo, int age) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
    }
    @Override
    public void searchTicket() {
        System.out.println("Searching ticket for customer: " + name);
    }
    @Override
    public void bookTicket() {
        System.out.println("Booking ticket for customer: " + name);
    }
    @Override
    public void cancelTicket() {
        System.out.println("Canceling ticket for customer: " + name);
    }
    @Override
    public void makePayment() {
        System.out.println("Processing payment for customer: " + name);
    }
    @Override
    public void fillDetails() {
        System.out.println("Filling details for customer: " + name);
    }
    public void addDetail() {
        System.out.println("Adding details for customer: " + name);
    }
    public void modifyDetails() {
        System.out.println("Modifying details for customer: " + name);
    }
}
class Agent implements CommonFunctions {
    private int id;
    private String name;
    public Agent(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public void searchTicket() {
        System.out.println("Agent " + name + " is searching ticket.");
    }
    @Override
    public void bookTicket() {
        System.out.println("Agent " + name + " is booking ticket.");
    }
    @Override
    public void cancelTicket() {
        System.out.println("Agent " + name + " is canceling ticket.");
    }
    @Override
    public void makePayment() {
        System.out.println("Agent " + name + " is making payment.");
    }
    @Override
    public void fillDetails() {
        System.out.println("Agent " + name + " is filling details.");
    }
}
class BookingCounter implements CommonFunctions {
    @Override
    public void searchTicket() {
        System.out.println("Booking counter is searching ticket.");
    }
    @Override
    public void bookTicket() {
        System.out.println("Booking counter is booking ticket.");
    }
    @Override
    public void cancelTicket() {
        System.out.println("Booking counter is canceling ticket.");
    }
    @Override
    public void makePayment() {
        System.out.println("Booking counter is making payment.");
    }
    @Override
    public void fillDetails() {
        System.out.println("Booking counter is filling details.");
    }
}
class Refund {
    private double amount;
    private int customerId;

    public Refund(double amount, int customerId) {
        this.amount = amount;
        this.customerId = customerId;
    }
    public void refundAmount() {
        System.out.println("Refunding amount: $" + amount + " to customer ID: " + customerId);
    }
}
class Ticket {
    private String source;
    private String destination;
    private String dateOfJourney;
    private String time;
    private String busNo;
    private int seatNo;
    public Ticket(String source, String destination, String dateOfJourney, String time, String busNo, int seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }
    public void displayTicketInfo() {
        System.out.println("Ticket Info:");
        System.out.println("Source: " + source + ", Destination: " + destination);
        System.out.println("Date: " + dateOfJourney + ", Time: " + time);
        System.out.println("Bus No: " + busNo + ", Seat No: " + seatNo);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNo = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        Customer customer = new Customer(customerId, name, address, phoneNo, age);
        System.out.print("Enter Agent ID: ");
        int agentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Agent Name: ");
        String agentName = scanner.nextLine();
        Agent agent = new Agent(agentId, agentName);
        BookingCounter counter = new BookingCounter();
        System.out.print("Enter Refund Amount: ");
        double refundAmount = scanner.nextDouble();
        Refund refund = new Refund(refundAmount, customerId);
        System.out.print("Enter Ticket Source: ");
        scanner.nextLine();
        String source = scanner.nextLine();
        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter Date of Journey: ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("Enter Time: ");
        String time = scanner.nextLine();
        System.out.print("Enter Bus Number: ");
        String busNo = scanner.nextLine();
        System.out.print("Enter Seat Number: ");
        int seatNo = scanner.nextInt();
        Ticket ticket = new Ticket(source, destination, dateOfJourney, time, busNo, seatNo);
        customer.searchTicket();
        customer.bookTicket();
        customer.makePayment();
        customer.fillDetails();
        customer.addDetail();
        customer.modifyDetails();
        agent.searchTicket();
        agent.bookTicket();
        counter.bookTicket();
        ticket.displayTicketInfo();
        refund.refundAmount();S
        scanner.close();
    }
}
