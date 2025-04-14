package ProblemSet1B.Question4;

import java.math.BigInteger;

public class Server {
    // DO NOT CHANGE THIS PART OF THE CODE ======================
    private final int[] publicKey = new int[2];
    private final int[] privateKey = new int[2];
    private int p;
    private int q;


    /////////////////////////////
    // Mutuator/setter methods //
    /////////////////////////////
    public void setP(int p) {
        this.p = p;
    }

    public void setQ(int q) {
        this.q = q;
    }


    /////////////////////////////
    // Accessor/getter methods //
    /////////////////////////////
    public int[] getPublicKey() {
        return publicKey;
    }

    public int[] getPrivateKey() {
        return privateKey;
    }


    //////////////////////
    // Instance Methods //
    //////////////////////
    private int computeModInverse(int e, int lambda) {
        for (int d=1; d<lambda; d++) {
            if ( ((e%lambda)*(d%lambda))%lambda==1 ) {
                return d;
            }
        }
        return 1;
    }
    private int computeE(int lambda) {
        for (int i=lambda-1; i>2; i-- ) {
            if (lambda%i!=0 && isPrime(i)) {
                return i;
            }
        }
        return 0;
    }
    private boolean isPrime(int a) {
        for (int i = 2; i<a/2; i++) {
            if (a%i==0) {
                return false;
            }
        }
        return true;
    }
    // =========================================

    // Start your answer from here onwards
    public void generatePublicPrivateKey() {
        // TODO 1: Compute modulus n
        int n = Math.abs(this.p * this.q);

        // TODO 2: Compute lambda λ
        int lambda = lcm(this.p-1, this.q-1);

        // TODO 3: Compute e
        int e = computeE(lambda);

        // TODO 4: Compute d
        int d = computeModInverse(e, lambda);

        // TODO 5: Set (n,e) as the public key
        publicKey[0] = n;
        publicKey[1] = e;

        // TODO 6: Sset (n,d) as the private key
        privateKey[0] = n;
        privateKey[1] = d;
    }

    public String decryptMessage(BigInteger[] encryptedIntMessage) {
        BigInteger[] decryptedIntMessage = new BigInteger[encryptedIntMessage.length];
        StringBuilder decryptedMessage = new StringBuilder();

        // Hint:
        // 1. Decrypt each character of the message. Use .modPow from BigInteger
        for (int i=0; i<encryptedIntMessage.length; i++) {
            decryptedIntMessage[i] = encryptedIntMessage[i].modPow(BigInteger.valueOf(privateKey[1]), BigInteger.valueOf(privateKey[0]));

            // 2. Decrypted character is an ASCII value (integer). Convert to char
            char decryptedChar = (char) decryptedIntMessage[i].intValue();

            // 3. Concatenate characters into string
            decryptedMessage.append(decryptedChar);
        }

        // 4. Return the decrypted string message
        return decryptedMessage.toString();
    }

    private int lcm(int a, int b) {

            int lcm = (int) (Math.abs(a*b) / gcd(a, b));

            // Return the least common multiple of a and b
            return lcm;
    }

    private int gcd(int a, int b) {

        // Return the greatest common divisor of a and b
        return (b == 0) ? a : gcd(b, a % b);
    }
}

