public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long size = 0;
        for(int i : sizes){
            size += Math.ceil((double)(i)/clusterSize) * (long)(clusterSize);
        }
        return size;
    }
}