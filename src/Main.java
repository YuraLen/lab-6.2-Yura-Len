public class Main {
    public static void main(String[] args) {
        ModelOfCar BMW5Series = new ModelOfCar("BMW", "5 series");
        ModelOfCar MercedesC63 = new ModelOfCar("Mercedes-Benz", "C63");
        ModelOfCar AudiA6 = new ModelOfCar("Audi", "A6");

        EngineOfCar BMW5SeriesBaseEngine = new EngineOfCar("B48B20", 2.0, 249, 9000);
        EngineOfCar BMW5SeriesPremiumEngine = new EngineOfCar("B58B30", 3.0, 340, 15000);
        EngineOfCar MercedesC63BaseEngine = new EngineOfCar("M139", 2.0, 470, 27000);
        EngineOfCar MercedesC63PremiumEngine = new EngineOfCar("M313", 4.0, 592, 35000);
        EngineOfCar AudiA6BaseEngine = new EngineOfCar("A414B2", 1.8, 220, 10000);
        EngineOfCar AudiA6PremiumEngine = new EngineOfCar("A612B12", 4.2, 421, 19500);

        SalonEquipment BMW5SeriesBaseEquipment = new SalonEquipment("в базовій комплектації", 30000, "МКПП");
        SalonEquipment BMW5SeriesPremiumEquipment = new SalonEquipment("в преміум комплектації", 50000, "АКПП");
        SalonEquipment MercedesC63BaseEquipment = new SalonEquipment("в базовій комплектації", 50000, "АКПП");
        SalonEquipment MercedesC63PremiumEquipment = new SalonEquipment("в преміум комплектації", 70000, "АКПП");
        SalonEquipment AudiA6BaseEquipment = new SalonEquipment("в базовій комплектації", 35000, "МКПП");
        SalonEquipment AudiA6PremiumEquipment = new SalonEquipment("в мреміум комплектації", 52000, "АКПП");


        System.out.printf("Обираючи %s %s %s, Ви отримаєте автомобіль на %s з мотором %s, об'м якого %.1fл. та %d кінських сил. Вартість автомобіля буде %d$ .%n",
                BMW5Series.brand, BMW5Series.model, BMW5SeriesPremiumEquipment.classOfEquipment, BMW5SeriesPremiumEquipment.transmision,
                BMW5SeriesPremiumEngine.modelOfEngine, BMW5SeriesPremiumEngine.capacity, BMW5SeriesPremiumEngine.horsePower,
                BMW5SeriesPremiumEquipment.priceOfEquipment + BMW5SeriesPremiumEngine.enginePrice);
    }
}