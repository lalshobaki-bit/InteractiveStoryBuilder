package view;

import model.Scene;
import java.util.List;
import java.util.Scanner;

public class StoryView {

    private Scanner scanner = new Scanner(System.in);

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showScenes(List<Scene> scenes) {
        for (int i = 0; i < scenes.size(); i++) {
            System.out.println((i + 1) + ". " + scenes.get(i).getContent());
        }
    }

    public int getUserChoice() {
        System.out.print("Choose a scene number: ");
        return scanner.nextInt();
    }
}
