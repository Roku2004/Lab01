package garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        try {
            String filename = "file.exe";
            byte[] inputBytes = {0};
            long startTime , endTime;

            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            StringBuffer outputStringBuffer = new StringBuffer();
            for(byte b : inputBytes){
                outputStringBuffer.append((char)b);
            }
            String outputString = outputStringBuffer.toString();
            endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        } catch (Exception e) {
            e.printStackTrace();
    }
}
}
