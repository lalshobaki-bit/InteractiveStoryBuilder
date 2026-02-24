package model;

import java.util.ArrayList;
import java.util.List;

public class Story {

    private String title;
    private List<Scene> scenes;

    public Story(String title) {
        this.title = title;
        this.scenes = new ArrayList<>();
    }

    public void addScene(Scene scene) {
        scenes.add(scene);
    }

    public String getTitle() {
        return title;
    }

    public List<Scene> getScenes() {
        return scenes;
    }
}
