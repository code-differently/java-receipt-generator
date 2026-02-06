package org.codedifferently;

import java.util.Random;

public class CodeGenerator {
    Random random = new Random();

    public int idNumber(){
        return random.nextInt(500);
    }

    public int receiptCode() {
        return random.nextInt(100000);
    }

}
