package controller;

import model.Story;
import view.StoryView;

public class StoryController {

    private Story model;
    private StoryView view;

    public StoryController(Story model, StoryView view) {
        this.model = model;
        this.view = view;
    }

    public void startStory() {

        view.showMessage("Welcome to Interactive Story: " + model.getTitle());
        view.showScenes(model.getScenes());

        int choice = view.getUserChoice();

        if (choice > 0 && choice <= model.getScenes().size()) {
            view.showMessage("You selected: " +
                    model.getScenes().get(choice - 1).getContent());
        } else {
            view.showMessage("Invalid choice!");
        }
    }
}