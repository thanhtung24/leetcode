package Questions.easy;

//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
public class CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        System.out.println(countOdds(8, 10));
    }

    public static int countOdds(int low, int high) {
        int check = checkBothNums(low, high);

        if(check == 2) {
            return (high - low) / 2;
        } else if (check == 1) {
            return (high - low + 2) / 2;
        } else return (high - low + 1) / 2;
    }

    private static int checkBothNums(int low, int high) {
        boolean isLowEven = low % 2 == 0;
        boolean isHighEven = high % 2 == 0;
        if(isLowEven && isHighEven) {
            return 2;
        } else if(!isLowEven && !isHighEven) {
            return 1;
        } else
            return 0;
    }

    // 100% faster
    public int countOddsLeetCodeSol(int low, int high) {
        if(low%2==0&&high%2==0){
            return (high-low)/2;
        }
        return ((high-low)/2) +1;
    }
}
