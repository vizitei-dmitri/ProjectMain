package project;

public enum MenuOption {

    LOGIN(2),
    REGISTER(1),
    SHOW(4),
    ADD(3),
    QUIT(5),
    ERROR(10);

    public Integer getValue() {
        return value;
    }
    final int value;

    MenuOption(int value) {
        this.value = value;
    }
}