package org.example.solid.principal.concept;

public class VideoFile implements MediaFile, VideoPlayer{
    @Override
    public void play() {
        System.out.println("Playing Video player...");
    }

    @Override
    public void playVideo() {
        play();
    }
}
