package ClassWork.Lessons_20_per_29.L_24_AbstractDefaultStaticMethods.Interface_implement;

public class test02 {
    jumpAble01 j1 = new human();
    jumpAble01 j2 = new animal();
}

class human implements jumpAble01 {
    @Override
    public void jump() {
        System.out.println("Human jumps");
    }
}

class animal implements jumpAble01 {
    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface jumpAble {
    void jump();
}

