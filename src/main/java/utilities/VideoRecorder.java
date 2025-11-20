package utilities;

import org.monte.screenrecorder.ScreenRecorder;
import org.monte.media.Format;
import org.monte.media.math.Rational;

import java.awt.*;
import java.io.File;

import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

public class VideoRecorder {

    private static ScreenRecorder screenRecorder;

    /**
     * Start video recording for a given folder and scenario name
     */
    public static ScreenRecorder startRecording(File folder, String scenarioName) throws Exception {

        if (!folder.exists()) {
            folder.mkdirs();
        }

        GraphicsConfiguration gc = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getDefaultScreenDevice()
                .getDefaultConfiguration();

        screenRecorder = new SpecializedScreenRecorder(
                gc,
                new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()),
                new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                        QualityKey, 1.0f,
                        KeyFrameIntervalKey, 15 * 60),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black"),
                null,
                folder,
                scenarioName.replaceAll("[^a-zA-Z0-9.-]", "_")
        );

        screenRecorder.start();
        return screenRecorder;
    }

    /**
     * Stop recording
     */
    public static void stopRecording() throws Exception {
        if (screenRecorder != null) {
            screenRecorder.stop();
        }
    }
}
