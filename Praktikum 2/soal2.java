import java.util.Scanner;
/*program menentukan nilai huruf suatu mata kuliah  */
public class soal2
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int nilai;
        System.out.print("masukkan nilai: ");
        nilai=input.nextInt();

        if(nilai>=0 && nilai<41){
            System.out.println("Nilai Huruf: E");
        }
        else if(nilai>=41 && nilai<51){
            System.out.println("Nilai Huruf: D");
        }
        else if(nilai>=51 && nilai<60){
            System.out.println("Nilai Huruf: C");
        }
        else if(nilai>=60 && nilai<69){
            System.out.println("Nilai Huruf: BC");
        }
        else if(nilai>=69 && nilai<78){
            System.out.println("Nilai Huruf: B"); 
        }else if(nilai>=78 && nilai<87){
            System.out.println("Nilai Huruf: AB");
        }
        else if(nilai>=87 && nilai<=100){
            System.out.println("Nilai Huruf: A");
        }else{
            System.out.println("Invalid!");
        }
    }
} 