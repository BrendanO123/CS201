public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2){
        int borderCount = 0;
        int circleCount = x.length;
        for(int i = 0; i < circleCount; i++){
            if(contains(x[i], y[i], r[i], x1, y1) ^ contains(x[i], y[i], r[i], x2, y2)){borderCount++;}
        }
        return borderCount;
    }
    private boolean contains(int xc, int yc, int r, int xp, int yp){
        int xd = xc - xp;
        int yd = yc - yp;
        return yd * yd + xd * xd <= r * r;
    }
}
