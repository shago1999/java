import java.io.*;

public class cities {
    
    public static void main(String[] args) {
        String city[]=new String[5];
        int i , j ;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(i=1;i<=5;i++){
                System.out.println("enter the "+(i)+"city");
                city[i]=br.readLine();
		
            }
            System.out.println("-*-*-*-*-*-*-*-Descending order of cities-*-*-*-*-*-*-*");
            for(i=0;i<5;i++){
                for(j=i+1;j<5;j++){
                    if((city[i].compareTo(city[j]))>0){
                        String temp=city[i];
                        city[i]=city[j];
                        city[j]=temp;
                    }
                }
            }
            for(i=4;i>=0;i--){
                System.out.println(city[i]);
            }
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }
        catch(Exception e){}
    }
}
