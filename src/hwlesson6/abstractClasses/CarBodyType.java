package hwlesson6.abstractClasses;

public enum CarBodyType {

    SEDAN("For everyone"),
    STATION_VAGON("For every situation"),
    HATCHBACK("For young people"),
    MINIVAN("For large family");

    private String status;

    private CarBodyType(String status){
        this.status = status;
    }
}
