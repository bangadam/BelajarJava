package Modul_3;

public class DataArray {
    int data[];
    int cekIndex[] = new int[5];
    double rata;
    int max, min;

    public DataArray(int[] data) {
        this.data = data;
    }

    public double getRata() {
        return rata;
    }

    public void setRata() {
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            temp += data[i];
        }

        this.rata = temp / data.length;
    }

    public int getMax() {
        return max;
    }

    public void setMax() {
        this.max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] <  max) {
                this.max = data[i];
            }
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin() {
        this.min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] >  min) {
                this.min = data[i];
            }
        }
    }

    public int[] getCekIndex() {
        return cekIndex;
    }

    public void setCekIndex(int value) {
        int i;
        for (i = 0; i < data.length; i++) {
            if (data[i] == value) {
                this.cekIndex[i] = i;
            }
        }
    }
}
