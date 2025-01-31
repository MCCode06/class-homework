//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Player player = new Player(50, 50, 30, 30, 5);
        player.moveDown();
        player.moveLeft();
        System.out.println("Player created at position: (" + player.getX() + ", " + player.getY() + ")");
        player.moveUp();
        player.moveRight();
        System.out.println("Player created at position: (" + player.getX() + ", " + player.getY() + ")");
        }
}
