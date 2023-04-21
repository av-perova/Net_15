public class Radio {
    private int soundVolume;
    private int numberStation;

    public int getSoundVolume() {
        return soundVolume;
    }
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseSoundVolume() {
        int target = soundVolume + 1;
        setSoundVolume(target);
    }

    public void reductionSoundVolume() {
        int target = soundVolume - 1;
        setSoundVolume(target);
    }

    public int getNumberStation(){
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation > 9) {
            return;
        }
        numberStation = newNumberStation;
    }
    public void next() {
        int target = numberStation + 1;
        if (target > 9) {
            setNumberStation(0);
        }
        setNumberStation(target);
    }

    public void prev() {
        int target = numberStation - 1;
        if (target < 0) {
            setNumberStation(9);
        }
        setNumberStation(target);
    }

}
