public class AngkaTerBesar {
    public static void main(String[] args) {
        int angka[] = {2,3,1,4,4,5,6,6};

        int max=angka[0];
        int count = 0;
      //  int result[] = {};
     //   int temp=0;
        for(int i=0;i < angka.length;i++){
            count = 0;
            int result = 0;
            for(int j=0;j<angka.length;j++){
                if(angka[i]==(angka[j])){
                    count += 1;
                }
                if(count > 1){
                    break;
                }
            }
            if(count == 1){

                result =  angka[i];
            }
            for(int k=0;k < angka.length;k++){
                if(result > max){
                    max = result;
                }
            }
        }
        System.out.println(max);

    }
}
