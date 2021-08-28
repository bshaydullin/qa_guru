package Homeworks.HomeworkLessonThree;

public class Dogs {

    String weight;
    String height;
    String sound;
    int lifeSpan;
    boolean isDomestic;

    public Dogs(String weight, String height, String sound, int lifeSpan, boolean isDomestic) {
        this.weight = weight;
        this.height = height;
        this.sound = sound;
        this.lifeSpan = lifeSpan;
        this.isDomestic = isDomestic;
    }

    public Dogs() {
    }

    String getWeight() {
        return weight;
    }

    String getHeight() {
        return height;
    }

    String getSound() {
        return sound;
    }

    void setLifeSpan (int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
