class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {

        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        if (ssmallest == Integer.MAX_VALUE) {
            result.add(-1);
            return result;
        }

        result.add(smallest);
        result.add(ssmallest);

        return result;
    }
}