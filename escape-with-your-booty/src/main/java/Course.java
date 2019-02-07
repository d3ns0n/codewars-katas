import java.util.ArrayList;
import java.util.List;

public class Course {

    public static boolean checkCourse(char[][] map) {
        World world = processMap(map);
        List<Ship> navyShips = world.navyShips;
        Ship pirateShip = world.pirateShip;

        for (int i = 0; i < world.width; i++) {
            if (pirateShip.isInRangeOf(navyShips)) {
                return false;
            }
            world.simulateNextTurn();
        }

        return true;
    }

    private static World processMap(char[][] map) {
        Ship pirateShip = null;
        List<Ship> navyShips = new ArrayList<>();
        int width = map[0].length;
        int height = map.length;

        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[0].length; x++) {
                if (map[y][x] == 'X') {
                    pirateShip = new Ship(0, y, 1, 0, width - 1, height - 1);
                }
                if (map[y][x] == 'N') {
                    if (y == 0) {
                        navyShips.add(new Ship(x, y, 0, 1, width - 1, height - 1));
                    } else {
                        navyShips.add(new Ship(x, y, 0, -1, width - 1, height - 1));
                    }
                }
            }
        }

        return new World(width, height, pirateShip, navyShips);
    }

    private static class World {
        int width;
        int height;
        Ship pirateShip;
        List<Ship> navyShips;

        World(int width, int height, Ship pirateShip, List<Ship> navyShips) {
            this.width = width;
            this.height = height;
            this.pirateShip = pirateShip;
            this.navyShips = navyShips;
        }

        private void simulateNextTurn() {
            pirateShip.move();
            for (Ship navyShip : navyShips) {
                navyShip.move();
            }
        }
    }

    private static class Ship {
        int x;
        int y;
        int dX;
        int dY;
        int maxX;
        int maxY;

        Ship(int x, int y, int dX, int dY, int maxX, int maxY) {
            this.x = x;
            this.y = y;
            this.dX = dX;
            this.dY = dY;
            this.maxX = maxX;
            this.maxY = maxY;
        }

        void move() {
            x += dX;
            y += dY;
            if (Math.abs(dY) == 1 && (y == 0 || y == maxY)) {
                dY *= -1;
            }
        }

        boolean isInRangeOf(List<Ship> otherShips) {
            return otherShips.stream().anyMatch(otherShip -> Math.abs(x - otherShip.x) <= 1 && Math.abs(y - otherShip.y) <= 1);
        }
    }

}
