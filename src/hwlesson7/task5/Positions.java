package hwlesson7.task5;

public enum Positions {

    HEAD_OF_DEPARTMENT(1),
    HEAD_ECONOMIST(2),
    HEAD_LOWYER(3),
    CHEIF_PERSONNEL_OFFICER(4),
    MANAGER(5),
    SECRETARY(6);

    private int ID;

    private Positions(int ID){
        this.ID = ID;
    }

}//enum ends


