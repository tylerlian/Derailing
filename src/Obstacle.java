import processing.core.PImage;

import java.util.List;
import java.util.Optional;

public class Obstacle extends AbstractEntity {

    public Obstacle(String id, Point position, List<PImage> images) {
        super(id, position, images, 0, "obstacle");
    }

}
