package BillingSystem;
import java.util.*;

//Creating the Bill class for the Biiling
public class Bill {
    private ArrayList<String> orderedFood;//Arraylist to list the order food
    private ArrayList<Integer> orderedQuantity;//Arraylist to get the count of order
    private double totalcost;//total cost of all bill

    public Bill(){
        //ArrayList created here
        orderedFood = new ArrayList<String>();
        orderedQuantity = new ArrayList<Integer>();
    }
    //total cost
    public double getTotal() {
        return totalcost;
    }

    //created the adding the meal function
    public void addOder(String meal,int quantity,String[] dish, double[] cost){
        orderedFood.add(meal);//get the meal name
        orderedQuantity.add(quantity);//get the quantity of the meal
        for (int i=0;i<dish.length;i++){
            if (meal.equals(dish[i])){
                //total-cost is initialized to be zero
                //when a bill instance is constructed
                totalcost+=quantity*cost[i];
            }
        }
    }

    //Getting the order by the object from the main function
    public void getOrder(){
        System.out.println("\n================ The Restaurant Billing System ================");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|  Meal Item \t  |\t\t\t\tQunatity\t\t\t\t\t   |");
        System.out.println("|--------------------------------------------------------------|");

        //for loop for each the meal item get Billed
        for (int i=0;i< orderedFood.size();i++){
            System.out.printf("| %-15s | %15d \t\t\t\t\t\t   |", orderedFood.get(i), orderedQuantity.get(i));
            System.out.println();
        }
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("| Total:\t\t  |\t\t\t\t"+getTotal()+"\t\t\t\t\t\t   |");
        System.out.println("|--------------------------------------------------------------|");
    }

}