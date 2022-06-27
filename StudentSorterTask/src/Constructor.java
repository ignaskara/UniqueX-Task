/*
 * This Class is a Constructor object. It will be responsible for instantiating application.
 * Created by Ignas Karaliunas
 * Creation date: 2022/06/12
 */

import java.util.ArrayList;
import java.util.List;


public class Constructor implements IConstructor{

    //Declare variables:
    List<String> _ListOfStudents = new ArrayList<String>();

    public Constructor(){
        //Instantiate application
        Instantiate();
    }
    //This function
    public void Instantiate(){

        //Create a reader object and ask it to read RQD path
        TxtScanner _Reader = new TxtScanner();
        _ListOfStudents = _Reader.ReadFile("C:\\Students\\test.txt");

        //Print out information from the given path
        for(int i = 0; i < _ListOfStudents.size(); i++){
            System.out.println(_ListOfStudents.get(i));
            System.out.println("dada");
        }

    }
}
