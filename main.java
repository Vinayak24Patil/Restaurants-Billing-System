//main class
package BillingSystem;
public class main {
    //Main function
    public static void main(String[] args) {
        //Dishes list
        String[] dish={"Sandwich","Coffee","French Fries","Salad"};

        //Set Price of the Dishes
        double[] cost={30,20,30,20};

        //Created the Object Named myBill
        Bill myBill = new Bill();

        //pass copies of array reference
        myBill.addOder("Sandwich",2,dish,cost);
        myBill.addOder("Coffe",2,dish,cost);
        myBill.addOder("French Fries",1,dish,cost);
        myBill.addOder("Salad",1,dish,cost);

        //Calling the Function getting "Order" and "Billing"
        myBill.getOrder();

    }
}