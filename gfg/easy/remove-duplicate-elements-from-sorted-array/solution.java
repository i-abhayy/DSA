class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {

        int j = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i <= j; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}