import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetSoundVolume () {
        Radio radio = new Radio();

        radio.setSoundVolume(30);

        int expected = 30;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(10);

        radio.increaseSoundVolume();

        int expected = 11;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseSoundVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        radio.increaseSoundVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(55);

        radio.reductionSoundVolume();

        int expected = 54;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReductionSoundBelowMin() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.reductionSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation() {
        Radio radio = new Radio();

        radio.setNumberStation(5);

        int expected = 5;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextThanNumberStationMax() {
        Radio radio = new Radio();
        radio.setNumberStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testNextThanNumberStationNotMax() {
        Radio radio = new Radio();
        radio.setNumberStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevThanNumberStationMin() {
        Radio radio = new Radio();
        radio.setNumberStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevThanNumberStationNotMin() {
        Radio radio = new Radio();
        radio.setNumberStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberStationAbove9() {
        Radio radio = new Radio();

        radio.setNumberStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberStationBelow0() {
        Radio radio = new Radio();

        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected,actual);
    }
}
