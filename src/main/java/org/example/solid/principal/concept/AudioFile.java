package org.example.solid.principal.concept;

public class AudioFile implements MediaFile, AudioPlayer {
    @Override
    public void play() {
        System.out.println("Playing audio file...");
    }

    @Override
    public void playAudio() {
        play();
    }
}
