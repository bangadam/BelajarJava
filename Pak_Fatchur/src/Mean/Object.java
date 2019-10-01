package Mean;

public class Object {
    private int [] bilangan;
    private int [] urut;
    private double median;

    public int[] getBilangan() {
        return bilangan;
    }

    public void setBilangan(int[] bilangan) {
        this.bilangan = bilangan;
    }

    public int[] getUrut() {
        return urut;
    }

    public void setUrut(int[] bilangan) {
        int temp = 0;
        for (int i = (bilangan.length-1); i>0; i--){
            for (int j = 0; j<bilangan.length; j++){
                if (bilangan[j-1]>bilangan[j]){
                    temp = bilangan[j-1];
                    bilangan[j-1] = bilangan[j];
                    bilangan[j] = temp;
                    this.urut = bilangan;
                }
            }

        }
    }

    public double getMedian() {
        return median;
    }

    public void setMedian (int[] bilangan){
        int bil = bilangan.length;
        for (int i = 0; i < bil; i++){
            if (i+0.5 == (double)bil/2){
                this.median = bilangan[i];
            }
            if (i+1 == bil/2) {
                double med = (double) (bilangan[i]+bilangan[i+1])/2;
                this.median = med ;
            }
        }
    }

    public void tampil(int[] bilangan){
        for(int i=0; i<bilangan.length; i++){
            if (i<bilangan.length-1){
                System.out.print(bilangan[i]+", ");
            } else {
                System.out.print(bilangan[i]);
            }
        }
        System.out.println("");
    }

    public void tampil(int a){
        System.out.println(a);
    }

    public void tampil (double a){
        System.out.println(a);
    }
}
