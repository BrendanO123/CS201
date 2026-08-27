import java.util.HashSet;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        HashSet<String> availableIngredients = new HashSet<String>();
        for(String availableIngredient : available){
            availableIngredients.add(availableIngredient);
        }

        for(int i = 0; i < orders.length; i++){
            String[] ingredients = orders[i].split("\\s");
            boolean avail = true;
            for(String ingredient : ingredients){
                if(!availableIngredients.contains(ingredient)){
                    avail = false;
                    break;
                }
            }
            if(avail){
                return i;
            }
        }
        return -1; 
    }
}
