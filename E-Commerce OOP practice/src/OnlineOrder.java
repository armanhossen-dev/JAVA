public class OnlineOrder extends Orders{
    String deliveryAddress;
    String paymentMethod;
    OnlineOrder(String orderID, int customerNumber, int totalAmount, String deliveryAddress ,String paymentMethod){
        super(orderID, customerNumber, totalAmount);
        this.deliveryAddress = deliveryAddress;
        this.paymentMethod = paymentMethod;
    }
    @Override
    void workdone(){
        System.out.println("Regular online order follows standard delivery,");
    }
}
