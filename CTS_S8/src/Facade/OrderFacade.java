package Facade;

public class OrderFacade {
    //daca le luam la paramaterii, e impotriva scopului, dar tot le punem?
    private Waiter myWaiter;
    private Kitchen myKitchen;

    public OrderFacade() {
        myWaiter = new Waiter("Razvan");
        myKitchen = new Kitchen();
    }

    public void order() {
        myWaiter.takeOrder();
        myWaiter.sendOrderToKitchen();
        myKitchen.prepareFood();
        myKitchen.callWaiter();
        myWaiter.serveCustomer();
        myKitchen.washDishes();
    }
}
