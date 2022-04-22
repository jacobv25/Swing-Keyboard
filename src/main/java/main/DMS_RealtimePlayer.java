package main;

import org.jfugue.pattern.Pattern;
import org.jfugue.realtime.RealtimePlayer;
import org.jfugue.theory.Note;

import javax.sound.midi.MidiUnavailableException;

public class DMS_RealtimePlayer {
    private static DMS_RealtimePlayer instance;
    private static RealtimePlayer player;

    private DMS_RealtimePlayer() throws MidiUnavailableException {
        player = new RealtimePlayer();
    }

    public static DMS_RealtimePlayer getInstance() throws MidiUnavailableException {
        if(instance == null){
            instance = new DMS_RealtimePlayer();
        }
        return instance;
    }

    public void startNote(Note note){
        player.startNote(note);
    }

    public void play(Pattern pattern){
        player.play(pattern);
    }

}
