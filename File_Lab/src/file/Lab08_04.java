package file;

import java.io.*;
import java.util.*;

public class Lab08_04 {

	public static void main(String[] args) {
		List[] lists = new List[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int maxSize = random.nextInt(10) + 1;
            lists[i] = new List(maxSize);

            for (int j = 0; j < maxSize; j++) {
                int data = random.nextInt(100);
                lists[i].push(data);
            }

            lists[i].display();
        }

        try {
            FileOutputStream fileOut = new FileOutputStream("Lab08_04.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for (int i = 0; i < 5; i++) {
                out.writeObject(lists[i]);
            }
            out.close();
            fileOut.close();
            System.out.println("Lists saved to Lab08_04.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
