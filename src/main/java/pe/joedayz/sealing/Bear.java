package pe.joedayz.sealing;

public sealed class Bear permits
            Kodiak, Panda{
}


final class Kodiak extends Bear{

}

non-sealed class Panda extends Bear{

}

class HijoPanda extends Panda{}
class OtroPanda extends Panda{}
class UltimoPanda extends Panda{}