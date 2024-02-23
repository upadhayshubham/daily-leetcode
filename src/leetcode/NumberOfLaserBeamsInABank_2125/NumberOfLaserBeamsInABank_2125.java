package leetcode.NumberOfLaserBeamsInABank_2125;

public class NumberOfLaserBeamsInABank_2125 {
    public static void main(String[] args) {

        String[] bank = new String[]{"000", "111", "000"};
        NumberOfLaserBeamsInABank_2125 numberOfLaserBeamsInABank2125 = new NumberOfLaserBeamsInABank_2125();
        int numberOfBeams = numberOfLaserBeamsInABank2125.numberOfBeams(bank);

        System.out.println("Number of Beams : " + numberOfBeams);
    }

    public int numberOfBeams(String[] bank) {
        int previousSecurityDevices = 0;
        int result = 0;
        for (String iFloor : bank) {
            int currentNumberOfDevices = (int) iFloor.chars().filter(ch -> ch == '1').count();
            if (currentNumberOfDevices <= 0) {
                continue;
            }
            result = result + (currentNumberOfDevices * previousSecurityDevices);
            previousSecurityDevices = currentNumberOfDevices;
        }
        return result;
    }
}