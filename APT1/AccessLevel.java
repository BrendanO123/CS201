public class AccessLevel {
    private static final char DENIED = 'D';
    private static final char GRANTED = 'A';
    public String canAccess(int[] rights, int minPermission) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rights.length; i++){
            if(rights[i] < minPermission){sb.append(DENIED);}
            else{sb.append(GRANTED);}
        }
        return sb.toString(); 
    }
}
