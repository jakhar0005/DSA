package basicmaths;

public class countDigits {
    static int evenlyDivides(int N){
        // code here
        int count = 0;

        int var = N;

        while(var > 0) {
            if(var % 10 > 0 && N % (var % 10) == 0) {
                count++;
            }

            var/=10;
        }

        return count;
    }
}
