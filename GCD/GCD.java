public class GCD{
    public static void main(String[] args){
        System.out.println(findGCD(174112510, 37632832));
        System.out.println(findGCDEuclidean(174112510, 37632832));
    }

    public static int findGCD(int first, int second){
        int lowest = Math.min(first, second);
        int gcd = 0;
        for(int index = 1; index <= lowest; index++){
            if(first % index == 0 && second % index == 0)
                gcd = index;
        }
        return gcd;
    }

    public static int findGCDEuclidean(int first, int second){
        if(first == 0)
            return second;
        return findGCDEuclidean(second % first, first);
    }

    public static int findGCDEuclidean2(int first, int second){
        if(second == 0)
            return first;
        return findGCDEuclidean(first, second % first);
    }

}