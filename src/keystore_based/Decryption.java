package keystore_based;

import com.didisoft.pgp.KeyStore;
import com.didisoft.pgp.PGPLib;

public class Decryption {

    public static void main(String[] args) throws Exception{


        KeyStore keyStore = new KeyStore("/Users/cb-aravind/Downloads/shop.keystore", "madmax");

        PGPLib pgp = new PGPLib();


        String originalFileName = pgp.decryptFile("/Users/cb-aravind/Documents/keys/Bob/output.pgp",
                keyStore,
                "madmax",
                "/Users/cb-aravind/Documents/keys/Bob/output.txt");
    }
}
