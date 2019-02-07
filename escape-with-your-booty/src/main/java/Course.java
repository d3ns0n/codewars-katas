import java.util.ArrayList;
import java.util.List;

public class Course {

    private static PirateShip pirateShip;
    private static List<NavyShip> navyShips;

    public static boolean checkCourse(char[][] map) {
        processMap(map);
        while (true) {
            if (pirateShipIsCaught()) {
                return false;
            }
            if (pirateShipIsHome(map)) {
                return true;
            }
            simulateNextStep(map);
        }
    }

    private static void processMap(char[][] map) {
        pirateShip = null;
        navyShips = new ArrayList<>();

        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[0].length; x++) {
                if (map[y][x] == 'X') {
                    pirateShip = new PirateShip(x, y);
                }
                if (map[y][x] == 'N') {
                    if (y == 0) {
                        navyShips.add(new NavyShip(x, y, 1));
                    } else {
                        navyShips.add(new NavyShip(x, y, -1));
                    }
                }
            }
        }
    }

    private static boolean pirateShipIsHome(char[][] map) {
        return pirateShip.x == map[0].length - 1;
    }

    private static boolean pirateShipIsCaught() {
        for (NavyShip navyShip : navyShips) {
            if (Math.abs(navyShip.x - pirateShip.x) <= 1 && Math.abs(navyShip.y - pirateShip.y) <= 1) {
                return true;
            }
        }

        return false;
    }

    private static void simulateNextStep(char[][] map) {
        pirateShip.x += 1;
        navyShips.forEach(navyShip -> {
            navyShip.y += navyShip.yDirection;
            if (navyShip.y == 0 || navyShip.y == map.length - 1) {
                navyShip.yDirection *= -1;
            }
        });
    }

    private static class NavyShip {
        private int x;
        private int y;
        private int yDirection;

        NavyShip(int x, int y, int yDirection) {
            this.x = x;
            this.y = y;
            this.yDirection = yDirection;
        }

    }

    private static class PirateShip {
        private int x;
        private int y;

        PirateShip(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
