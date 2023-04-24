import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(12);

    @Test
    public void testDefaultConstructor() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getNumberStation());
        Assertions.assertEquals(10, radio.getQuantityStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void testGetQuantityStation() {
        int expected = radio.getQuantityStation() - 1;
        Assertions.assertEquals(expected, radio.getMaxStation());
    }

    @Test
    public void shouldSetSoundVolume() {
        radio.setSoundVolume(30);

        Assertions.assertEquals(30, radio.getSoundVolume());
    }

    @Test
    public void shouldIncreaseSoundVolume() {
        radio.setSoundVolume(10);
        radio.increaseSoundVolume();

        Assertions.assertEquals(11, radio.getSoundVolume());
    }

    @Test
    public void shouldNotIncreaseSoundVolumeAboveMax() {
        radio.setSoundVolume(100);
        radio.increaseSoundVolume();

        Assertions.assertEquals(100, radio.getSoundVolume());
    }

    @Test
    public void shouldReductionSoundVolume() {
        radio.setSoundVolume(55);
        radio.reductionSoundVolume();

        Assertions.assertEquals(54, radio.getSoundVolume());
    }

    @Test
    public void shouldNotReductionSoundBelowMin() {
        radio.setSoundVolume(radio.getMinStation());
        radio.reductionSoundVolume();

        Assertions.assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void shouldSetNumberStation() {
        radio.setNumberStation(1);

        Assertions.assertEquals(1, radio.getNumberStation());
    }

    @Test
    public void testNextThanNumberStationMax() {
        radio.setNumberStation(radio.getMaxStation());
        radio.next();

        Assertions.assertEquals(radio.getMinStation(), radio.getNumberStation());
    }

    @Test
    public void testNextThanNumberStationNotMax() {
        radio.setNumberStation(0);
        radio.next();

        Assertions.assertEquals(1, radio.getNumberStation());
    }

    @Test
    public void testPrevThanNumberStationMin() {
        radio.setNumberStation(0);
        radio.prev();

        Assertions.assertEquals(radio.getMaxStation(), radio.getNumberStation());
    }

    @Test
    public void testPrevThanNumberStationNotMin() {
        radio.setNumberStation(1);
        radio.prev();

        Assertions.assertEquals(0, radio.getNumberStation());
    }

    @Test
    public void shouldNotSetNumberStationAboveMax() {
        radio.setNumberStation(radio.getMaxStation() + 1);

        Assertions.assertEquals(radio.getMinStation(), radio.getNumberStation());
    }

    @Test
    public void shouldNotSetNumberStationBelowMin() {
        radio.setNumberStation(radio.getMinStation() - 1);

        Assertions.assertEquals(radio.getMinStation(), radio.getNumberStation());
    }
}