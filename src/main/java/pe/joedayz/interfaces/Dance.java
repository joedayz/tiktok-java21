package pe.joedayz.interfaces;

public interface Dance {

    default int getRythm(){
        return 3;
    }
}


class SpeedSnake implements Dance{
    static void move() {
        var snake = new SpeedSnake();
        System.out.println(snake.getRythm());

    }

    @Override
    public int getRythm() {
        return Dance.super.getRythm();
    }
}


class BigCat  implements Walk, Run {
    @Override
    public int getSpeed() {
        return Walk.super.getSpeed();
    }
}


