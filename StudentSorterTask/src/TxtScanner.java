import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *   This class is for reading .txt files. It will obtain text of lines and store it in the List. It was taken from:
 *   https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
 *   https://www.jigsawacademy.com/blogs/java/scanner-class-in-java/
 * */

public class TxtScanner {

    Scanner _fileScanner;
    List<String> _ListOfObtainedTxtLines = new ArrayList<String>();
    String _ScannedInfo;
    public TxtScanner() {

    }

    /*
    *  This function will be used to read any information given via path
    * */
    public List<String> ReadFile(String pPath){

        //Declare instanced variables


        //Test if given path exists and if it is readable
        if(TestIfPathExists(pPath)){
            _fileScanner = new Scanner(pPath);
            try{
                //For testing purposes don't give pattern to run it every single time
                while (_fileScanner.hasNext()) {
                    // check if the scanner has a token
                    System.out.println("" + _fileScanner.hasNext());

                    _ScannedInfo = "" + _fileScanner.nextLine();
                    _ListOfObtainedTxtLines.add(_ScannedInfo);

                    System.out.println(_ScannedInfo);
                }
            }
            catch (Exception e){
                System.out.println("Error with reading files via TxtScanner" + _ScannedInfo);
            }
            //Close this scanner instance after use
            _fileScanner.close();
        }


        return _ListOfObtainedTxtLines;
    }

    /*
    * This function will be used to broadcast given paths state and return an answer for further processing
    * */
    public boolean TestIfPathExists(String pPath){

        //Declare instanced variables
        boolean _DoesThisPathExist = false;
        boolean _IsThisFileReadable = false;
        Boolean _IsThisFileProceedable = false;
        String _ErrorMessage;

        File myFile = new File(pPath);
        if(myFile.exists()){
            _DoesThisPathExist = true;
        }
        if(myFile.canRead()){
            _IsThisFileReadable = true;
        }
        if(_DoesThisPathExist == true && _IsThisFileReadable  == true){
            _IsThisFileProceedable = true;
            _ErrorMessage = "Everything is ok";
        }
        else if (_DoesThisPathExist == false && _IsThisFileReadable  == true){
            _IsThisFileProceedable = false;
            _ErrorMessage = "This Path doesn't exist";
        } else if (_DoesThisPathExist == true && _IsThisFileReadable  == false) {
            _IsThisFileProceedable = false;
            _ErrorMessage = "This File is not readable";
        } else {
            _IsThisFileProceedable = false;
            _ErrorMessage = "Everything is not readable and/or doesn't exist";
        }
        System.out.println(_ErrorMessage);

        //Return result
        return _IsThisFileProceedable;
    }
}