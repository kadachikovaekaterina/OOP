package OOPDZ6;

import javax.swing.text.View;

import OOPDZ6.controller.NoteController;
import OOPDZ6.models.FileOperation;
import OOPDZ6.models.FileOperationImpl;
import OOPDZ6.models.NoteManager;
import OOPDZ6.models.NoteManagerImpl;
import OOPDZ6.views.NoteAdder;
import OOPDZ6.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        
        FileOperation fileOperation = new FileOperationImpl("OOPDZ6//notes.txt"); 
        NoteManager noteManagerImpl = new NoteManagerImpl(fileOperation);
        NoteController noteController = new NoteController(noteManagerImpl);
        NoteAdder noteAdder = new NoteAdder();
        ViewNote view = new ViewNote(noteController, noteAdder );
        view.run();
    }
}
