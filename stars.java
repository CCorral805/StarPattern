import java.util.Scanner;
public class stars{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    while (true) {     // remove comment to run consecutively(will use a considerable amount of resources)
    
    System.out.print("Input the number of lines to be printed: ");
    int rows = sc.nextInt();
    if(rows%2==0){         //Decide if there is one or two lines with the max # of stars
      for(int i = 1; i <= rows; i++){  //i=line number, j = #stars in one line
        if(i>rows/2){ //decreasing # of stars
          for (int j = 0 ; j < rows+1-i ; j++){ // number of stars = rows + 1 - line number
            System.out.print("*");
          }  
          System.out.println("");
          } else { //increasing # of stars, #stars=line number
          for (int j = 0 ; j < i ; j++){
            System.out.print("*");
          }  
          System.out.println("");
        }
      }
    }else{
      for(int i = 1; i <= rows; i++){
        if(i>rows/2){ //decreasing # of stars
          for (int j = 0 ; j < rows+1-i ; j++){ // number of stars = rows + 1 - line number
            System.out.print("*");
          }  
          System.out.println("");
          } else { //increasing # of stars, #stars=line number
          for (int j = 0 ; j < i ; j++){
            System.out.print("*");
          }  
          System.out.println("");
        }
      }
    }
    rows = 0;

  }

  }
}