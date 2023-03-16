interface IPlayer {
    // what to do ?
    void walk();        // internally - public abstract void walk();
    void run();
    void jump();
    void punch();
    void kick();

    int JUMP_HEIGHT = 100;  // public static final int JUMP_HEIGHT
}

// interface IPlayerCommon {
//     void walk();        // internally - public abstract void walk();
//     void run();
//     void jump();
// }

interface ISuperPower {
    void invisible();
    void fly();
}

abstract class Common implements IPlayer {
    @Override
    public void walk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'walk'");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public void jump() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jump'");
    }

}

class King  extends Common implements IPlayer, ISuperPower{

    @Override
    public void punch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'punch'");
    }

    @Override
    public void kick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }

    @Override
    public void invisible() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'invisible'");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

}

class Paul extends Common implements IPlayer {
    
    @Override
    public void punch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'punch'");
    }

    @Override
    public void kick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }
}

class Eddy extends Common implements IPlayer {

    @Override
    public void punch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'punch'");
    }

    @Override
    public void kick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }
}

class Bryan extends Common implements IPlayer {

    @Override
    public void punch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'punch'");
    }

    @Override
    public void kick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        
    }
}
