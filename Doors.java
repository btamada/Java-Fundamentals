import java.util.LinkedList;
import java.util.Queue;

/**
 *      MSFT Interview Question
 *
 *
 *           Rooms (5 x 5)
 *
 *         0   1   2   3   4
 *       ____________________
 *     0 |_1_|_-_|_-_|_L_|_ _|
 *     1 |_-_|_-_|_-_|_L_|_L_|
 *     2 |_-_|_-_|_1_|_1_|_-_|
 *     3 |_-_|_1_|_-_|_-_|_-_|
 *     4 |_L_|_-_|_-_|_-_|_1_|
 *
 *      For each room label the adjacent rooms by how
 *      many doors it takes to get to them.
 *
 *      Example:
 *      Starting at a room give the immediate adjacent rooms a number of 1, then adjacent to those a number
 *      of 2, etc.
 *
 */

public class Doors {

    public static void main(String[] args) {
        Room[][] matrix = new Room[5][5];

        // create the rooms
        for(int i = 0; i < matrix[0].length; ++i) {
            for(int j = 0; j < matrix.length; ++j) {
                matrix[i][j] = new Room();
            }
        }

        // manually input the 1 rooms into the matrix
        matrix[0][0].roomNumber = 1;
        matrix[2][2].roomNumber = 1;
        matrix[2][3].roomNumber = 1;
        matrix[3][1].roomNumber = 1;
        matrix[4][4].roomNumber = 1;

        // manually input the L (locked) rooms into the matrix
        matrix[0][3].roomNumber = -1;
        matrix[1][3].roomNumber = -1;
        matrix[1][4].roomNumber = -1;
        matrix[4][0].roomNumber = -1;

        // manually input the invalid adjacent cells
        matrix[0][0].left = null;
        matrix[0][0].top = null;
        matrix[0][1].top = null;
        matrix[0][2].top = null;
        matrix[0][3].top = null;
        matrix[0][4].top = null;
        matrix[0][4].right = null;
        matrix[1][0].left = null;
        matrix[2][0].left = null;
        matrix[3][0].left = null;
        matrix[4][0].left = null;
        matrix[4][0].bottom = null;
        matrix[4][1].bottom = null;
        matrix[4][2].bottom = null;
        matrix[4][3].bottom = null;
        matrix[4][4].bottom = null;
        matrix[4][4].right = null;
        matrix[1][4].right = null;
        matrix[2][4].right = null;
        matrix[3][4].right = null;

        // label the rooms
        Queue<Room> queue = new LinkedList<>();

        // iterate through each of the rows in the matrix
        for(int i = 0; i < matrix[0].length; ++i) {

            // for each room in the row matrix[i]
            for(Room r : matrix[i]) {

                // if the room number is equal to 1, step into the if block
                if(r.roomNumber == 1) {
                    queue.add(r);

                    // set the room adjDoorCounterNext to 1
                    int doorNumCounter = 2;

                    // iterate through each adjacent room and set its room number
                    do {

                        Room currRoom = queue.remove();

                        if( (doorNumCounter != currRoom.roomNumber + 1))
                            ++doorNumCounter;

                        if(doorNumCounter > 3)
                            break;

                        if (currRoom.top != null && currRoom.top.roomNumber == 0) {
                            currRoom.top.roomNumber = doorNumCounter;
                            if(currRoom.roomNumber < 3)
                                queue.add(currRoom);
                        }

                        if (currRoom.left != null && currRoom.left.roomNumber == 0) {
                            currRoom.left.roomNumber = doorNumCounter;
                            if(currRoom.roomNumber < 3)
                                queue.add(currRoom);
                        }

                        if (currRoom.right != null && currRoom.right.roomNumber == 0) {
                            currRoom.right.roomNumber = doorNumCounter;
                            if(currRoom.roomNumber < 3)
                                queue.add(currRoom);
                        }

                        if (currRoom.bottom != null && currRoom.bottom.roomNumber == 0) {
                            currRoom.bottom.roomNumber = doorNumCounter;
                            if(currRoom.roomNumber < 3)
                                queue.add(currRoom);
                        }

                    } while(true);
                }
            }
        }
    }

    private static class Room {
        int roomNumber;
        Room top;
        Room left;
        Room right;
        Room bottom;

        Room () {
            this.roomNumber = 0;
            this.top = null;
            this.left = null;
            this.right = null;
            this.bottom = null;
        }
    }

}
