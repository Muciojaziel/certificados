package com.certificados.api.domain.enums;

public enum CursoStatusEnum {
    CONCLUIDO(1, "Concluído"),
    NAO_CONCLUÍDO(2, "Não concluído");

    private Integer code;
    private String value;

    CursoStatusEnum(Integer code, String value){
        this.code = code;
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
