
package project2;

import java.io.IOException; //Signals that an I/O exception of some sort has occurred. This class is the general class of exceptions produced by failed or interrupted I/O operations.
 

public class CoordinatorProcess {

    public static void main(String[] args) throws IOException {

        ProcessClass coord = new ProcessClass(5454);
        coord.setIsCoordinator(true); // We've just appointed a coordinator who will oversee the whole project
        coord.run(); // run the Co-ordinator

    }

}