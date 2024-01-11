import java.util.Arrays;
public class ArrayAlgorithmsTester
{
    public static void main(String[] args)
    {
        String[] words = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.printExclamation(words);
        System.out.println("----");
        // original word list NOT modified
        System.out.println(Arrays.toString(words));

        System.out.println();

        String[] words1 = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.addExclamation(words1);
        // original word list IS modified
        System.out.println(Arrays.toString(words1));

        System.out.println();

        int[] nums = {6, 4, 0, 3, 9, -2, 5};
        int sum = ArrayAlgorithms.sum(nums);
        System.out.println(sum);
        System.out.println("----");
        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums));

        System.out.println();

        int[] nums1 = {6, 4, 0, 3, 9};
        double avg = ArrayAlgorithms.average(nums1);
        System.out.println(avg);
        int[] nums2 = {4, 6, 7};
        double avg2 = ArrayAlgorithms.average(nums2);
        System.out.println(avg2);
        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        System.out.println();

        int[] nums3 = {6, 4, 3, 9, 2, 5};
        int min = ArrayAlgorithms.minimum(nums3);
        System.out.println(min);
        int[] nums4 = {-4, 5, -7, 3};
        int min2 = ArrayAlgorithms.minimum(nums4);
        System.out.println(min2);
        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));

        System.out.println();

        int[] nums5 = {6, 4, 3, 9, 2, 5};
        int max = ArrayAlgorithms.maximum(nums5);
        System.out.println(max);
        int[] nums6 = {-8, -3, -7, -10};
        int max2 = ArrayAlgorithms.maximum(nums6);
        System.out.println(max2);
        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums5));
        System.out.println(Arrays.toString(nums6));

        System.out.println();

        int[] nums7 = {5, 10, 15, 12, 2, 6};
        ArrayAlgorithms.multiplyBy(nums7, 6);
        // original numbers list IS modified
        System.out.println(Arrays.toString(nums7));

        System.out.println();

        int[] nums8 = {5, -10, 8, 12, 2, -6, 0};
        int[] squares = ArrayAlgorithms.squares(nums8);
        System.out.println(Arrays.toString(squares));
        System.out.println("----");
        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums8));

        System.out.println();

        boolean[] bools = {false, true, true, false, true};
        ArrayAlgorithms.flipBool(bools);
        // original boolean list IS modified
        System.out.println(Arrays.toString(bools));

        System.out.println();

        int[] nums9 = {5, -10, 8, 12, 2, -6, 0};
        System.out.println(ArrayAlgorithms.customToString(nums9));
        int[] nums10 = {15};
        System.out.println(ArrayAlgorithms.customToString(nums10));
        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums9));
        System.out.println(Arrays.toString(nums10));

        System.out.println();

        String[] strings = {"hello", "hola", "hi", "apple", "why?"};
        System.out.println(ArrayAlgorithms.longestString(strings));
        // original array NOT modified
        System.out.println(Arrays.toString(strings));
        System.out.println("----");
        String[] strings1 = {"cut", "boy", "mom", "she"};
        System.out.println(ArrayAlgorithms.longestString(strings1));
        // original array NOT modified
        System.out.println(Arrays.toString(strings1));
        System.out.println("----");
        String[] strings2 = {"M", "DA", "B", "FAD"};
        System.out.println(ArrayAlgorithms.longestString(strings2));
        // original array NOT modified
        System.out.println(Arrays.toString(strings2));

        System.out.println();

        String[] words2 = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.makeUppercase(words2);
        // original word list IS modified
        System.out.println(Arrays.toString(words2));

        System.out.println();

        int[] nums11 = {-6, -4, 0, -3, 1, -2, 5};
        boolean positive = ArrayAlgorithms.containsPositive(nums11);
        System.out.println(positive);
        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums11));
        System.out.println("----");
        int[] nums12 = {-6, -4, 0, -3, -1, -2, -5};
        boolean positive2 = ArrayAlgorithms.containsPositive(nums12);
        System.out.println(positive2);
        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums12));

        System.out.println();

        String[] strings3 = {"hello", "hole", "Adam", "Apple", "why?"};
        boolean hasStr = ArrayAlgorithms.containsString(strings3, "y");
        System.out.println(hasStr);
        // original array NOT modified
        System.out.println(Arrays.toString(strings3));
        System.out.println("----");
        boolean hasStr2 = ArrayAlgorithms.containsString(strings3, "LE");
        System.out.println(hasStr2);
        boolean hasStr3 = ArrayAlgorithms.containsString(strings3, "ap");
        System.out.println(hasStr3);
        boolean hasStr4 = ArrayAlgorithms.containsString(strings3, "hola");
        System.out.println(hasStr4);

        System.out.println();

        String[] strings4 = {"HELLO", "Hole", "Adam", "booyAH", "WHY?"};
        String[] lower = ArrayAlgorithms.makeLowercase(strings4);
        System.out.println(Arrays.toString(lower));
        // original array NOT modified
        System.out.println(Arrays.toString(strings4));

        System.out.println();

        int[] arr= {2, 5, 6, 1, 0};
        int[] arr1 = {1, 7, 6, -2, 8};
        int[] maximums = ArrayAlgorithms.arrayMaximums(arr, arr1);
        System.out.println(Arrays.toString(maximums));
        // original arrays NOT modified
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        System.out.println();

        String[] strings5 = {"hello!", "!!!whoa", "sad", "Adam!", "What! No way", "Why?!"};
        int numExclamations = ArrayAlgorithms.endsInExclamations(strings5);
        System.out.println(numExclamations);
        // original array NOT modified
        System.out.println(Arrays.toString(strings5));

        System.out.println();

        int[] nums13 = {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6};
        int numDoubles = ArrayAlgorithms.countConsecutiveDoubles(nums13);
        System.out.println(numDoubles);
        // original array NOT modified
        System.out.println(Arrays.toString(nums13));

        System.out.println();

        int[] nums14 = {5, 1, 3, 4, 7};
        int[] shiftedLeftArr = ArrayAlgorithms.shiftLeft(nums14);
        System.out.println(Arrays.toString(shiftedLeftArr));
        // original array NOT modified
        System.out.println(Arrays.toString(nums14));

        System.out.println();

        int[] nums15 = {5, 1, 3, 4, 7};
        ArrayAlgorithms.shiftLeftModify(nums15);
        // original array IS modified
        System.out.println(Arrays.toString(nums15));
    }
}