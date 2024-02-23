package leetcode.WateringPlants_2079;

public class WateringPlants_2079 {
    public static void main(String[] args) {
        WateringPlants_2079 wateringPlants2079 = new WateringPlants_2079();
        int[] plants = new int[]{2, 2, 3, 3};
        int capacity = 5;
        int steps = wateringPlants2079.wateringPlants(plants, capacity);
        System.out.println("Steps :" + steps);
    }

    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int water = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (water < plants[i]) {
                steps += (i + i + 1);
                water = capacity - plants[i];
            } else {
                steps = steps + 1;
                water = water - plants[i];
            }
        }
        return steps;
    }
}