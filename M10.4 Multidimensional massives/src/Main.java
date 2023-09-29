public class Main {
    public static void main(String[] args) {
        Figure[][] board = new Figure [8][];
        board[0] = new Figure[] {
                new Figure(FigureColor.WHITE, FigureType.ROOK),
                new Figure(FigureColor.WHITE, FigureType.HORSE),
                new Figure(FigureColor.WHITE, FigureType.ELEPHANT),
                new Figure(FigureColor.WHITE, FigureType.KING),
                new Figure(FigureColor.WHITE, FigureType.QUEEN),
                new Figure(FigureColor.WHITE, FigureType.ELEPHANT),
                new Figure(FigureColor.WHITE, FigureType.HORSE),
                new Figure(FigureColor.WHITE, FigureType.ROOK)
        };
        board[1] = new Figure[8];
        board[6] = new Figure[8];
        for (int i = 0; i < 8; i++){
            board[1][i] = new Figure(FigureColor.WHITE, FigureType.PAWN);
            board[6][i] = new Figure(FigureColor.BLACK, FigureType.PAWN);
        }

        board[7] = new Figure[] {
                new Figure(FigureColor.BLACK, FigureType.ROOK),
                new Figure(FigureColor.BLACK, FigureType.HORSE),
                new Figure(FigureColor.BLACK, FigureType.ELEPHANT),
                new Figure(FigureColor.BLACK, FigureType.KING),
                new Figure(FigureColor.BLACK, FigureType.QUEEN),
                new Figure(FigureColor.BLACK, FigureType.ELEPHANT),
                new Figure(FigureColor.BLACK, FigureType.HORSE),
                new Figure(FigureColor.BLACK, FigureType.ROOK)
        };

        for (int i = 2; i < 6; i++){
            board[i] = new Figure[8];
        }

        for (int row = 0; row < 8; row++){
            for (int cells = 0; cells < 8; cells++){
                Figure figure = board[row][cells];
                System.out.print(figure == null ? "--" : figure);
                System.out.print(cells < 7 ? " " : "\n");
            }
        }

    }
}
