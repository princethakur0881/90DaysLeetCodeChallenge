class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
    //    String first = arriveAlice.compareTo(arriveBob) > 0 ? arriveAlice : arriveBob;  // the later arrival: "MM-DD" strings sort like dates
    //     String last = leaveAlice.compareTo(leaveBob) < 0 ? leaveAlice : leaveBob;  // the earlier departure
    //     return Math.max(0, day(last) - day(first) + 1);
    // }

    // private static final int[] before = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
    // static { Arrays.parallelPrefix(before, Integer::sum); }  // days in the year before each month

    // private static int day(String mmdd) {  // "MM-DD" -> day of the year, 1..365
    //     return before[Integer.parseInt(mmdd.substring(0, 2)) - 1] + Integer.parseInt(mmdd.substring(3));

    int[] arr={0,31,59,90,120,151,181,212,243,273,304,334};
        int aa=arr[Integer.valueOf(arriveAlice.substring(0,2))-1]+Integer.valueOf(arriveAlice.substring(3,5));
        int la=arr[Integer.valueOf(leaveAlice.substring(0,2))-1]+Integer.valueOf(leaveAlice.substring(3,5));
        int ab=arr[Integer.valueOf(arriveBob.substring(0,2))-1]+Integer.valueOf(arriveBob.substring(3,5));
        int lb=arr[Integer.valueOf(leaveBob.substring(0,2))-1]+Integer.valueOf(leaveBob.substring(3,5));
        int st=Math.max(aa,ab);
        int end=Math.min(la,lb);
        return Math.max(0,end-st+1);
    }}
