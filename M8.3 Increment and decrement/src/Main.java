public class Main {
    public static class UsageAnalytics {
        private int visitsCount;

        public UsageAnalytics() {
            visitsCount = 0;
        }

        public int countVisit() {
            return ++visitsCount;
        }
    }

    public static void main(String[] args) {
        UsageAnalytics analytics = new UsageAnalytics();
        analytics.countVisit();
        analytics.countVisit();
        int visits = analytics.countVisit();
        System.out.println("Всего посещений: " + visits);
    }


}
