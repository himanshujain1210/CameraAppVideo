package cameraappvideo.cameraappvideo;

import android.hardware.Camera;

/**
 * Created by himanshujain on 22-03-2015.
 */
public class CameraHelper {

    /** A safe way to get an instance of the Camera object. */
    public static Camera getCameraInstance(){
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }
}
