package edu.psu.ist;
import java.util.ArrayList;

public class BundtCake extends Cake {

    private ArrayList<String> additionalIngredients = new ArrayList<>();

    public BundtCake () {
        ArrayList<String> baseIngredients = super.getBaseIngredients();
        additionalIngredients.addAll(baseIngredients);
        additionalIngredients.add("Vanilla");
    }

    @Override
    public void printIngredients(){
        for (String item : additionalIngredients){
            System.out.println(item);
        }
    }
}
