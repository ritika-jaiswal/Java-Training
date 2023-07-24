package org.example.mcqapp.core.data;

import org.example.mcqapp.core.model.Mcq;
import org.example.mcqapp.core.repository.JsonDataRepository;

public enum MCQDataEnum {
    JSON,
    DATABASE,
    PROPERTIES_FILE,
    HARDCODED;


    public Mcq get() {
        if (this == JSON) {
            return new JsonDataRepository().getDataFrom("C:\\Users\\DELL\\Desktop\\JavaTraining\\src\\main\\resources\\data.json");
        } else {
            throw new RuntimeException("Functionality not yet implemented!!");
        }
    }
}
