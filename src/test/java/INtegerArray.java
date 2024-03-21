import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class INtegerArray {
    public static void main(String[] args) {
     int a[] ={  1, 2, 7, 4, 3, 4, 5, 6, 7, 8, 9, 3, 4, 2, 7, 5, 6};
     int sum=0;
     boolean threeFlag = true;
     boolean sevenFlag = false;

     for(int i=0;i<a.length;i++)
     {
         if(a[i]==3)
         {
             threeFlag= false;
         }
         else if(a[i]==7)
         {
             threeFlag=true;
         }
         if(threeFlag) {
             sum = sum + a[i];
         }
     }
        System.out.println(sum);
    }
}
