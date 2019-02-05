import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LineTest {

    @Test
    void first_cola_in_first_round() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 1;
        assertThat(Line.WhoIsNext(names, n)).isEqualTo("Sheldon");
    }

    @Test
    void first_cola_after_first_round() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 6;
        assertThat(Line.WhoIsNext(names, n)).isEqualTo("Sheldon");
    }

    @Test
    void second_cola_after_first_round() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 7;
        assertThat(Line.WhoIsNext(names, n)).isEqualTo("Sheldon");
    }

    @Test
    void ninth_cola_after_second_round() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 24;
        assertThat(Line.WhoIsNext(names, n)).isEqualTo("Penny");
    }

    @Test
    void seventeenth_cola_after_third_round() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 52;
        assertThat(Line.WhoIsNext(names, n)).isEqualTo("Penny");
    }

    @Test
    void very_high_number_of_cola() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 922080590;
        assertThat(Line.WhoIsNext(names, n)).isEqualTo("Leonard");
    }

}
