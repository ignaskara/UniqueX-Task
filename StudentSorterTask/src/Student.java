/*
 * This Class is a Student object. It will have grades and a name and will basically do nothing for now.
 * Created by Ignas Karaliunas
 * Creation date: 2022/06/12
 */

import java.security.PublicKey;

public class Student implements IStudent{

    //Declare variables
    private String _Name;
    private Integer _Grade;

    //Create a constructor
    public Student(String pName, Integer pGrade){
        //Set given values to local variables
        _Name = pName;
        _Grade = pGrade;
    }/*
     *   This class is for reading .txt files. It was taken from:
     *   https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
     * */
}
