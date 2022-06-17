package Questions.easy;

//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {

    }

    // result:
    /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.
    Memory Usage: 42.2 MB, less than 14.29% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.*/
    public static double average(int[] salary) {
        double sum = 0;
        double max = salary[0];
        double min = salary[0];
        for(int i=0; i < salary.length; i++) {
            sum += salary[i];
            if(salary[i] < min) {
                min = salary[i];
            }
            if(salary[i] > max) {
                max = salary[i];
            }
        }
        return (sum - min - max) / (salary.length - 2);
    }
}
