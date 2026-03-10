// Last updated: 3/10/2026, 3:14:23 PM
class Solution {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        int x = 0;
        int y = 0;

        myBreakLabel:
        for (int i=0; i<8; i++) {
            for (int j=0; j<8; j++) {
                if (board[i][j] == 'R') {
                    x=i;
                    y=j;
                    break myBreakLabel;
                }
            }
        }

        //check left
        for (int j=y-1; j>=0; j--) {
            if (board[x][j] == 'p') {
                count++;
                break;
            } else if (board[x][j] == 'B') {
                break;
            }
        }

        //check right
        for (int j=y+1; j<8; j++) {
            if (board[x][j] == 'p') {
                count++;
                break;
            } else if (board[x][j] == 'B') {
                break;
            }
        }

        //check up
        for (int i=x-1; i>=0; i--) {
            if (board[i][y] == 'p') {
                count++;
                break;
            } else if (board[i][y] == 'B') {
                break;
            }
        }

        //check down
        for (int i=x+1; i<8; i++) {
            if (board[i][y] == 'p') {
                count++;
                break;
            } else if (board[i][y] == 'B') {
                break;
            }
        }

        return count;
    }
}