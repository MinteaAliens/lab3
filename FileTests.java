import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class FileTests {

    @Test
    public void FileTest1() throws IOException {
        List<File> result = new ArrayList<>();
        File file1 = new File("some-files/a.txt");
        File file2 = new File("some-files/more-files/b.txt");
        File file3 = new File("some-files/more-files/c.java");
        File file4 = new File("some-files/even-more-files/d.java");
        File file5 = new File("some-files/even-more-files/a.txt");

        result.add(file1);
        result.add(file2);
        result.add(file3);
        result.add(file4);
        result.add(file5);

        File start = new File("some-files/");

        assertArrayEquals(result.toArray(), FileExample.getFiles(start).toArray());
    }

    @Test
    public void FileTest2() throws IOException{
        List<File> result = new ArrayList<>();
        File file1 = new File("some-files/more-files/b.txt");
        File file2 = new File("some-files/more-files/c.java");

        result.add(file1);
        result.add(file2);

        File start = new File("some-files/more-files");

        assertArrayEquals(result.toArray(), FileExample.getFiles(start).toArray());
    }

    @Test
    public void FileTest3() throws IOException{
        List<File> result = new ArrayList<>();
        
        File start = new File("some-files/a.txt");

        result.add(start);

        assertArrayEquals(result.toArray(), FileExample.getFiles(start).toArray());
    }
}
