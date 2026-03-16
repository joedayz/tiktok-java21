package pe.joedayz.sealing;

public sealed class Snake permits Snake.Cobra {

    final class Cobra extends Snake{}
}

