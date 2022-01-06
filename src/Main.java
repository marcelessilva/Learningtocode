import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

        public static void main(String[] args) throws IOException {
            String dir = "C:\\Users\\marcy\\Downloads\\Dragon Ball Z - Completo [Trial-Audio][ Subs][HD][720p] BrRip\\9ª Temporada [Season 9]";
            Files.newDirectoryStream(Paths.get(dir))
                    .forEach(filename -> {
                        String path = filename.getFileName().toString();
                        File f = new File(dir+File.separator+path);
                        String finalName = dir+File.separator+path.substring(0, 13) + ".mkv";
                        f.renameTo(new File(finalName));
                    });
        }

}
