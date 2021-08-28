package Homeworks.HomeworkLessonThree;

public class Main {
    public static void main(String[] args) {
        Dogs Pug = new Dogs();
        Dogs Retriever = new Dogs();
        Dogs Mastiff = new Dogs();

        Pug.weight = "7 kg";
        Pug.height = "0.3 m";
        Pug.sound = "Snore";
        Pug.lifeSpan = 14;
        Pug.isDomestic = true;

        Retriever.weight = "35 kg";
        Retriever.height = "0.6 m";
        Retriever.sound = "Bark";
        Retriever.lifeSpan = 11;
        Retriever.isDomestic = true;

        Mastiff.weight = "80 kg";
        Mastiff.height = "0.8 m";
        Mastiff.sound = "Woof";
        Mastiff.lifeSpan = 8;
        Mastiff.isDomestic = false;

        System.out.println("Pug's sound: " + Pug.getSound());
        System.out.println("Retriever's height: " + Retriever .getHeight());
        System.out.println("Mastiff's weight: " + Mastiff.getWeight());
    }
}