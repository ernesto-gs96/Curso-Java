import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

public class DirectoryExample {
    public static void main(String[] args) {

        // Crear directorio
        File directory = new File("newdir");
        directory.mkdir();

        // Crear directorio y subdirectorios
        File directory1 = new File("/path/to/directory/with/parents");
        directory1.mkdirs();

        // Listar archivos en directorio
        File[] files = new File("/path/to/directory").listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("File: " + file.getName());
            }
        }

        // Eliminar directorio
        File directory2 = new File("/path/to/emptyDirectory");
        directory2.delete();

        // Mover archivo de un directorio a otro
        File directory3 = new File("/path/sourceFile.txt");
        directory3.renameTo(new File("/path/destFile.txt"));

        // Verificar si es un directorio
        directory3.isDirectory();

        // Obtener el path absoluto a un directorio
        directory3.getAbsolutePath();

        // Obtener el directorio padre
        directory3.getParent();

        // Verificar permisos
        directory3.canRead();
        directory3.canWrite();
        directory3.canExecute();

        // Cambiar permisos
        directory3.setReadable(true);
        directory3.setWritable(false);
        directory3.setExecutable(true);

        // Checar el espacio de un directorio
        directory3.getFreeSpace();
        directory3.getUsableSpace();
        directory3.getTotalSpace();

        // Listar archivos en un directorio con filtro
        File dir = new File("/path/to/directory"); 
        FilenameFilter textFileFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        File[] files1 = dir.listFiles(textFileFilter);
        if (files1 != null) {
            for (File file : files1) {
                System.out.println("Found text file: " + file.getName());
            }
        }
        

    }

    // Copiar archivo a otro directorio
    public static void copyFile(File source, File dest) throws IOException {
        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
    }

    // Eliminar directorio recursivamente
    public static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteDirectory(f);
                } else {
                    f.delete();
                }
            }
        }
        directory.delete();
    }
}
