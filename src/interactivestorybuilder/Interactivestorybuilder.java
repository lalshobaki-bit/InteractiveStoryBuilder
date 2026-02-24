package interactivestorybuilder;

import model.Story;
import model.Scene;
import view.StoryView;
import controller.StoryController;

public class Interactivestorybuilder {

    public static void main(String[] args) {

        Story story = new Story("Adventure Story");

        story.addScene(new Scene("Enter the forest"));
        story.addScene(new Scene("Explore the castle"));
        story.addScene(new Scene("Return home"));

        StoryView view = new StoryView();

        StoryController controller = new StoryController(story, view);

        controller.startStory();
    }
}
