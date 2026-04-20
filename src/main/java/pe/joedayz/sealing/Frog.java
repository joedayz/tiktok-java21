package pe.joedayz.sealing;

public sealed class  Frog permits GlassFrog {
}

final class GlassFrog extends Frog {
}

//class PlasticFrog extends Frog {
//}