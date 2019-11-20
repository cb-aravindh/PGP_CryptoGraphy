package keystore_based;

import com.didisoft.pgp.KeyPairInformation;
import com.didisoft.pgp.KeyStore;

public class KeyStores {
    public static void main(String[] args) throws Exception{


        //keystore location and password for keystore..!
        KeyStore keyStore = new KeyStore("/Users/cb-aravind/Downloads/shop.keystore","madmax");

        // import public key in keystore..!
        keyStore.importKey("/Users/cb-aravind/Downloads/0x3E113F7D-pub.asc");

        KeyPairInformation[] keys = keyStore.getKeys();

        //List the keys in keyStore
        for (int i=0; i < keys.length; i++) {
            KeyPairInformation pair = keys[i];
            System.out.print(pair.getAlgorithm());
            System.out.print(pair.getKeySize());
            System.out.print(pair.getKeyIDHex());
            for (int j=0; j < pair.getUserIDs().length; j++) {
                System.out.print(pair.getUserIDs()[j]);
            }
            System.out.println();
        }

        //Count of keys in keyStore..!
        System.out.println(keys.length);

    }
}
