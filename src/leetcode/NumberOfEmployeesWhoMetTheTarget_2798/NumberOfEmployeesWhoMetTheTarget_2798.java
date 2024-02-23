package leetcode.NumberOfEmployeesWhoMetTheTarget_2798;

public class NumberOfEmployeesWhoMetTheTarget_2798 {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int goodEmp = 0;
        for (int i : hours) {
            if (i >= target) {
                goodEmp++;
            }
        }
        return goodEmp;
    }
}