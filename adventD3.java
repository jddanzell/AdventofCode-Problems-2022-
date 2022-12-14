import java.util.ArrayList;


/* 
 * 
 * 
 * 00100
 * 11110
 * 10110
 * 10111
 * 10101
 * 01111
 * 00111
 * 11100
 * 10000
 * 11001
 * 00010
 * 01010
 * Read all the arrays, push each value into a unique stack, compare frequency of stack 1 0, save it as first # in new array, pop off stack, compare next, at the end
 * save that array then create new array with each value switched
 * 
 * 
*/

public class adventD3 {
    public static void main(String[] args) {                         // main method

        int finalNumber = 0;

        ArrayList<Integer> finalBinary = new ArrayList<Integer>();

        ArrayList<Integer> binaries = new ArrayList<Integer>();      // creates an ArrayList to store the given Binary Values
        binaries.add(1001001); //64
        binaries.add(1111101); 
        binaries.add(1101101);
        binaries.add(1101111);
        binaries.add(1101011);
        binaries.add(1011111); //585
        binaries.add(1001111); //73
        binaries.add(1111001);
        binaries.add(1100001);
        binaries.add(1110011);
        binaries.add(1000101); //8
        binaries.add(1010101); //520

        
        System.out.println(binaries);
        
        System.out.println(frequencyCounter(binaries, finalBinary));

        System.out.println(finalBinary);


       

    }

    public static int frequencyCounter(ArrayList<Integer> binaries, ArrayList<Integer> finalBinary) {

                int oneCounter = 0;
                int zeroCounter = 0;

                int totalOneCounter = 0;
                int totalZeroCounter = 0;

                int substringOne = 1;
                int substringTwo = 2;

                int firstDigit = 0;
                int finalCounter = 0;




                for (int i = 1; i < 6; i++) {

                    for (int j = 0; j < binaries.size(); j++) {
          
                        int numberPassedIn = binaries.get(j);
    
                        firstDigit = Integer.parseInt(Integer.toString(numberPassedIn).substring(substringOne, substringTwo));
                                  
                        if (firstDigit == 1) {
                            oneCounter++;
                        } else {
                            zeroCounter++;
                        }                  
            
                    }

                    if (oneCounter > zeroCounter) {
                        totalOneCounter++;
                        finalBinary.add(1);
                    }
                    
                    else {
                        totalZeroCounter++;
                        finalBinary.add(0);

                    }
                    
                    substringOne++;
                    substringTwo++;

                    oneCounter = 0;
                    zeroCounter = 0;

                }

           return totalOneCounter;
    }


    
}





