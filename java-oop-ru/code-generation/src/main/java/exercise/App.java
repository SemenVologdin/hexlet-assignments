package exercise;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

// BEGIN
class App {
    public static void save( Path path, Car car ){
        try(FileWriter fileWriter = new FileWriter(path.toFile())) {
            fileWriter.write(car.serialize());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Car extract(Path path){
        try( FileReader fileReader = new FileReader(path.toFile()) ){
            Scanner scan = new Scanner(fileReader);
            return Car.unserialize(scan.nextLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
// END
