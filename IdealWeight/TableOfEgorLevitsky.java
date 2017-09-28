package Others.IdealWeight;


import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class TableOfEgorLevitsky {
    private int[] arrayAge = {25, 35, 45, 55, 65};
    private float[] arrayHeight = {148f, 150f, 152f, 154f, 156f, 158f, 160f, 162f, 164f, 166f, 168f, 170f, 172f, 174f, 176f, 178f, 180f, 182f, 184f, 186f, 188f, 190f};
    private float[][] arrayEL = {
            {50.8f, 48.4f, 55f,   52.3f, 56.6f,  54.7f, 56f,   53.2f, 53.9f, 52.2f},
            {51.3f, 48.9f, 56.7f, 53.9f, 58.1f,  56.5f, 58f,   55.7f, 57.3f, 54.8f},
            {51.3f, 51f,   58.7f, 55f,   61.5f,  59.5f, 61.1f, 57.6f, 60.3f, 55.9f},
            {55.3f, 53f,   61.6f, 59.1f, 64.5f,  62.4f, 63.8f, 60.2f, 61.9f, 59f},
            {58.5f, 55.8f, 64.4f, 61.5f, 67.3f,  66,    65.8f, 62.4f, 63.7f, 60.9f},
            {61.2f, 58.1f, 67.3f, 64.1f, 70.4f,  67.9f, 68f,   64.5f, 67f,   62.4f},
            {62.9f, 59.8f, 69.2f, 65.8f, 72.3f,  69.9f, 69.7f, 65.8f, 68.2f, 64.6f},
            {64.6f, 61.6f, 71f,   68.5f, 74.4f,  72.7f, 72.7f, 68.7f, 69.1f, 66.5f},
            {67.3f, 63.6f, 73.9f, 70.8f, 77.2f,  74f,   75f,   72f,   72.2f, 70f},
            {68.8f, 65.2f, 74.5f, 71.8f, 78f,    76.5f, 76.3f, 73.8f, 74.3f, 71.3f},
            {70.8f, 68.5f, 76.3f, 73.7f, 79.6f,  78.2f, 77.9f, 74.8f, 76f,   73.3f},
            {72.7f, 69.2f, 77.7f, 75.8f, 81f,    79.8f, 79.6f, 76.8f, 76.9f, 75f},
            {74.1f, 72.8f, 79.3f, 77f,   82.8f,  81.7f, 81.1f, 77.7f, 78.3f, 76.3f},
            {77.5f, 74.3f, 80.8f, 79f,   84.4f,  83.7f, 83f,   79.4f, 79.3f, 78f},
            {80.8f, 76.8f, 83.3f, 79.9f, 86f,    84.6f, 84.1f, 80.5f, 81.9f, 79.1f},
            {83f,   78.2f, 85.6f, 82.4f, 88f,    86.1f, 86.5f, 82.4f, 82.8f, 80.9f},
            {85.1f, 80.9f, 88f,   83.9f, 89.9f,  88.1f, 87.5f, 84.1f, 84.4f, 81.6f},
            {87.2f, 83.3f, 90.6f, 87.7f, 91.4f,  89.3f, 89.5f, 86.5f, 85.4f, 82.9f},
            {89.1f, 85.5f, 92f,   89.4f, 92.9f,  90.9f, 91.6f, 87.4f, 88f,   85.9f},
            {93.1f, 89.2f, 95f,   91f,   96.6f,  92.9f, 92.8f, 89.6f, 89f,   87.3f},
            {95.8f, 91.8f, 97f,   94.4f, 98f,    95.8f, 95f,   91.5f, 91.5f, 88.8f},
            {97.1f, 92.3f, 99.5f, 95.6f, 100.7f, 97.4f, 99.4f, 95.6f, 94.8f, 92.9f}
    };
HashMap<List<Integer>, List<Float>> mapF = new HashMap<>();
    public  float weightEgorLevitsky(float height, int age, char gender) {
        float weight = 0f;
        try {
            if (gender == 'M') {
                weight = arrayEL[minAge(age*2-1)][minHeight(height)];
            } else {
                weight = arrayEL[minAge(age*2)][minHeight(height)];
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error!!!!!!!");
        }
        return weight;
    }

    public  int minAge(int age) {
        int temp = Integer.MAX_VALUE;
        int result = 0;
        int indexAge = 0;

        result = getIndexAge(age, temp, result);

        int i = 0;
        while (result != arrayAge[i]){
            i++;
            indexAge = i;
        }
        return indexAge;
    }

    public int minHeight(float height) {
        float temp = Float.MAX_VALUE;
        float result = 0;
        int indexHeight = 0;

        result = getIndexHeight(height, temp, result);

        int i = 0;
        while (result != arrayHeight[i]){
            i++;
            indexHeight = i;
        }
        return indexHeight;
    }

    private int getIndexAge(int x, int temp, int result) {
        for (int i = 0; i < arrayAge.length; ++i) {
            if (arrayAge[i] > x) {
                if (temp > (arrayAge[i] - x)) {
                    temp = arrayAge[i] - x;
                    result = arrayAge[i];
                }
            } else {
                if (temp > (x - arrayAge[i])) {
                    temp = x - arrayAge[i];
                    result = arrayAge[i];
                }
            }
        }
        return result;
    }

    private float getIndexHeight(float x, float temp, float result) {
        for (int i = 0; i < arrayHeight.length; ++i) {
            if (arrayHeight[i] > x) {
                if (temp > (arrayHeight[i] - x)) {
                    temp = arrayHeight[i] - x;
                    result = arrayHeight[i];
                }
            } else {
                if (temp > (x - arrayHeight[i])) {
                    temp = x - arrayHeight[i];
                    result = arrayHeight[i];
                }
            }
        }
        return result;
    }
}
