import java.util.ArrayList;
import java.util.Arrays;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        Arrays.sort(club1);
        Arrays.sort(club2);
        Arrays.sort(club3);

        int i1 = 0, i2 = 0, i3 = 0;
        ArrayList<String> cheaters = new ArrayList<String>();
        while(true){
            int c1 = 0;
            int c2 = 0;
            int c3 = 0;
            if(i1 >= club1.length && i2 >= club2.length && i3 >= club3.length){break;}
            if(i1 >= club1.length){c1 = 1; c2 = 1;}
            if(i2 >= club2.length){c1 = -1; c3 = 1;}
            if(i3 >= club3.length){c2 = -1; c3 = -1;}

            if(c1 == 0){c1 = club1[i1].compareTo(club2[i2]);}
            if(c2 == 0){c2 = club1[i1].compareTo(club3[i3]);}
            if(c3 == 0){c3 = club2[i2].compareTo(club3[i3]);}
            
            if(c1 == 0){
                if(cheaters.size() == 0 || !cheaters.get(cheaters.size() - 1).equals(club1[i1])){
                    cheaters.add(club1[i1]);
                }
                i1++; 
                i2++;
                continue;
            }
            else if(c2 == 0){
                if(cheaters.size() == 0 || !cheaters.get(cheaters.size() - 1).equals(club1[i1])){
                    cheaters.add(club1[i1]);
                }
                i1++; 
                i3++;
                continue;
            }
            else if(c3 == 0){
                if(cheaters.size() == 0 || !cheaters.get(cheaters.size() - 1).equals(club2[i2])){
                    cheaters.add(club2[i2]);
                }
                i2++; 
                i3++;
                continue;
            }

            if(c1 < 0){
                if(c2 < 0){i1++;}
                else{i3++;}
            }
            else{
                if(c3 < 0){i2++;}
                else{i3++;}
            }
        }

        String[] retArray = new String[cheaters.size()];
        cheaters.toArray(retArray);
        return retArray;
    }
}