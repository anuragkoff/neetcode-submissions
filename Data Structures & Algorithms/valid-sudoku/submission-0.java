class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[i][j] == '.') continue;

                char val = board[i][j];
                String sqK = (i/3) + "," + (j/3);

                if(rows.computeIfAbsent(i, k -> new HashSet<>()).contains(val) ||
                    cols.computeIfAbsent(j, k -> new HashSet<>()).contains(val) ||
                    squares.computeIfAbsent(sqK, k-> new HashSet<>()).contains(val)
                ) {
                    return false;
                }

                rows.get(i).add(val);
                cols.get(j).add(val);
                squares.get(sqK).add(val);
            }
        }

        return true;
    }
}
