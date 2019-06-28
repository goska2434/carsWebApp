package sda.soft.academy.cars.carDTO;

public class CarDTO {
    //id, VIN, marka, model, opis, data_produkcji

    private Long id;
    private String VIN;
    private String brand;
    private String model;
    private String description;
    private Integer yearOfProduction;

    public CarDTO() {
    }

    public CarDTO(Long id, String VIN, String brand, String model, String description, Integer yearOfProduction) {
        this.id = id;
        this.VIN = VIN;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.yearOfProduction = yearOfProduction;
    }

    public Long getId() {
        return id;
    }

    public String getVIN() {
        return VIN;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }
}
