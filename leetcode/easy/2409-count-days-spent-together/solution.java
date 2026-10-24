class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceStart = calculateDayOfYear(arriveAlice);
        int aliceEnd = calculateDayOfYear(leaveAlice);
        int bobStart = calculateDayOfYear(arriveBob);
        int bobEnd = calculateDayOfYear(leaveBob);
        
        int overlapStart = Math.max(aliceStart, bobStart);
        int overlapEnd = Math.min(aliceEnd, bobEnd);
        
        if (overlapStart <= overlapEnd) {
            return overlapEnd - overlapStart + 1;
        }
        return 0;
    }
    
    private int calculateDayOfYear(String date) {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        
        int dayOfYear = day;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonths[i];
        }
        return dayOfYear;
    }
}