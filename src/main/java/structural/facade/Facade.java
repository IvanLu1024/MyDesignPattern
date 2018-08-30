package structural.facade;

public class Facade {
    private SubSystem subSystem=new SubSystem();

    public void watchMovies(){
        subSystem.turnOnTv();
        subSystem.setCD(" 泰坦尼克号 CD");
        subSystem.starWatching();

    }

}
