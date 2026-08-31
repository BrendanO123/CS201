public class SoccerLeagues {
    public int[] points(String[] matches) {
        int len = matches.length;
        int[] points = new int[len];
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(i==j){continue;}
                char c = matches[i].charAt(j);
                switch(c){
                    case 'W':
                        points[i]+=3;
                        break;
                    case 'D':
                        points[i]++;
                        points[j]++;
                        break;
                    case 'L':
                        points[j]+=3;
                        break;
                    default:
                }
            }
        }
        return points;
    }
}