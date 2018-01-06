package jp.yattom.sbs.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@EnableAutoConfiguration
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private NoteRepository noteRepository;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        Note note = new Note();
        note.setNote("new note: " + new Date());
        noteRepository.save(note);
        Iterable<Note> notes = noteRepository.findAll();
        String response = "Notes: \n";
        for (Note n: notes) {
           response += "[" + n.getNote() + "]\n";
        }
        return response;
    }
}

