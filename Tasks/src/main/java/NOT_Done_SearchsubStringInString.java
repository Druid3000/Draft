public class NOT_Done_SearchsubStringInString {

    public static int simpleSearch(String where, String what){

        int n = where.length();
        int m = what.length();

        // Внешний цикл поиска в исходной строке
        for (int i = 0; i < n-m; i++) {
            // Внутренний цикл сравнения:
            for (int j = 0; j < m; j++) {
                if(where.charAt(i) != what.charAt(j)) {
                    break;
                }
            }
            return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(simpleSearch("abcdefg", "bc"));
    }
}
