import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DirectionsReductionTest {

    @Test
    void no_opposite_directions() {
        assertThat(DirectionsReduction.dirReduc(new String[]{"NORTH", "EAST", "SOUTH", "WEST"}))
                .isEqualTo(new String[]{"NORTH", "EAST", "SOUTH", "WEST"});
    }

    @Test
    void should_remove_opposite_directions() {
        assertThat(DirectionsReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}))
                .isEqualTo(new String[]{"WEST"});
    }

    @Test
    void only_opposite_directions() {
        assertThat(DirectionsReduction.dirReduc(new String[]{"NORTH", "SOUTH", "EAST", "WEST"})).isEmpty();
    }

    @Test
    void complex_opposite_directions() {
        assertThat(DirectionsReduction.dirReduc(new String[]{"NORTH", "EAST", "WEST", "SOUTH"})).isEmpty();
    }

}
