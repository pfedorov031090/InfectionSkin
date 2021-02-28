package lesson20_infection;

public enum CellType {
    HEALTHY ("|+|"), IMMUNITY ("|*|"), INFECTED ("|-|");

    private String psevdo;

    CellType(String psevdo) {
        this.psevdo = psevdo;
    }

    @Override
    public String toString() {
        return psevdo;
    }
}
