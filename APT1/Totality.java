public class Totality {
    public int sum(int[] a, String stype) {
        int i = 0;
        int increment = 1;
        switch(stype){
            case "odd":
                increment = 2;
                i = 1;
                break;
            case "even":
                increment = 2;
                i = 0;
                break;
            case "all":
            default:
                increment = 1;
                i = 0;
                break;
        }

        int sum = 0;
        for(; i < a.length; i+= increment){
            sum += a[i];
        }
        return sum;
    }
}