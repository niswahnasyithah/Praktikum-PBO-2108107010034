/*program menampilkan bilangan genap dan bukan kelipatan 6 dari 1-20  */
public class soal5 
{
  public static void main(String args[]){
    System.out.println("Deret Bilangan Genap yang bukan kelipatan 6");
        for(int i=1;i<=20;i++){
            if (i%2==0 && i%6!=0)
            System.out.print(i+" ");
       
       }
  }
}