public class Radio {
    private int soundVolume;

    private int numberStation;
    private int quantityStation = 10;
    private int minStation;
    private int maxStation = 9;


    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
        maxStation = quantityStation - 1;
    }

    public Radio() {

    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getNumberStation() {
        return numberStation;
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

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < minStation) {
            return;
        }
        if (newNumberStation > maxStation) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void next() {
        int target = numberStation + 1;
        if (target > maxStation) {
            setNumberStation(minStation);
        }
        setNumberStation(target);
    }

    public void prev() {
        int target = numberStation - 1;
        if (target < minStation) {
            setNumberStation(maxStation);
        }
        setNumberStation(target);
    }

}
