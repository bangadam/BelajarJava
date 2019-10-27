//package UTSTeori;
//
//public class penilaianinna extends datainna {
//    private String[] tampilLju;
//
//
//    public String[] getTampilLju() {
//        return tampilLju;
//    }
//
//    public void setTampilLju(String[] peserta, String[][] LJU) {
//        tampilLju = new String[peserta.length];
//        String muncul = "";
//        for (int i = 0; i <peserta.length ; i++) {
//            muncul = peserta[i] + "\t";
//            for (int j = 0; j < LJU.length ; j++) {
//                for (int k = 0; k < LJU[i].length; k++) {
//                    if (LJU[j][k].equals("")){
//                        muncul = "-";
//                    }else (LJU[j][k].equals(LJU[j][k])){
//
//                    }
//                }
//            }
//        }
//    }
//
//    protected void cetak(String a){
//        System.out.print(a);
//    }
//    protected void cetak(String[] a){
//        for (int i=0; i <a.length; i++){
//            cetak(a[i] + " ");
//        }
//    }
//    protected void cetak(String[][] a){
//        for (int i = 0; i<a.length; i++ ){
//            for (int j = 0; j <a[i].length ; j++) {
//                cetak(a[i][j] + " ");
//            }
//            cetak("\n");
//        }
//    }
//
//}
