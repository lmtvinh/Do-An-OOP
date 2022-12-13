package DoAnOOP.Help;

public class HoTro {
    // Chay duoc tren VS Code
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String duongDanTuongDoi = System.getProperty("user.dir")+"\\data\\";
    // Khong chay duoc tren Intellij
    // public static void click(int x, int y) throws AWTException {
    //     Robot bot = new Robot();
    //     bot.mouseMove(x, y);
    //     bot.mousePress(InputEvent.BUTTON1_MASK);
    //     bot.mouseRelease(InputEvent.BUTTON1_MASK);
    // }

    public static String dirPath = System.getProperty("user.dir") + "\\data\\";

}
