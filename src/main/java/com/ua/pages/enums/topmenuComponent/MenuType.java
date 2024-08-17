package com.ua.pages.enums.topmenuComponent;

public enum MenuType {
    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave"),
    TIME("Time"),
    RECRUITMENT("Recruitment"),
    MYINFO("My Info"),
    PERFORMANCE("Performance"),
    DASHBOARD("Dashboard"),
    DIRECTORY("Directory");
    private final String name;

    public String getName() {
        return name;
    }

    MenuType(String name){
        this.name=name;
    }
}
