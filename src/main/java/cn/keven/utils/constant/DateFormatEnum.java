package cn.keven.utils.constant;

public enum DateFormatEnum {

    DATE_FORMAT_1("yyyy-MM-dd HH:mm:ss"),
    DATE_FORMAT_2("yyyyMMddHHmmssSSS"),
    DATE_FORMAT_3("yyyyMMddHHmmss"),
    ;

    private String formatValue;

    DateFormatEnum(String formatValue) {
        this.formatValue = formatValue;
    }

    public String getFormatValue() {
        return formatValue;
    }

    public void setFormatValue(String formatValue) {
        this.formatValue = formatValue;
    }
}
