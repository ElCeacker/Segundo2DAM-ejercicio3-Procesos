import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException{

        try {
            File ruta = new File("./src/ficheroPrueba");
            final String path_bash = "D:\\Git\\git-bash.exe";

            if (ruta.exists()) {

                ProcessBuilder[] builders = {
                        new ProcessBuilder(path_bash, "-c", "cat ./src/ficheroPrueba | wc > ./src/resultadoPrueba.txt")
                };

                List<Process> procesos = ProcessBuilder.startPipeline(Arrays.asList(builders));

            } else {
                System.out.printf("El fichero no existe");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}