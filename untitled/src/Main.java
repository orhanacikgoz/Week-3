public class Main {
    public static void main(String[] args) {

        int [] dizi =new int[]{100, 50, 200, 400, 20, 60, 10, 90, 300, 200};
        int min=dizi[0];
        int max=dizi[0];
        int bakiye=100;
        for (int i=0; i< dizi.length; i++)
            if (dizi[i]<min){
                min=dizi[i];
                if (dizi[i]>max){
                    max=dizi[i];
                }
            }

        for(int i=0; i<=dizi.length; i++){
            if (i<dizi[i-1])


        }


//
//        int alinanadet=bakiye/min;
//        int satilanadet=(max-min)*alinanadet;
//        int sonbakiye=satilanadet-bakiye;
//        System.out.println("Toplam kar edilen tutar: " + sonbakiye);














        }}






