package File_based;

import com.didisoft.pgp.PGPLib;

public class Decryption {
    public static void main(String[] args) throws Exception{
        // initialize the library instance
        PGPLib pgp = new PGPLib();

        String privateKeyFile = "/Users/cb-aravind/Downloads/0x3E113F7D-sec.asc";
        String privateKeyPass = "madmax";

        // The decrypt method returns the original name of the file
        // that was encrypted. We can use it afterwards,
        // to rename OUTPUT.txt.
        String originalFileName = pgp.decryptFile("/Users/cb-aravind/Documents/keys/Bob/output.pgp",
                privateKeyFile,
                privateKeyPass,
                "/Users/cb-aravind/Documents/keys/Bob/output.txt");
    }
}