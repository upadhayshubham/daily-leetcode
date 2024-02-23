package leetcode.MinimumAmountOfTimeToCollectGarbage_2391;

public class MinimumAmountOfTimeToCollectGarbage_2391 {
    public static void main(String[] args) {
        MinimumAmountOfTimeToCollectGarbage_2391 minimumAmountOfTimeToCollectGarbage2391 = new MinimumAmountOfTimeToCollectGarbage_2391();
        String [] garbage = new String[] {"G","P","GP","GG"};
        int[] travel = new int[] {2,4,3};

        int result = minimumAmountOfTimeToCollectGarbage2391.garbageCollection(garbage, travel);
        System.out.println("Result : "+result);
    }

    public int garbageCollection(String[] garbage, int[] travel) {
        int totalTime = 0;
        for(int i = 0; i< garbage.length; i++) {
            if(garbage[i].contains("P")) {
                System.out.println("Yess "+i);

                int length = garbage[i].split("P", -1).length-1;
                totalTime = totalTime + length;

                System.out.println("Work :" + length + "  i "+i);
            } else {
                if(i > 0 && (i > garbage.length - 1)) {
                    totalTime = totalTime + travel[i -1];
                }
            }
        }

        System.out.println("Total time for P " + totalTime);

        for(int i = 0; i< garbage.length; i++) {
            if(i > 0) {
                totalTime = totalTime + travel[i -1];
            }
            if(garbage[i].contains("G")) {
                System.out.println("Yess G"+i);
                int length = garbage[i].split("G", -1).length-1;
                totalTime = totalTime + length;

                System.out.println("Work G:" + length + "  i "+i);
            } else {
                if(i > 0 && (i > garbage.length - 1)) {
                    totalTime = totalTime + travel[i -1];
                }
            }
        }

        System.out.println("Total time for G " + totalTime);

        for(int i = 0; i< garbage.length; i++) {
            if(garbage[i].contains("M")) {
                System.out.println("Yess M "+i);
                if(i > 0) {
                    totalTime = totalTime + travel[i -1];
                }
                int length = garbage[i].split("M", -1).length-1;
                totalTime = totalTime + length;

                System.out.println("Work M:" + length + "  i "+i);
            }else {
                if(i > 0 && (i > garbage.length - 1)) {
                    totalTime = totalTime + travel[i -1];
                }
            }
        }


        return totalTime;
    }
}