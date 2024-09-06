package ru.netology.javaqa.radio;

public class Radio {
    private int fm;
    private int volume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }

    public int getFm() {
        return fm;
    }

    public void setFm(int fm) {
        if (fm < 0) {
            return;
        }
        if (fm > maxStation) {
            return;
        }
        this.fm = fm;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void next() {  //AboveMaxFm
        if (fm != maxStation) {
            fm++;
        } else {
            fm = 0;
        }
    }

    public void prev() {  //AboveMinFm
        if (fm != 0) {
            fm--;
        } else {
            fm = maxStation;
        }
    }


    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
        if (volume == 100) {
            volume = 100;
        }
    }

    public void turnDownVolume() {
        if (volume != 0) {
            volume--;
        }
        if (volume == 0) {
            volume = 0;
        }

    }

}
