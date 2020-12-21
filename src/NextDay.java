public class NextDay {
    private static final int FIRSTODAY = 1;
    private static int LASTODAY = 31;
    private static final String JOIN_CHARACTER = "-";

    public static String nextDayCalculator(int day, int month, int year){
        if (day==LASTODAY){
            day=FIRSTODAY;
            month++;
        }
        String result= day +JOIN_CHARACTER+month+JOIN_CHARACTER+year;
        return result;
    }
    private static void checkMonth(int month) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                LASTODAY = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                LASTODAY = 30;
                break;
        }
    }

}
