package lib;

import java.io.File;

public class FileResource {
    public FileResource(File file) {
        initRead(file);
    }

    public Iterable<String> lines () {
        return new TextIterable(mySource, "\\n");
    }

    // Create from a given File
    private void initRead(File f) {
        try {
            initRead(f.getCanonicalPath());
        }
        catch (Exception e) {
            throw new ResourceException("FileResource: cannot access " + f);
        }
    }
}