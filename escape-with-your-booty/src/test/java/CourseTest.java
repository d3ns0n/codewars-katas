import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CourseTest {

    @Test
    void good_course1() {
        char[][] map = new char[5][6];
        map[0] = new char[]{'0', 'N', '0', '0', '0', '0'};
        map[1] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[2] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[3] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[4] = new char[]{'X', '0', '0', '0', '0', '0'};

        assertThat(Course.checkCourse(map)).isTrue();
    }

    @Test
    void good_course2() {
        char[][] map = new char[5][6];
        map[0] = new char[]{'X', '0', '0', '0', '0', '0'};
        map[1] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[2] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[3] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[4] = new char[]{'0', 'N', '0', '0', '0', '0'};

        assertThat(Course.checkCourse(map)).isTrue();
    }

    @Test
    void bad_course1() {
        char[][] map = new char[5][6];
        map[0] = new char[]{'0', '0', '0', '0', 'N', '0'};
        map[1] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[2] = new char[]{'X', '0', '0', '0', '0', '0'};
        map[3] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[4] = new char[]{'0', '0', '0', '0', '0', '0'};

        assertThat(Course.checkCourse(map)).isFalse();
    }

    @Test
    void bad_course2() {
        char[][] map = new char[5][6];
        map[0] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[1] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[2] = new char[]{'X', '0', '0', '0', '0', '0'};
        map[3] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[4] = new char[]{'0', '0', 'N', '0', '0', '0'};

        assertThat(Course.checkCourse(map)).isFalse();
    }

    @Test
    void navy_ship_next_to_pirate_ship_at_start() {
        char[][] map = new char[5][6];
        map[0] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[1] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[2] = new char[]{'X', '0', '0', '0', '0', '0'};
        map[3] = new char[]{'0', 'N', '0', '0', '0', '0'};
        map[4] = new char[]{'0', '0', '0', '0', '0', '0'};

        assertThat(Course.checkCourse(map)).isFalse();
    }

    @Test
    void navy_ship_next_to_pirate_ship_at_end() {
        char[][] map = new char[7][6];
        map[0] = new char[]{'X', '0', '0', '0', '0', '0'};
        map[1] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[2] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[3] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[4] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[5] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[6] = new char[]{'0', '0', '0', '0', 'N', '0'};

        assertThat(Course.checkCourse(map)).isFalse();
    }

    @Test
    void no_navy_ships() {
        char[][] map = new char[5][6];
        map[0] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[1] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[2] = new char[]{'X', '0', '0', '0', '0', '0'};
        map[3] = new char[]{'0', '0', '0', '0', '0', '0'};
        map[4] = new char[]{'0', '0', '0', '0', '0', '0'};

        assertThat(Course.checkCourse(map)).isTrue();
    }

}

