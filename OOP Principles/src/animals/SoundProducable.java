package animals;

public interface SoundProducable {
    default void produceSound() {
        System.out.println("Not implemented!");
    }
}
