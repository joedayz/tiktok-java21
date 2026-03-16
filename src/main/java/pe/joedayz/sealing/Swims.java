package pe.joedayz.sealing;

public sealed interface Swims permits Duck, Swan,
                Floats{
}


final class Duck implements Swims{}
sealed class Swan implements Swims
        permits HijoSwan {}
non-sealed class HijoSwan extends Swan{}

non-sealed interface Floats extends Swims{}