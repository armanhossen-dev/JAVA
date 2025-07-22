import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Orders> os = new ArrayList<>();
        //OnlineOrder(String orderID, String customerNumber, int totalAmount, String deliveryAddress ,String paymentMethod)
        //ExpressOrder(String orderID, String customerNumber, int totalAmount, String deliveryAddress ,String paymentMethod, String deliveryTime, String priorityHandling)
        OnlineOrder oc1 = new OnlineOrder("o1", 11, 4,"DSC", "Bkash");
        os.add(oc1);

        ExpressOrder ec1 = new ExpressOrder("e1", 203, 2, "Bogura", "Paypal", "10/3/2024","1");
        os.add(ec1);

        for(Orders o : os){
            o.workdone();
        }
    }
}