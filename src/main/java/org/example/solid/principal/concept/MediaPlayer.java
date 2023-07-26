package org.example.solid.principal.concept;

public class MediaPlayer {
    private final MediaFile mediaFile;

    public MediaPlayer(MediaFile mediaFile){
        this.mediaFile = mediaFile;
    }

    public void playMedia(MediaFile mediaFile){
        mediaFile.play();
    }
}
