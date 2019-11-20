package keystore_based;

import com.didisoft.pgp.KeyStore;
import com.didisoft.pgp.PGPLib;

public class Encryption {
    public static void main(String[] args) throws Exception{

        KeyStore keyStore = new KeyStore("/Users/cb-aravind/Downloads/shop.keystore", "madmax");

        PGPLib pgp = new PGPLib();

        String recipientUserId = "aravinddhiva@gmail.com";


        boolean asciiArmor = true;

        boolean withIntegrityCheck = false;

        pgp.encryptFile("/Users/cb-aravind/Documents/keys/Alan/input.txt",
                keyStore,
                recipientUserId,
                "/Users/cb-aravind/Documents/keys/Bob/output.pgp",
                asciiArmor,
                withIntegrityCheck);
    }
}
