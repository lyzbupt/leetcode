class SnakeGame {

    /** Initialize your data structure here.
        @param width - screen width
        @param height - screen height 
        @param food - A list of food positions
        E.g food = [[1,1], [1,0]] means the first food is positioned at [1,1], the second is at [1,0]. */
    Set<Integer> bodySet;
    Queue<Integer> body;
    int score;
    int[][] food;
    int foodIndex;
    int width;
    int height;
    int rowHead;
    int colHead;

    public SnakeGame(int width, int height, int[][] food) {
        this.width = width;
        this.height = height;
        this.food = food;
        foodIndex = 0;
        bodySet = new HashSet<Integer>();
        score = 0;
        body = new LinkedList<>();
        body.offer(0);
        bodySet.add(0);
    }
    
    /** Moves the snake.
        @param direction - 'U' = Up, 'L' = Left, 'R' = Right, 'D' = Down 
        @return The game's score after the move. Return -1 if game over. 
        Game over when snake crosses the screen boundary or bites its body. */
    public int move(String direction) {
        //int rowHead = body.peek() / width;
        //int colHead = body.peek() % width;
        switch(direction){
            case "U" : rowHead--;
                        break;
            case "D" : rowHead++;
                        break;
            case "L" : colHead--;
                        break;
            default : colHead++;
        }
        //System.out.println(" " + rowHead + " " + colHead);
        int head = rowHead * width + colHead;
        if(rowHead < 0 || rowHead == height || colHead < 0 || colHead == width)
            return -1;
        bodySet.remove(body.peek());
        if(bodySet.contains(head)) return -1;

        bodySet.add(head);
        body.offer(head);

        if(foodIndex < food.length && rowHead == food[foodIndex][0] && colHead == food[foodIndex][1]){
            //System.out.println(foodIndex + " " + food[foodIndex][0] + " "+food[foodIndex][1] + " " + rowHead + " " + colHead);
            bodySet.add(body.peek());
            foodIndex++;
            score++;
            return score;
        }
        else{
             body.poll();
        }
        return score;
       
    }
}

/**
 * Your SnakeGame object will be instantiated and called as such:
 * SnakeGame obj = new SnakeGame(width, height, food);
 * int param_1 = obj.move(direction);
 */
