package utilities;

import org.monte.screenrecorder.ScreenRecorder;
import java.awt.*;
import java.io.File;
import org.monte.media.Format;

public class SpecializedScreenRecorder extends ScreenRecorder {

    private String name;

    public SpecializedScreenRecorder(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat,
                                     Format screenFormat, Format mouseFormat, Format audioFormat,
                                     File movieFolder, String name) throws Exception {
        super(cfg, captureArea, fileFormat, screenFormat, mouseFormat, audioFormat, movieFolder);
        this.name = name;
    }

    @Override
    protected File createMovieFile(Format fileFormat) {
        if (!movieFolder.exists()) {
            movieFolder.mkdirs();
        }
        return new File(movieFolder, name + ".avi");
    }
}
