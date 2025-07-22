public class ExpressOrder extends OnlineOrder{
    String deliveryTime;
    String priorityHandling;
    ExpressOrder(String orderID, int customerNumber, int totalAmount, String deliveryAddress ,String paymentMethod, String deliveryTime, String priorityHandling){
        super(orderID, customerNumber, totalAmount, deliveryAddress, paymentMethod);
        this.deliveryTime = deliveryTime;
        this.priorityHandling = priorityHandling;
    }
    @Override
    void workdone(){
        System.out.println("Express order has faster shipping and higher priority handling");
    }
}
