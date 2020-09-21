public class TriangleClassifier {
    public static String classifyTriangle(int[] threeSides) {
        String result = "";
        int equalSides = countEqualSide(threeSides);
        if(!isTriangle(threeSides))
            return result = "Khong phai tam giac";
        else {
            switch (equalSides) {
                case 1:
                    return result = "Tam giac can";
                case 2:
                    return result = "Tam giac deu";
                default:
                    return result = "Tam giac thuong";
            }
        }
    }

    public static int countEqualSide(int[] threeSides) {
        int temp = threeSides[0];
        int count = 0;
        for (int i = 1; i < threeSides.length; i++) {
            if (temp == threeSides[i]) {
                count++;
            }
        }
        return count;
    }

    public static int findMaxSideIndex(int[] threeSides) {
        int maxSide = threeSides[0];
        int index = 0;
        for (int i = 0; i < threeSides.length; i++) {
            if (threeSides[i] > maxSide) {
                maxSide = threeSides[i];
                index = i;
            }
        }
        return index;
    }


    public static boolean isTriangle(int[] array) {
        int index = findMaxSideIndex(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] <= 0)
                return false;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        int subtraction = sum - array[index];
        if (subtraction < array[index])
            return false;
        else
            return true;
    }
}
