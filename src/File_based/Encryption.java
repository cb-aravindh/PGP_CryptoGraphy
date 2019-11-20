package File_based;

import com.didisoft.pgp.PGPLib;

public class Encryption {
    public static void main(String[] args) throws Exception{
        // create an instance of the library
        PGPLib pgp = new PGPLib();

        // is output ASCII or binary
        boolean asciiArmor = false;
        // should integrity check information be added
        // set to true for compatibility with GnuPG 2.2.8+
        boolean withIntegrityCheck = false;

        try {

            pgp.encryptFile("/Users/cb-aravind/Documents/keys/Alan/input.txt",
                    "/Users/cb-aravind/Downloads/0x3E113F7D-pub.asc",
                    "/Users/cb-aravind/Documents/keys/Bob/output.pgp",
                    asciiArmor,
                    withIntegrityCheck);
        }
        catch (com.didisoft.pgp.PGPException e){
            e.printStackTrace();
        }
    }
}