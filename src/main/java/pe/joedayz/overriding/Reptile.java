package pe.joedayz.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Reptile {

    protected void sleep() throws IOException{}

    protected void hide(){}

    protected void exitShell() throws FileNotFoundException{}
}

class GalapagosTortoise extends Reptile{
    protected void sleep() throws FileNotFoundException{}

    protected void hide()  {}

    public void exitShell() throws RuntimeException{}
}
