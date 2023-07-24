package org.example.mcqapp.core.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.mcqapp.core.model.Mcq;
import org.example.mcqapp.core.model.Question;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class JsonDataRepository {

    public Mcq getDataFrom(String filePath){
        try (Reader reader = new FileReader(filePath)) {
            Gson gson = new Gson();
            Type type = new TypeToken<List<Question>>() {
            }.getType();

            List<Question> questions = Collections.unmodifiableList(gson.fromJson(reader, type));

            return new Mcq(questions);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
