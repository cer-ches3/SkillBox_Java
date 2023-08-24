public class Main {
    public static void main(String[] args) {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;
        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesBook = 530;
        int booksCount = 2000;
        boolean coldPrintingMode = false;
        double printRollerTemp = 90;

        int paperCount = pagesBook * booksCount /2;
        int inkedCount = booksCount + paperCount;

        boolean isPaperAmount = paperCount <= paperReserve;
        boolean isInkedAmount = inkedCount <= inkReserve;
        boolean isCoverAmount = booksCount <= coverReserve;
        boolean isPrintRollerTempNormal = printRollerTemp >= printRollerMinTemp &&
                printRollerTemp <= printRollerMaxTemp;


        if (isPaperAmount && isInkedAmount && isCoverAmount && (coldPrintingMode || isPrintRollerTempNormal)){
            System.out.println("Печать разрешена");
        }else {
            System.out.println("Печать запрещена");
        }

    }
}
