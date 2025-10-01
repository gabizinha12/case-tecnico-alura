package br.com.alura.AluraFake.dtos;

import org.hibernate.validator.constraints.Length;

import br.com.alura.AluraFake.task.OpenTextTask;
import br.com.alura.AluraFake.task.Type;
import jakarta.validation.constraints.NotNull;

public class NewOpenTextTaskDTO {


    public Type type = Type.OPEN_TEXT;
    @NotNull
    @Length(min = 4, max = 255)
    public String statement;

    @Deprecated
    public NewOpenTextTaskDTO() {}

    public NewOpenTextTaskDTO(Type type, @NotNull @Length(min = 4, max = 255) String statement) {
        this.type = type;
        this.statement = statement;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }


    public OpenTextTask toEntity() {
        return new OpenTextTask(type, statement);
    }
    
    
    
}
