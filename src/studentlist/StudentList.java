
package studentlist;

import java.util.Scanner;

/**
 * This class +++ Insert descripsion here +++
 * @author Quang Dang
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        Student [] sList=new Student [3];//declaration of array of objets.
        Scanner input=new Scanner(System.in);
        
        for(int i=0; i<=sList.length-1;i++)
        {
            System.out.println("Enter student name: ");
            sList[i].setName(input.nextLine());
            
        }
        
        for(int i = 0;i<=sList.length-1; i++);
       
    }

}
