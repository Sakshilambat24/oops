package Array;

public class paperarray {
        public static void main(String[] args) {
            int[] processArray={200,6,36,612,121,66,63,39,661,106,-1};
            int[] resultArray=new int[processArray.length];
            int j=0;

            for (int i=0;i< processArray.length-1;)
            {
                if (processArray[i]<=100) {
                    while(processArray[i]<=100 && processArray[i]>=0)
                    {
                        resultArray[j]+=processArray[i];
                        i++;
                    }
                }
                else {
                    resultArray[j]=processArray[i];
                    i++;
                }


                j++;
            }
            System.out.println("===================");
            for (int i=0;i< resultArray.length;i++) {
                if (resultArray[i] == 0) {

                }else {
                    System.out.println(resultArray[i]);


                }
            }
        }
}


