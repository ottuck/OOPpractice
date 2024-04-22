package com.lotto;

public enum AnsiColorCode {
    RESET("\u001B[0m"),	//변화된 색상이 RESET부분까지만 적용되도록 하는 역할을 합니다.
    YELLOW("\u001B[33m"),
    GREEN("\u001B[32m"),
    BLUE("\u001B[34m");

    private final String code;

    AnsiColorCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
