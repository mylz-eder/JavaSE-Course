    package session6;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@ToString
@SuperBuilder

public abstract class Car {
    private int modelNumber, yearOfProduction, price, milesPerGallon;
    private String name, series, Colour, fuel;
    private boolean automaticTransmission;

}
