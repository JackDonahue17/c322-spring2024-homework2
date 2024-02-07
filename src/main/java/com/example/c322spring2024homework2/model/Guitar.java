package com.example.c322spring2024homework2.model;

public class Guitar {
    String serialNumber;
    double price;
    Builder builder;
    String model;
    Type type;
    Wood backWood;
    Wood topWood;

    public Guitar(String serialNumber, double price, Builder builder,
                  String model, Type type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder stringToBuilder(String builder){
        if(builder.equals("Fender")) {
            return Builder.FENDER;
        } else if(builder.equals("Martin")) {
            return Builder.MARTIN;
        } else if(builder.equals("Gibson")) {
            return Builder.MARTIN;
        } else if(builder.equals("Collings")) {
            return Builder.MARTIN;
        } else if(builder.equals("Olson")) {
            return Builder.MARTIN;
        } else if(builder.equals("Ryan")) {
            return Builder.MARTIN;
        } else if(builder.equals("PRS")) {
            return Builder.PRS;
        } else if(builder.equals("Unspecified")) {
            return Builder.ANY;
        }
        return null;
    }

    public Type stringToType(String type) {
        if(type.equals("acoustic")) {
            return Type.ACOUSTIC;
        } else if(type.equals("electric")) {
            return Type.ELECTRIC;
        } else if(type.equals("unspecified")) {
            return null;
        }
        return null;
    }

    public Wood stringToWood(String wood) {
        if(wood.equals("Indian Rosewood")) {
            return Wood.INDIAN_ROSEWOOD;
        } else if(wood.equals("Brazilian Rosewood")) {
            return Wood.BRAZILIAN_ROSEWOOD;
        } else if(wood.equals("Mahogany")) {
            return Wood.MAHOGANY;
        } else if(wood.equals("Maple")) {
            return Wood.MAPLE;
        } else if(wood.equals("Cocobolo")) {
            return Wood.COCOBOLO;
        } else if(wood.equals("Cedar")) {
            return Wood.CEDAR;
        } else if(wood.equals("Adirondack")) {
            return Wood.ADIRONDACK;
        } else if(wood.equals("Alder")) {
            return Wood.ALDER;
        } else if(wood.equals("Sitka")) {
        return Wood.SITKA;
    }
        return null;
    }

    public String getSerialNumber() { return serialNumber; }
    public double getPrice() { return price; }
    public Builder getBuilder() { return builder; }
    public String getModel() { return model; }
    public Type getType() { return type; }
    public Wood getBackWood() { return backWood; }
    public Wood getTopWood() { return topWood; }

    public enum Builder {
        FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

        public String toString() {
            switch(this) {
                case FENDER: return "Fender";
                case MARTIN: return "Martin";
                case GIBSON: return "Gibson";
                case COLLINGS: return "Collings";
                case OLSON: return "Olson";
                case RYAN: return "Ryan";
                case PRS: return "PRS";
                default: return "Unspecified";
            }
        }
    }

    public enum Type {
        ACOUSTIC, ELECTRIC;

        public String toString() {
            switch(this) {
                case ACOUSTIC: return "acoustic";
                case ELECTRIC: return "electric";
                default: return "unspecified";
            }
        }
    }

    public enum Wood {
        INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO,
        CEDAR, ADIRONDACK, ALDER, SITKA;

        public String toString() {
            switch(this) {
                case INDIAN_ROSEWOOD: return "Indian Rosewood";
                case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
                case MAHOGANY: return "Mahogany";
                case MAPLE: return "Maple";
                case COCOBOLO: return "Cocobolo";
                case CEDAR: return "Cedar";
                case ADIRONDACK: return "Adirondack";
                case ALDER: return "Alder";
                case SITKA: return "Sitka";
                default: return "unspecified";
            }
        }
    }
}
