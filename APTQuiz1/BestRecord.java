import java.util.HashMap;
public class BestRecord {
   public String best(String[] games) {
        HashMap<String, Integer> records = new HashMap<>();
        for(String game : games){
            String[] teams = game.split("-");
            records.put(teams[0], records.getOrDefault(teams[0], 0).intValue() + 1);
            records.put(teams[1], records.getOrDefault(teams[1], 0).intValue() - 1);
        }
        String winner = "";
        int record = Integer.MIN_VALUE;
        for(String team : records.keySet()){
            if(records.get(team).intValue() > record){
                record = records.get(team).intValue();
                winner = team;
            }
        }
        return winner + ":" + record;
    } 
}
