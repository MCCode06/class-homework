
public class Player {
    private int x, y;
    private int width, height;
    private final int speed;

    public Player(int x, int y, int width, int height, int speed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public void moveUp() {
        y -= speed;
    }

    public void moveDown() {
        y += speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}